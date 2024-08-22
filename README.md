# Makersharks API

The Makersharks API provides functionality to search for suppliers based on various criteria, including location, nature of business, and manufacturing processes. It supports pagination for efficient data retrieval and is built with Spring Boot and MongoDB.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Endpoints](#endpoints)
  - [Get All Suppliers](#get-all-suppliers)
  - [Filter Suppliers](#filter-suppliers)
- [Entities](#entities)
  - [Supplier](#supplier)
  - [Filter](#filter)
- [Pagination](#pagination)
- [Running the Application](#running-the-application)
- [Testing with Postman](#testing-with-postman)
- [License](#license)

## Introduction

The Makersharks API is designed to assist users in finding suppliers based on specific criteria. It offers a robust search capability and pagination to manage large sets of data. This API is built using Spring Boot for the backend and MongoDB for the database.

## Features

- Search suppliers based on location, nature of business, and manufacturing processes.
- Paginate results to handle large data sets efficiently.
- Retrieve a list of all suppliers.
- Use of Lombok for reducing boilerplate code.

## Endpoints

### Get All Suppliers

- **URL:** `/api/supplier`
- **Method:** `GET`
- **Description:** Retrieve a list of all suppliers.
- **Response:**
  - **Status Code:** `200 OK`
  - **Body:** A JSON array of all suppliers in the database.

### Filter Suppliers

- **URL:** `api/supplier/query?pageNumber=0&pageSize=1`
- **Method:** `POST`
- **Description:** Filter suppliers based on location, nature of business, and manufacturing processes with pagination support.
- **Request Parameters:**
  - `pageNumber` (optional, default: `0`): The page number to retrieve.
  - `pageSize` (optional, default: `10`): The number of suppliers per page.
- **Request Body:**
  ```json
  {
  "location": "Chennai",
  "natureOfBusiness": "SMALL_SCALE",
  "manufacturingProcesses": ["CASTING"]
  } 

  OR

  {
  "location": "Mumbai",
  "natureOfBusiness": "MEDIUM_SCALE",
  "manufacturingProcesses": ["CASTING","3D_PRINTING"]
  }

### Response
- **Status Code** `200 OK`
- **Body** `A paginated JSON array of suppliers matching the filter criteria.`

### Entities
- **Supplier**
<br>
Fields:
<br>

`id (ObjectId): Unique identifier for the supplier.`
`supplierId (String): Identifier for the supplier.`
`companyName (String): Name of the supplier company.`
`website (String): Website of the supplier.`
`location (String): Location of the supplier.`
`natureOfBusiness (String): Nature of business of the supplier.`
`manufacturingProcesses (List<String>): List of manufacturing processes the supplier is involved in.`

### Filter
`Represents the filter criteria for searching suppliers.`
- **Fields**
`location (String): Location to filter by.`
`natureOfBusiness (String): Nature of business to filter by.`
`manufacturingProcesses (List<String>): List of manufacturing processes to filter by.`


### Pagination
`Pagination is implemented in the filter method of the supplierService class. The API supports two parameters for pagination:`

`pageNumber: The page number to retrieve (0-based index).`
`pageSize: The number of items per page.`
`The Pageable object is used in the service layer to handle pagination efficiently.`


### Running the Application

- **Clone the Repository:**
```git clone https://github.com/KaranSinghChauhan2002/MakersShark.git```

### Navigate to the Project Directory:
```cd makersharks-api```

### Build the Application:

```./mvnw clean install```

### Run the Application:

```./mvnw spring-boot:run```

### Access the API:
`The API will be available at http://localhost:8080.`

### Testing with Postman

### Get All Suppliers
`Method: GET`
`URL: http://localhost:8080/api/supplier`

### Filter Suppliers

`Method: POST`
`URL: http://localhost:8080/api/supplier/query?pageNumber=0&pageSize=1`
- **Headers:**
`Content-Type: application/json`
`Body`
```
{
  "location": "Chennai",
  "natureOfBusiness": "SMALL_SCALE",
  "manufacturingProcesses": ["CASTING"]
}
``` 
