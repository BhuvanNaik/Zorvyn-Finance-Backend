package com.zorvyn.financebackend.service;

import com.zorvyn.financebackend.model.Record;
import com.zorvyn.financebackend.repository.RecordRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepository repo;

    // CREATE RECORD
    public void createRecord(Record record){
        repo.save(record);
    }

    // GET ALL RECORDS
    public List<Record> getAll(){
        return repo.findAll();
    }

    // GET RECORDS BY EMAIL
    public List<Record> getByEmail(String email){
        return repo.findByEmail(email);
    }

}