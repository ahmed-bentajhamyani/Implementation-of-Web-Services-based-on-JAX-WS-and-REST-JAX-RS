<p align="center">
	<img src="https://user-images.githubusercontent.com/101653735/202849820-dfeaabcf-4dd9-4452-a847-5a767462fd9d.png" >
</p>

# Implementation of Web Services based on JAX-WS and REST JAX-RS

This is an implementation of a variety of Web Services based on several architectures. During this workshop we implement 3 specific architectures: JAX-WS, JAX-RS, Jersey, the main role of these Web Services is to guarantee a good management of stations and fuel prices.

**Tools :** Eclipse, Maven, Tomcate, JAX-WS, JAX-RS.

## Table of contents
[Part 1](#part-1)

[Configuration of WildFly's Datasource](#configuration-of-wildflys-datasource)

[Testing the Application](#testing-the-application)
* [Etudiants List](#etudiants-list)
* [Add Etudiant](#add-etudiant)
* [Update Etudiant](#update-etudiant)
* [Delete Etudiant](#delete-etudiant)

[Grouping the two projects into an Enterprise Application Projecty](#grouping-the-two-projects-into-an-enterprise-application-project)

## Class Diagram

<p align="center">
	<img width="936" alt="Class Diag" src="https://user-images.githubusercontent.com/101653735/207182904-8c7fbd7d-6ec9-4445-a9b2-a460b8263f40.png">
</p>

## Database Schema

<p align="center">
	<img width="791" alt="Schema bdd" src="https://user-images.githubusercontent.com/101653735/207183227-8d667ba0-1e71-45b3-b86f-b50980b98e74.png">
</p>

## Part 1

In the ```pom.xml``` file we add the dependencies:

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
		<groupId>javax.servlet</groupId>
		<artifactId>servlet-api</artifactId>
		<version>2.3</version>
		<scope>provided</scope>
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

### Etudiants List

We installed the JBoss Tools plugin from the Eclipse Marketplace:

<p align="center">
	<img width="960" alt="1" src="https://user-images.githubusercontent.com/101653735/205165675-a0d7e6b8-99db-4ee4-af24-ad30a92aa339.png">
</p>

## Configuration of WildFly's Datasource

First we download MySQL Connector jar file and put it in a new repository we create in ```wildfly-27.0.0.Final\modules\system\layers\base\com``` with the name ```mysql\main``` and we create also the ```modules.xml``` inside it we put this code :

```
<?xml version="1.0" encoding="UTF-8"?>
<module name="com.mysql" xmlns="urn:jboss:module:1.9">
    <resources>
        <resource-root path="mysql-connector-java-8.0.30.jar"/>
    </resources>
    <dependencies>
        <module name="javax.api"/>
    </dependencies>
</module>
```
We add the driver tag of mysql in the ```standalone.xml``` file in ```wildfly-27.0.0.Final\standalone\configuration``` repository :


```
<driver name="mysql" module="com.mysql"/>
```

In ```standalone.xml```, just above the driver snippet, we add this datasoure snippet:

```
<datasource jndi-name="java:/EtudiantDS" pool-name="EtudiantDS">
	<connection-url>jdbc:mysql://localhost:3306/getudiants
	</connection-url>
	<driver>mysql</driver>
	<security>
		<user-name>root</user-name>
		<password></password>
	</security>
	<validation>
		<valid-connection-checker
			class-name="org.jboss.jca.adapters.jdbc.extensions.mysql.MySQLValidConnectionChecker" />
		<background-validation>true</background-validation>
		<exception-sorter
			class-name="org.jboss.jca.adapters.jdbc.extensions.mysql.MySQLExceptionSorter" />
	</validation>
</datasource>
```

And add the  ```persistence.xml``` file in ```META-INF``` repository of the EJB project :

```
<?xml version="1.0" encoding="UTF-8" ?>
<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" version="2.2"
	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_2.xsd">
	<persistence-unit name="Etudiant" transaction-type="JTA">
		<jta-data-source>java:/EtudiantDS</jta-data-source>
		<class>ma.fstt.persistence.Etudiant</class>
		<properties>
			<property name="hibernate.dialect" value="org.hibernate.dialect.MySQL5Dialect" />
			<property name="hibernate.hbm2ddl.auto" value="create" />
		</properties>
	</persistence-unit>
</persistence>
```

## Testing the Application

### Etudiants List

In the first time the list of etudiants is empty:

<p align="center">
	<img width="960" alt="1" src="https://user-images.githubusercontent.com/101653735/205465195-cd223d0a-5107-410a-b228-bc7920446b79.png">
</p>

### Add Etudiant

We added a new etudiant:

<p align="center">
	<img width="960" alt="2" src="https://user-images.githubusercontent.com/101653735/205465208-6ccdb91a-35a3-4767-bd97-75ac9de9d7fb.png">
</p>

