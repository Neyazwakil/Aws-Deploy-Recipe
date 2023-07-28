# Recipe Management Application


## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Recipe Management Application is a web-based system designed to manage diffrent recipes. It allows user to add, update, and delete recipe information.

## Features

- View a list of all recipes.
- View details of a specific recipe by its ID.
- Add a new recipe to the system.
- Update an existing recipes details.
- Delete a recipes from the system.
- Make  comment  on  recipes .


## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Mysql DataBase


## Getting Started

To run the Recipe Management Application locally, follow these steps:

1. Clone the repository: `git clone https://github.com/your-username/Hotel-management.git`
2. Navigate to the project directory: `cd hotel-management`
3. If you are using an IDE, import the project as a Maven project.
4. Build the application: `mvn clean install`
5. Run the application: `mvn spring-boot:run`
6. The application will start, and you can access it at `http://localhost:8080`

## Configuration

The application configuration can be found in the `application.properties` file. You may need to modify the database connection settings, server port, or any other properties based on your requirements.

## Usage

Once the application is up and running, you can access the following endpoints:

- GetMapping `recipe` - View a list of all recipe.
- GetMapping `recipe/{id}` - View details of a specific recipe by its ID 
- PostMapping `recipe ` - Add a new new recipe to the system .
- PutMapping`recipe/{id}` - Update an existing recipe details by Id .
- DeleteMapping`recipe/{id}` - Delete a recipes from the system by using Id.
- PostMapping `comment/{recipeid}` - add the comment in the system regarding specific recipes  ;
- DeleteMapping ` comment/{commentId}` -delete comment from System by commentId;

- `/h2-console` - Access the H2 database console (Development only).
- `/` - Homepage (if applicable).

## API Documentation

API documentation is generated automatically using SpringDoc and can be accessed at `http://localhost:8080/swagger-ui.html` (when the application is running). It provides detailed information about the available REST endpoints, request parameters, and responses.

## Contributing

We welcome contributions to improve the Recipe  Management Application. If you find any issues or want to add new features, please create a pull request, and we will review it together.




## Done by 

- Name: [neyazwakil](https://github.com/Neyazwakil/gitassign)

- Twitter: [neyazwakil2](https://twitter.com/your_twitter_id)
- github:  [neyazwakil8271](https://github.com/)


## Done by 

- Name: [neyazwakil](https://github.com/Neyazwakil/gitassign)

- Twitter: [neyazwakil2](https://twitter.com/your_twitter_id)
- github:  [neyazwakil8271](https://github.com/)

