package com.springdemo.demospring.Service;

import com.springdemo.demospring.Entity.Employee;
import com.springdemo.demospring.Error.EmployeeNotFoundException;
import com.springdemo.demospring.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServ  {
    @Autowired
    private EmployeeRepo Emp;
    public Employee saveEmp(Employee E){
        return Emp.save(E);
    }

    public List<Employee> getallEmp(){
        return (List<Employee>) Emp.findAll();

    }

    public Optional<Employee> getbyidEmp(int id) throws EmployeeNotFoundException {
        Optional<Employee> E = Emp.findById(id);
        if(!E.isPresent()){
            throw new EmployeeNotFoundException("Empolyee not there in this ID");
        }
        return E;
    }


    public void delEmp(int id) throws EmployeeNotFoundException {
        Optional<Employee> E = Emp.findById(id);
        if(!E.isPresent()){
            throw new EmployeeNotFoundException("Empolyee Not deleted bcz no employee");
        }
        else {
        Emp.deleteById(id);}
    }
}
