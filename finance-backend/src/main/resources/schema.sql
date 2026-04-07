DROP TABLE IF EXISTS records;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(100),
                       email VARCHAR(100) UNIQUE,
                       password VARCHAR(100),
                       role VARCHAR(20),
                       is_active BOOLEAN DEFAULT TRUE
);

CREATE TABLE records (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         amount DOUBLE,
                         type VARCHAR(10),
                         category VARCHAR(50),
                         date DATE,
                         notes TEXT,
                         user_id INT,
                         FOREIGN KEY (user_id) REFERENCES users(id)
);