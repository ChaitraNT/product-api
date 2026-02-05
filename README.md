# Product API – Spring Boot Backend

This project is a simple Spring Boot RESTful API developed to manage products.
It demonstrates basic backend concepts such as controllers, services, input validation,
and in-memory data storage.

The application supports adding a product and retrieving a product by its ID.

---

## Tech Stack

- Java 21
- Spring Boot
- Spring Web
- Maven
- Embedded Tomcat Server

---

## How to Run the Application

1. Open the project in **Spring Tool Suite (STS)**
2. Ensure **Java 21** is installed and configured
3. Run the main class:

   `ProductapiApplication.java`

4. The application will start on:
http://localhost:8080


---

## API Endpoints

### 1. Add a Product

- **Endpoint:** `POST /products`
- **Description:** Adds a new product to the in-memory list

#### Request Body (JSON)

```json
{
"id": 1,
"name": "Laptop",
"description": "Dell laptop",
"price": 55000
}


Validation Rules
i. Product name must not be empty
ii. Price must be greater than zero