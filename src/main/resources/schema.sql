CREATE role app WITH LOGIN PASSWORD 'abc123';
CREATE DATABASE toll_calculator owner app;
\c toll_calculator
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public TO app;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO app;

CREATE TABLE vehicle_type(
  id serial PRIMARY KEY,
  type VARCHAR(255) NOT NULL,
  tollable BOOLEAN NOT NULL
);

CREATE TABLE toll_rate(
  id serial PRIMARY KEY,
  rate INTEGER NOT NULL,
  name VARCHAR(255) NOT NULL,
  valid_from DATE NOT NULL,
  valid_through DATE NOT NULL
);

CREATE TABLE vehicle(
  id serial PRIMARY KEY,
  vehicle_type_id INTEGER REFERENCES vehicle_type(id),
  license_plate VARCHAR(255) NOT NULL
);

CREATE TABLE checkpoint(
  id serial PRIMARY KEY,
  vehicle_id INTEGER REFERENCES vehicle(id),
  passthrough date NOT NULL,
  toll_rate_id INTEGER REFERENCES toll_rate(id)
);
