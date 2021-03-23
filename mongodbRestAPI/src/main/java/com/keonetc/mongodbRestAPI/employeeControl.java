package com.keonetc.mongodbRestAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class employeeControl {

    @Autowired
    private employeeRepository empRepository;

    @PostMapping("/addEmployee")
    public String saveEmployee(@RequestBody employee emp){
        empRepository.save(emp);
        return "Employee Added Successfully: " +emp.getId();
    }

    @GetMapping("/findAllEmployees")
    public List<employee> getEmployees() {
        return empRepository.findAll();
    }

    @GetMapping("/findAllEmployee/{id}")
    public Optional<employee> getEmployee(@PathVariable int id){
        return empRepository.findById(id);
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee (@PathVariable int id){
        empRepository.deleteById(id);
        return "Deleted Employee Successfully: " +id;
    }
}
