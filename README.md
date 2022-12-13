<p align="center">
	<img src="https://user-images.githubusercontent.com/101653735/202849820-dfeaabcf-4dd9-4452-a847-5a767462fd9d.png" >
</p>

# Implementation of Web Services based on JAX-WS and REST JAX-RS

This is an implementation of a variety of Web Services based on several architectures. During this workshop we implement 3 specific architectures: JAX-WS, JAX-RS, Jersey, the main role of these Web Services is to guarantee a good management of stations and fuel prices.

**Tools :** Eclipse, Maven, Tomcate, MySQL, JAX-WS, JAX-RS.

## Table of contents
[Part 1](#part-1)
* [Class Diagram](#class-diagram)
* [Database Schema](#database-schema)
* [Project Structure](#project-structure)
* [Dependencies Used in this Project](#dependencies-used-in-this-project)
* [Connection with the Database](#connection-with-the-database)

[Part 2](#part-2)
* [Project Structure](#project-structure-1)
* [Dependencies Used in this Project](#dependencies-used-in-this-project-1)

[Testing the Application](#testing-the-application)
* [Stations List](#stations-list)
* [Add Station](#add-station)
* [Fuel List](#fuel-list)
* [Add Histogram of fuel](#add-histogram-of-fuel)
* [Histogram of fuel List](#histogram-of-fuel-list)
* [Compare the price of the two fuel](#compare-the-price-of-the-two-fuel)

## Part 1

### Class Diagram

The class diagram used to implement this web application composed of two classes and one association class "Station", "Carburant" and "HistoCarb":

<p align="center">
	<img width="936" alt="Class Diag" src="https://user-images.githubusercontent.com/101653735/207182904-8c7fbd7d-6ec9-4445-a9b2-a460b8263f40.png">
</p>

### Database Schema

<p align="center">
	<img width="791" alt="Schema bdd" src="https://user-images.githubusercontent.com/101653735/207183227-8d667ba0-1e71-45b3-b86f-b50980b98e74.png">
</p>

### Project Structure

We create a Java Project to implement the Web Services JAX-WS:

<p align="center">
	<img width="220" alt="Part 1" src="https://user-images.githubusercontent.com/101653735/207268667-e5a4dd60-91f8-4b08-97a4-cec4c9eb10a6.png">
</p>

### Dependencies Used in this Project

We convert the project to a maven project and we've added in the ```pom.xml``` file the following dependencies:

```
<dependencies>
	<dependency>
		<groupId>org.glassfish.metro</groupId>
		<artifactId>metro-project</artifactId>
		<version>2.4.0</version>
		<type>pom</type>
	</dependency>
	<dependency>
		<groupId>com.sun.xml.ws</groupId>
		<artifactId>rt</artifactId>
		<version>2.3.2</version>
	</dependency>
	<dependency>
		<groupId>mysql</groupId>
		<artifactId>mysql-connector-java</artifactId>
		<version>8.0.22</version>
	</dependency>
	<dependency>
		<groupId>org.eclipse.persistence</groupId>
		<artifactId>eclipselink</artifactId>
		<version>2.5.1</version>
	</dependency>
	<dependency>
		<groupId>org.eclipse.persistence</groupId>
		<artifactId>javax.persistence</artifactId>
		<version>2.0.0</version>
	</dependency>
</dependencies>
```

### Connection with the Database

To connect to the database we have to add the  ```persistence.xml``` file in ```src/META-INF``` repository of our project :

```
<?xml version="1.0" encoding="UTF-8"?>
<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" version="2.2"
	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_2.xsd">
	<persistence-unit name="unit" transaction-type="RESOURCE_LOCAL">
		<class>ma.fstt.entities.Station</class>
		<class>ma.fstt.entities.Carburant</class>
		<class>ma.fstt.entities.HistoCarb</class>
		<properties>
			<property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver" />
			<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/gestionstation" />
			<property name="javax.persistence.jdbc.user" value="root" />
			<property name="javax.persistence.jdbc.password" value="" />
			<property name="eclipselink.ddl-generation" value="create-tables" />
		</properties>
	</persistence-unit>
</persistence>
```

## Part 2

### Project Structure

We create a Dynamique Web Project as a Client Project to call all the method of the Web Service:

<p align="center">
	<img width="220" alt="Part 2" src="https://user-images.githubusercontent.com/101653735/207275643-b5106a1a-c31d-4ae0-9ec5-799b9a160a88.png">
</p>

### Dependencies Used in this Project

We convert the project to a maven project and we've added in the ```pom.xml``` file the following dependencies:

```
<dependencies>
	<dependency>
		<groupId>com.sun.xml.ws</groupId>
		<artifactId>rt</artifactId>
		<version>2.3.2</version>
	</dependency>
	<dependency>
		<groupId>org.glassfish.metro</groupId>
		<artifactId>metro-project</artifactId>
		<version>2.4.0</version>
		<type>pom</type>
	</dependency>
	<dependency>
		<groupId>javax.servlet</groupId>
		<artifactId>servlet-api</artifactId>
		<version>2.3</version>
		<scope>provided</scope>
	</dependency>
	<dependency>
		<groupId>javax.servlet</groupId>
		<artifactId>jstl</artifactId>
		<version>1.2</version>
	</dependency>
</dependencies>
```

## Testing the Application

### Stations List

In the list station we have a station "Afriquia" so let's add another station:

<p align="center">
	<img width="960" alt="2" src="https://user-images.githubusercontent.com/101653735/207278113-e47ddef7-a882-4ee4-b067-04f412af2e90.png">
</p>

### Add Station

To add a new station you have to click the link "Ajouter Nouveau Station":

<p align="center">
	<img width="960" alt="3" src="https://user-images.githubusercontent.com/101653735/207278524-5049efac-6423-4090-bab5-ad427052f2a2.png">
</p>

We added a new station "Total":

<p align="center">
	<img width="960" alt="4" src="https://user-images.githubusercontent.com/101653735/207278838-d5bdee1a-a700-4c13-a206-51544b37750e.png">
</p>

### Fuel List

In the list station we have two fuel(Carburant) "Gasoil" and "Essence" we added them the same way we did with station:

<p align="center">
	<img width="960" alt="2" src="https://user-images.githubusercontent.com/101653735/207278113-e47ddef7-a882-4ee4-b067-04f412af2e90.png">
</p>

### Add Histogram of fuel

To add an Histogram of fuel we have to enter the "date", "price", "station id" and "carburant id":

<p align="center">
	<img width="960" alt="6" src="https://user-images.githubusercontent.com/101653735/207279899-7b79c20d-3ff0-40f1-9737-0386d2221634.png">
</p>

### Histogram of fuel List

So we get this list:

<p align="center">
	<img width="960" alt="7" src="https://user-images.githubusercontent.com/101653735/207280286-306177b3-02b5-4f0c-b81e-f873128b8505.png">
</p>

### Compare the price of the two fuel

We can compare the price of the two fuel "Gasoil" and "Essence" based on a station and date:

<p align="center">
	<img width="960" alt="8" src="https://user-images.githubusercontent.com/101653735/207285303-10c1b182-becf-40f4-b5be-a547de30f26d.png">
</p>

We enter a station name and a date and we get the price of "Gasoil" and "Essence" in this station for a given date:

<p align="center">
	<img width="960" alt="9" src="https://user-images.githubusercontent.com/101653735/207281428-667ec62a-c627-4671-a796-a7f44e72d540.png">
</p>
