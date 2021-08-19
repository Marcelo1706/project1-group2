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
    foreign key (airlineId) references Airline(airlineId) ON UPDATE CASCADE 
);

CREATE TABLE Flight(
    flightId int not null auto_increment primary key,
    flightNumber varchar(50) not null,
    originCountry varchar(50) not null,
    originCity varchar(50) not null,
    destinationCountry varchar(50) not null,
    destinationCity varchar(50) not null,
    departureTime timestamp not null,
    arrivalTime timestamp not null,
    aircraftId int not null,
    foreign key (aircraftId) references Aircraft(aircraftId) ON UPDATE CASCADE
);

CREATE TABLE FlightStatus(
    flightStatusId int not null auto_increment primary key,
    flightId int not null,
    flightStatus varchar(20) not null,
    flightLog varchar(500) not null,
    foreign key (flightId) references Flight(flightId) ON UPDATE CASCADE
);

CREATE TABLE Mail(
    mailId int not null auto_increment primary key,
    recipient varchar(100) not null,
    emailAddress varchar(255) not null
)