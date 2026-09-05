package com.tamal;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService ses;

    public SoftwareEngineerController(SoftwareEngineerService ses) {
        this.ses = ses;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return ses.getAllSoftwareEngineers();



    }
    @PostMapping
    public void addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer){
        ses.insertSoftwareEngineer(softwareEngineer);
    }

    @GetMapping("{id}")
    public SoftwareEngineer getSoftwareEngineerById(@PathVariable  Integer id){
        return ses.findSoftwareEngineerById(id);

    }


}
