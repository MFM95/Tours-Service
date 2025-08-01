# Spring Boot Backend Boilerplate

This is a reusable boilerplate for backend services built using **Spring Boot**, **Kotlin**, and **PostgreSQL**. It provides a clean and extensible foundation for RESTful APIs with clear layering and OpenAPI documentation.

---

## 🚀 Tech Stack

- **Kotlin** — concise and expressive JVM language
- **Spring Boot** — modern framework for building microservices
- **Spring Data JPA** — easy database access with repository pattern
- **PostgreSQL** — robust open-source relational database
- **OpenAPI (Swagger)** — standardized API documentation
- **Gradle** — for build and dependency management

---

## ✅ Features

- Modular Layered Clean Architecture
  - Infrastructure  
- Database integration with PostgreSQL
- OpenAPI specification using annotations
- Error handling and HTTP response management
- Ready-to-use resource endpoints (GET all, GET by ID, ...etc)
- Easily extendable for any new entity/domain
---

## 📂 Project Structure


📦 src

└── 📂 main
 
    ├── 📂 kotlin
    
    │   └── 📂 mainpackage
    
    │       ├── 📂 infrastructure
    
    │       │   ├── 📂 controllers         # HTTP endpoints (e.g., TourController)
    
    │       │   ├── 📂 db
    
    │       │   │   ├── 📂 models          # JPA entities mapped to DB tables
    
    │       │   │   └── 📂 access          # Spring Data JPA Repositories or DAO
    
    │       │   ├── 📂 repositories        # Interfaces for external data sources
    
    │       │   └── 📂 converters          # Transformations between layers (Entity ↔ DTO)
    
    │       │
    
    │       ├── 📂 application
    
    │       │   ├── 📂 usecases            # Application-specific logic and orchestrations
    
    │       │   └── 📂 models              # Request/Response models and DTOs
    
    │       │
    
    │       └── 📂 domain
    
    │           └── 📂 contracts           # Domain interfaces or service contracts
    
    │
    
    └── 📂 resources
    
        ├── application.yml               # Main configuration (DB, server, etc.)
        
        └── openapi.yaml                  # OpenAPI specification

        


