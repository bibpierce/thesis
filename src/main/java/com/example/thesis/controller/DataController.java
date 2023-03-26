package com.example.thesis.controller;


import com.example.thesis.model.DataModel;
import com.example.thesis.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DataController {

    @Autowired
    DataService dataService;

    @PostMapping("/post-all-data")
    public ResponseEntity<List<DataModel>> getAllData(){
        return new ResponseEntity<>(dataService.getAllData(), HttpStatus.OK);
    }

//    @PostMapping("/post-data")
//    public ResponseEntity<Data> getData(){
//        return new ResponseEntity<>(dataService.getLatestData(), HttpStatus.OK);
//    }


}
