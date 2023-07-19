package com.springdemo.demospring;

import com.springdemo.demospring.Entity.Employee;
import com.springdemo.demospring.Error.EmployeeNotFoundException;
import com.springdemo.demospring.Service.EmployeeServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {
@Autowired
private EmployeeServ E;

@GetMapping("/GetAll")
    public List<Employee> getAll(){
    return E.getallEmp();
}

@GetMapping("/Get/{id}")
    public Optional<Employee> geetbyid(@PathVariable int id) throws EmployeeNotFoundException {
    return E.getbyidEmp(id);
}

@DeleteMapping("/Delete/{id}")
    public void deletebyid(@PathVariable int id) throws EmployeeNotFoundException {
    E.delEmp(id);
}

@PostMapping("/Add")
    public Employee Adduser( @RequestBody Employee Em){
    return E.saveEmp(Em);
}

@PutMapping("/Update/{id}")
    public Employee Update(@PathVariable int id,@RequestBody Employee Em ){
    Em.setId(id);
    return E.saveEmp(Em);
}
}
