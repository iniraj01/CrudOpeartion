# HibernateCrudOperations

A Java project that performs CRUD (Create, Read, Update, Delete) operations on a MySQL database using Hibernate ORM. It is built with Maven.

## Tech Stack

| Area | Technology |
| --- | --- |
| Language | Java 8 |
| ORM | Hibernate Core 5.6.15.Final |
| Database | MySQL (driver: MySQL Connector/J 8.0.33) |
| Build tool | Maven |
| Testing | JUnit |
| IDE | Eclipse (with the m2e Maven plugin) |

## CRUD Operations

- **Create**: save a new record to the database
- **Read**: fetch one or many records
- **Update**: modify an existing record
- **Delete**: remove a record

## Prerequisites

- JDK 8 or higher
- Maven 3.6 or higher
- MySQL Server running locally (or reachable on your network)

## Setup

1. Clone the repository:

   ```bash
   git clone <repository-url>
   cd HibernateCrudOperations
   ```

2. Create the database in MySQL:

   ```sql
   CREATE DATABASE <your_database_name>;
   ```

3. Open the Hibernate configuration and set your own database URL, username and password.

4. Build the project:

   ```bash
   mvn clean install
   ```

5. Run the main class from Eclipse (Run As > Java Application), or from the command line:

   ```bash
   mvn compile exec:java -Dexec.mainClass="<your.main.Class>"
   ```

## Project Structure

```
HibernateCrudOperations
├── src/main/java        application source code
├── src/main/resources   Hibernate configuration
├── src/test/java        unit tests
└── pom.xml              Maven dependencies and build settings
```

## Notes

- Do not commit real database passwords. Keep your local credentials out of version control.
- Maven coordinates: `paswan.in:HibernateCrudOperations:1.0`

## Author

Niraj
