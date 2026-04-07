package com.zorvyn.financebackend.repository;

import com.zorvyn.financebackend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbc;

    // Save user
    public void save(User user) {
        String sql = "INSERT INTO users(name,email,password,role,is_active) VALUES(?,?,?,?,?)";
        jdbc.update(sql,
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                user.getRole(),
                true);
    }

    // Find user by email
    public User findByEmail(String email) {
        String sql = "SELECT * FROM users WHERE email=?";
        return jdbc.queryForObject(
                sql,
                new BeanPropertyRowMapper<>(User.class),
                email
        );
    }

    // Get all users
    public List<User> findAll() {
        String sql = "SELECT * FROM users";
        return jdbc.query(
                sql,
                new BeanPropertyRowMapper<>(User.class)
        );
    }
}