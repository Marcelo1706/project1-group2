/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.utils;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author José Marcelo Hernández Cerritos
 */
public class ComboItem {
    @Getter @Setter private String key;
    @Getter @Setter private String value;

    public ComboItem(String key, String value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return key;
    }
}
