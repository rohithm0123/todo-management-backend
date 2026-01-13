# Todo Management Backend System

A **Spring Boot–based backend application** for managing todo tasks with secure user authentication and role-based authorization. This project demonstrates real-world backend development practices using **Java, Spring Boot, REST APIs, Spring Security, JPA/Hibernate, and MySQL**.

---

## 🚀 Features

* User registration and login
* Secure authentication using **Spring Security**
* Role-based authorization (USER / ADMIN)
* CRUD operations for Todo tasks
* RESTful API design following best practices
* Centralized exception handling
* Clean layered architecture (Controller → Service → Repository)

---

## 🛠️ Tech Stack

* **Language:** Java
* **Framework:** Spring Boot
* **Security:** Spring Security
* **Database:** MySQL
* **ORM:** JPA / Hibernate
* **Build Tool:** Maven
* **Version Control:** Git & GitHub
* **Tools:** IntelliJ IDEA, Postman

---

## 📂 Project Structure

```
todo-management-backend/
├── src/main/java/
│   └── com.example.demo
│       ├── controller
│       ├── service
│       ├── repository
│       ├── model
│       ├── security
│       └── TodoListApplication.java
├── src/main/resources/
│   └── application.properties
├── pom.xml
├── mvnw
├── mvnw.cmd
└── .gitignore
```

---

## ⚙️ Setup & Run Instructions

### Prerequisites

* Java 17+
* Maven
* MySQL
* Git

### Steps

```bash
# Clone the repository
git clone https://github.com/rohithm0123/todo-management-backend.git

# Navigate to project directory
cd todo-management-backend

# Configure database in application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=your_password

# Run the application
./mvnw spring-boot:run
```

Application will start at:

```
http://localhost:8080
```

---

## 🔐 Security Implementation

* Custom `UserDetailsService` for authentication
* Password encryption using `PasswordEncoder`
* Role-based access using `@PreAuthorize`
* Secured endpoints for admin and user actions

---

## 📌 API Highlights

* `POST /auth/register` – Register new user
* `POST /auth/login` – Authenticate user
* `GET /todos` – Fetch todos
* `POST /todos` – Create todo
* `PUT /todos/{id}` – Update todo


---

## 🎯 Learning Outcomes

* Built a production-style backend using Spring Boot
* Implemented authentication & authorization
* Designed REST APIs following MVC architecture
* Used Git & GitHub for version control

---

## 👨‍💻 Author

**Rohith M**
Java Backend Developer
📧 [rohithmk17102001@gmail.com](mailto:rohithmk17102001@gmail.com)
🔗 [LinkedIn](https://linkedin.com/in/java-developer-rohith)

---

⭐ If you like this project, feel free to star the repository!
