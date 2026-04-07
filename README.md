# Zorvyn Finance Backend 

A full-featured backend system for managing financial records, users, and role-based access for a finance dashboard. Built using **Spring Boot**, **JDBC**, **MySQL/PostgreSQL**, and **Maven**.

---

## 🛠 Features

- **User Management**
  - Create and manage users
  - Assign roles (Viewer, Analyst, Admin)
  - Role-based access control

- **Financial Records**
  - Create, view, update, and delete transactions
  - Categories: Income / Expense
  - Track notes and transaction date

- **Dashboard Summary**
  - Total Income, Expense, and Net Balance
  - Aggregated data for quick insights

- **Backend Architecture**
  - Spring Boot with layered architecture: Controller → Service → Repository
  - JDBC Template for database operations
  - REST APIs with JSON responses

- **Optional Enhancements**
  - Token-based authentication (JWT)
  - Input validation and error handling
  - Cross-Origin support for frontend integration

---

## 💻 Tech Stack

- **Backend:** Java, Spring Boot, JDBC
- **Database:** MySQL / PostgreSQL
- **Build Tool:** Maven
- **Frontend:** HTML, CSS, Bootstrap, JS (Dashboard prototype)

---

## 🚀 How to Run

1. Clone the repo:
    ```bash
      git clone https://github.com/BhuvanNaik/Zorvyn-Finance-Backend.git
      cd finance-backend
2.Update application.properties with your DB credentials:
  ```bash
    spring.datasource.url=jdbc:mysql://localhost:3306/finance_db
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
3. Build and run:
  ```bash
    mvn clean install
    mvn spring-boot:run
4. Open index.html in browser and test login and dashboard features.
