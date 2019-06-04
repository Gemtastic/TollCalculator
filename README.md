# Toll Calculator

This is a small sample REST-based application for the lulz. The application simulated an API for a road camera to connect to to register car passing through toll stations for road tax. It also features an API for getting a current total of your toll fees.

## Technology
* Java 11
* Wildfly 16
* JAX-RS
* Docker
* PostgreSQL
* JDBC
* Maven

## Setup
Edit the database username, password and link in `src/main/resources/Application.properties`.

## Run
Run the `scripts/create.sh` script.

## Develop
Redeploy your app into a new running containter while one is running by running `scripts/redeploy.sh`. The script requires there to be a war in `target/`.

Compile using

```
mvn clean package
```

## API
TBD
