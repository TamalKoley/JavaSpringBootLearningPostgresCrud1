package com.tamal;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {
    private  SoftwareEngineerRepository ser;

    public SoftwareEngineerService(SoftwareEngineerRepository ser) {
        this.ser = ser;
    }

    public  void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        ser.save(softwareEngineer);
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers(){
        return ser.findAll();
    }

    public SoftwareEngineer findSoftwareEngineerById(Integer id) {
        return ser.findById(id).orElseThrow(()-> new IllegalStateException(id + "Not Found")); //lambda
    }
}
