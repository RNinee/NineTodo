# My First Todo App

## Overview

This is a full-stack web application for managing personal todo lists, built as a learning project to explore the Spring Boot ecosystem. The application demonstrates modern Java web development practices, including MVC architecture, ORM with JPA, security implementation, and containerized database deployment.

## What This Project Does

The application allows users to:
- Register and authenticate securely
- Create and manage personal todo items
- Set target dates for task completion
- Edit and update existing todos
- Delete completed or unwanted tasks
- View todos in a clean, responsive interface

All data is persisted in a PostgreSQL database, ensuring todos are saved between sessions.

## Technical Architecture

This project showcases a traditional Spring Boot MVC application with server-side rendering:

**Backend (Java/Spring Boot)**
- **Spring MVC** - Handles HTTP requests and routing
- **Spring Security** - Manages authentication and authorization
- **Spring Data JPA** - Simplifies database operations with repository pattern
- **Hibernate** - ORM for mapping Java objects to database tables

**Frontend (JSP)**
- **JSP & JSTL** - Server-side view rendering
- **Bootstrap 5** - Responsive UI components
- **jQuery** - Client-side interactivity
- **Bootstrap Datepicker** - Date selection widget

**Database**
- **PostgreSQL 16** - Relational database for persistent storage
- **Docker Compose** - Containerized database deployment

**Build & Deployment**
- **Maven** - Dependency management and build automation
- **Spring Boot DevTools** - Hot reload during development

## Technologies & Tools

- Java 25
- Spring Boot 3.5.7
- Maven
- PostgreSQL 16
- Docker Compose

## Project Structure

```
myfirsttodoapp/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/firsttodo/springboot/myfirsttodoapp/
│   │   │       ├── security/        # Spring Security configuration
│   │   │       ├── todo/            # Todo entity, repository, service, controller
│   │   │       ├── login/           # Welcome/login controllers
│   │   │       └── hello/           # Sample controller
│   │   └── resources/
│   │       ├── application.properties  # Application configuration (excluded from git)
│   │       └── META-INF/
│   └── test/
├── pom.xml
└── docker-compose.yml               # Docker configuration (excluded from git)
```


## Project Purpose

This is a demonstration project created to learn and practice Spring Boot development. It covers key concepts including:
- Building RESTful web applications with Spring MVC
- Implementing security with Spring Security
- Database integration using Spring Data JPA
- Server-side rendering with JSP
- Containerized development with Docker
- Maven project structure and dependency management

## Learning Resources

- [Java Learning Notes & Documentation](https://storm-smartphone-b7d.notion.site/Java-298e9bb85aa7809f9b35fb0c0b21417f) - notes and references creating during development

