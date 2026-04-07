package com.zorvyn.financebackend.controller;

import com.zorvyn.financebackend.model.Record;
import com.zorvyn.financebackend.service.RecordService;
import com.zorvyn.financebackend.util.RoleUtil;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/records")
@CrossOrigin
public class RecordController {

    @Autowired
    private RecordService service;

    @PostMapping
    public String create(@RequestBody Record r){

        service.createRecord(r);

        return "Record created";
    }

    @GetMapping
    public List<Record> getAll(){

        return service.getAll();

    }
}