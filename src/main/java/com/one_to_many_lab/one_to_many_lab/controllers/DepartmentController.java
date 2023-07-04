package com.one_to_many_lab.one_to_many_lab.controllers;

import com.one_to_many_lab.one_to_many_lab.models.Department;
import com.one_to_many_lab.one_to_many_lab.models.Employee;
import com.one_to_many_lab.one_to_many_lab.repositories.DepartmentRepository;
import com.one_to_many_lab.one_to_many_lab.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

//@RestController
//public class DepartmentController {
//    @Autowired
//    DepartmentRepository departmentRepository;
//
//    @GetMapping("/departments")
//    public List<Department> getAllDepartments(){
//        return departmentRepository.findAll();
//    }
//
//    @GetMapping("/departments/{id}")
//    public Optional<Department> getDepartment(@PathVariable Long id){
//        return departmentRepository.findById(id);
//    }
//}
