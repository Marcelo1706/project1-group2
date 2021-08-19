/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.models;

import lombok.Getter;
import lombok.Setter;
import java.sql.*;

/**
 *
 * @author JoseM
 */
public class Database {

    @Getter
    @Setter
    private Connection connection;

    public Database() {
        try {
            Class.forName("org.h2.Driver");
            this.setConnection(DriverManager.getConnection("jdbc:h2:./database/project1-group2"));
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public Object[][] select(String table, String fields, String where) {
        int records = 0;
        String colname[] = fields.split(",");
        String dataQuery = "SELECT " + fields + " FROM " + table;
        String countQuery = "SELECT count(*) AS total FROM " + table;

        if (where != null) {
            dataQuery += " WHERE " + where;
            countQuery += " WHERE " + where;

        }

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(countQuery);
            try (ResultSet result = preparedStatement.executeQuery()) {
                result.next();
                records = result.getInt("total");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        Object[][] data = new String[records][fields.split(",").length];
        try {
            PreparedStatement pstm = connection.prepareStatement(dataQuery);
            try (ResultSet result = pstm.executeQuery()) {
                int i = 0;
                while (result.next()) {
                    for (int j = 0; j <= fields.split(",").length - 1; j++) {
                        data[i][j] = result.getString(colname[j].trim());
                    }
                    i++;
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    public boolean insert(String table, String fields, String values) {
        boolean insertResult = false;
        String insertQuery = " INSERT INTO " + table + " ( " + fields + " ) VALUES ( " + values + " ) ";

        try {
            PreparedStatement pstm = connection.prepareStatement(insertQuery);
            pstm.execute();
            pstm.close();
            insertResult = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return insertResult;
    }
}
