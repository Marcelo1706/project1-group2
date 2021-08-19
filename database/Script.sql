CREATE TABLE Country(
    countryId int not null auto_increment primary key,
    countryName varchar(50) not null
);

CREATE TABLE City(
    cityId int not null auto_increment primary key,
    cityName varchar(100) not null,
    latitude decimal(7,4) not null,
    longitude decimal(7,4) not null,
    countryId int not null,
    foreign key (countryId) references Country(countryId) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Airport(
    airportId int not null auto_increment primary key, 
    airportName varchar(50),
    cityId int not null, 
    foreign key (cityId) references City(cityId) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Airline(
    airlineId int not null auto_increment primary key,
    airlineName varchar(50)
);

CREATE TABLE Aircraft(
    aircraftId int not null auto_increment primary key,
    model varchar(50) not null,
    passengerCapacity int not null,
    fuelRange decimal(7,2),
    airlineId int not null, 
    foreign key (airlineId) references Airline(airlineId) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Flight(
    flightId int not null auto_increment primary key,
    flightNumber varchar(50) not null,
    originCityId int not null,
    destinationCityId int not null,
    departureTime timestamp not null,
    arrivalTime timestamp not null,
    aircraftId int not null,
    foreign key (aircraftId) references Aircraft(aircraftId) ON UPDATE CASCADE ON DELETE CASCADE,
    foreign key (originCityId) references City(cityId) ON UPDATE CASCADE ON DELETE CASCADE,
    foreign key (destinationCityId) references City(cityId) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE FlightStatus(
    flightStatusId int not null auto_increment primary key,
    flightId int not null,
    flightStatus varchar(20) not null,
    flightLog varchar(500) not null,
    foreign key (flightId) references Flight(flightId) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Mail(
    mailId int not null auto_increment primary key,
    recipient varchar(100) not null,
    emailAddress varchar(255) not null
);