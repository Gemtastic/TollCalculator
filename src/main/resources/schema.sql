CREATE DATABASE toll_calculator;
CREATE USER calculator WITH PASSSWORD 'secretpassword';

CREATE TABLE VehicleType(
  ID serial PRIMARY KEY,
  type VARCHAR(255) NOT NULL,
  tollable BOOLEAN NOT NULL
);

CREATE TABLE toll_rate(
  ID serial PRIMARY KEY,
  rate INTEGER NOT NULL,
  name VARCHAR(255) NOT NULL,
  valid_from DATE NOT NULL,
  valid_through DATE NOT NULL
);

CREATE TABLE vehicle(
  ID serial PRIMARY KEY,
  vehicle_type INTEGER REFERENCES VehicleType(ID),
  license_plate VARCHAR(255) NOT NULL
);

CREATE TABLE checkpoint(

);