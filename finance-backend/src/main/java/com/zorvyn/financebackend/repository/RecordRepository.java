package com.zorvyn.financebackend.repository;

import com.zorvyn.financebackend.model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecordRepository {

    @Autowired
    private JdbcTemplate jdbc;

    // SAVE RECORD
    public void save(Record record){

        String sql = "INSERT INTO records(amount,type,category,date,notes,user_id,email) VALUES(?,?,?,?,?,?,?)";

        jdbc.update(sql,
                record.getAmount(),
                record.getType(),
                record.getCategory(),
                record.getDate(),
                record.getNotes(),
                record.getUserId(),
                record.getEmail() == null ? "admin@zorvyn.com" : record.getEmail()
        );
    }

    // GET ALL RECORDS
    public List<Record> findAll(){

        String sql = "SELECT * FROM records";

        return jdbc.query(
                sql,
                new BeanPropertyRowMapper<>(Record.class)
        );
    }

    // GET RECORDS BY EMAIL
    public List<Record> findByEmail(String email){

        String sql = "SELECT * FROM records WHERE email=?";

        return jdbc.query(
                sql,
                new BeanPropertyRowMapper<>(Record.class),
                email
        );
    }
}