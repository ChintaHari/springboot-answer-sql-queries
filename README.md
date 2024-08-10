# SpringBoot SQL Query Answer Service

## Introduction
This Spring Boot application is designed to dynamically answer SQL queries based on a predefined schema and dataset. It uses an AI model to generate SQL queries from natural language questions and executes them on an embedded database. This service is particularly useful for anyone looking to integrate SQL query answering capabilities into their applications without deep diving into database intricacies.

## Fun to Use
The application makes it incredibly easy and fun to interact with your data. Just ask a question in plain English, and get your SQL query and results instantly! Whether you're testing database queries, learning SQL, or just curious about your data, this tool offers an engaging way to explore information.

## Key Features
- **AI-driven query generation**: Converts natural language questions into executable SQL queries.
- **Immediate query execution and results retrieval**: Executes queries and retrieves results in real-time.
- **Error handling**: Gracefully handles and responds to SQL generation errors.

## Dependencies and Requirements
To run this application, you will need:
- JDK 11 or newer
- Maven for building the project
- Spring Boot dependencies: Spring Web, Spring JDBC, etc.
- AI API Key for interfacing with the AI model that generates SQL queries.

Ensure you have the following set up:
- An `application.properties` or `application.yml` file with necessary configurations including the AI API key.
- A database setup according to the schema provided in the `schema.sql` file.
- Data inserted according to `data.sql` for meaningful interactions.

## Architecture Overview
This application is structured into several key components:
- **Controller (`SqlController`)**: Handles HTTP POST requests by receiving SQL questions and returning responses.
- **Service (`SqlService`)**: The core logic that interfaces with the AI model to transform questions into SQL queries, which are then executed.
- **Exception Handling (`SqlGenerationExceptionHandler`)**: Captures and handles exceptions related to SQL query generation, providing meaningful error responses.
- **Request and Response DTOs**: Facilitates data transfer between the client and server with structured data objects.

### Core Component
The heart of this project is the `SqlService` class. This service is responsible for:
1. Reading the DDL and DML from resources.
2. Using an AI model to convert natural language questions into SQL queries.
3. Executing these queries using `JdbcTemplate`.
4. Returning the results in a structured format.

This component ensures that the system translates user intent accurately into SQL, executes it, and returns relevant data, making it critical for the application's functionality.

## How to Test Using Postman
To test the application:
1. Start the Spring Boot application.
2. Open Postman and create a new POST request to `http://localhost:8080/sql`.
3. Set the header `Content-Type` to `application/json`.
4. In the request body, format your SQL question in JSON, for example:
   ```json
   {
     "question": "List all movies by Christopher Nolan"
   }
   ```
5. Send the request and view the generated SQL query and results in the response.

## Conclusion

This Spring Boot application is not only a showcase of integrating AI with traditional software engineering practices but also an effective tool for database management and learning. By leveraging advanced AI capabilities for SQL query generation, it provides a robust, fun, and interactive way to work with databases.
