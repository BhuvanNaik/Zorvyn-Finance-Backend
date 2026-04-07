# Zorvyn Finance Backend 

A full-featured backend system for managing financial records, users, and role-based access for a finance dashboard. Built using **Spring Boot**, **JDBC**, **MySQL**, and **Maven**.

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
- **Database:** MySQL.
- **Build Tool:** Maven
- **Frontend:** HTML, CSS, Bootstrap, JS (Dashboard prototype)

---

## 🚀 How to Run

1. Clone the repo:
    ```bash
      git clone https://github.com/BhuvanNaik/Zorvyn-Finance-Backend.git
      cd finance-backend
    ```
 2️. Create MySQL database (replace password as needed)
   ```bash
      mysql -u root -p -e "CREATE DATABASE finance_db;"
    ```
3. Update database credentials in application.properties
   ```bash
      nano src/main/resources/application.properties
   ```
 Example content:
  ```bash
  spring.datasource.url=jdbc:mysql://localhost:3306/finance_db
  spring.datasource.username=root
  spring.datasource.password=yourpassword
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  ```

5. Build the project with Maven
 ```bash
  mvn clean install
  ```

5. Run the Spring Boot application
 ```bash
  mvn spring-boot:run
  ```

6. Open the frontend in browser (adjust path if needed)
 ```bash

  xdg-open src/main/resources/static/index.html  # Linux
                       OR
  open src/main/resources/static/index.html      # macOS
                       OR
  manually open index.html in browser on Windows
```

7. Test the features:
 - Login using an email/password from DB
 - Add records (Income / Expense)
 - Verify dashboard summary updates automatically
