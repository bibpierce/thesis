package com.example.thesis.service;

import com.example.thesis.model.DataModel;
import com.example.thesis.repository.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService{

    @Autowired
    DataRepo dataRepo;

    @Override
    public List<DataModel> getAllData(){
        return dataRepo.findAll();
    }

}
