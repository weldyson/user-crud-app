# **User CRUD App**

A complete CRUD (Create, Read, Update, Delete) application built with Spring Boot, perfect for developers looking to enhance their portfolio with a practical Java backend project.

## **🚀 Technologies Used**

- **Java 17** (JDK 17)
- **Spring Boot**
- **H2 Database** (In-memory database)
- **Spring Data JPA**
- **Lombok** (Reduces boilerplate code)
- **Maven** (Dependency management)

## **📚 What You'll Learn**

This project demonstrates:

- How to structure a Spring Boot project
- Practical implementation of CRUD operations (Create, Read, Update, Delete)
- H2 database configuration and usage
- Spring Data JPA for database operations
- Lombok annotations to reduce boilerplate code
- REST API development best practices

## **🛠️ Features**

- Complete CRUD operations for entities
- In-memory H2 database for development
- RESTful API endpoints
- Data persistence with Spring Data JPA
- Automatic code generation with Lombok

## **📋 Prerequisites**

Before running this project, make sure you have:

- Java JDK 17 or higher
- Maven 3.6+
- Your favorite IDE (IntelliJ IDEA, Eclipse, or VS Code)

## **🚀 Getting Started**

### **Installation & Running the Application**

1. **Clone the repository**
    
    bash
    
    ```
    git clone <repository-url>
    cd spring-boot-crud
    ```
    
2. **Build the project**
    
    bash
    
    ```
    mvn clean install
    ```
    
3. **Run the application**
    
    bash
    
    ```
    mvn spring-boot:run
    ```
    

The application will start on `http://localhost:8080`

## **📊 H2 Database Console**

When the application is running, you can access the H2 database console at:

text

```
http://localhost:8080/h2-console
```

**Connection details:**

- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: `(leave empty)`

## **🎯 API Endpoints**

The application provides standard CRUD endpoints for managing resources:

- `GET /api/resources` - Get all resources
- `GET /api/resources/{id}` - Get resource by ID
- `POST /api/resources` - Create new resource
- `PUT /api/resources/{id}` - Update existing resource
- `DELETE /api/resources/{id}` - Delete resource

## **🏗️ Project Structure**

text

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── crud/
│   │               ├── controller/     # REST controllers
│   │               ├── model/          # Entity classes
│   │               ├── repository/     # Data repositories
│   │               ├── service/        # Business logic
│   │               └── Application.java
│   └── resources/
│       ├── application.properties      # Configuration
│       └── data.sql                   # Initial data (optional)
```

## **💡 Why This Project?**

This CRUD application is an essential portfolio piece because it demonstrates:

- **Backend Development Skills**: Shows proficiency in Java and Spring Boot
- **Database Knowledge**: Experience with JPA and database operations
- **REST API Design**: Understanding of REST principles and HTTP methods
- **Software Architecture**: Clean separation of concerns with layered architecture
- **Development Tools**: Familiarity with Maven, Lombok, and modern Java development

## **🔧 Customization**

You can easily customize this project by:

1. Adding new entities and relationships
2. Implementing authentication and authorization
3. Adding validation and error handling
4. Integrating with different databases
5. Adding unit and integration tests

## **🤝 Contributing**

Feel free to fork this project and submit pull requests for any improvements.
