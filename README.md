**CRUD Application with Java Spring Boot and MySQL**

**Overview:**

This CRUD (Create, Read, Update, Delete) application is built using Java Spring Boot for the backend and MySQL as the database. It allows you to perform basic CRUD operations on a set of entities, demonstrating the fundamental concepts of building a web application.

**Prerequisites:**

Make sure you have the following installed on your system:

Java Development Kit (JDK), Apache Maven, MySQL Database Server

**Setup:**

*Clone the Repository:*

git clone https://github.com/mrzift/library-system

*Database Configuration:*

Create a MySQL database and update the application.properties file in the src/main/resources folder with your database credentials.
Example application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password

*Build and Run the Application from the IDE.*

*Access the Application:*

Open your web browser and navigate to http://localhost:8080. You should see the home page of the CRUD application.

**Usage:**

*Create:*
Click on the "Add" button to create a new entity.
Fill in the required information in the form and click "Save."

*Read:*
The home page displays a list of existing entities.
Click on the entity to view its details.

*Update:*
Click on the "Edit" button next to an entity to modify its information.
Update the details in the form and click "Save."
