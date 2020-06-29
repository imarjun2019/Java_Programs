package com.aop.controller;

import com.aop.model.Employee;
import com.aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/add/employee", method = RequestMethod.GET)
    public Employee addEmployee(@RequestParam("empId") int empId, @RequestParam("name") String name, @RequestParam("address") String address) {
        return employeeService.createEmployee(empId,name,address);
    }
    @RequestMapping(value = "/remove/employee", method = RequestMethod.GET)
    public String removeEmployee( @RequestParam("empId") int empId) {

        employeeService.deleteEmployee(empId);
        return "\nEmployee removed with Id: " + empId;
    }

}
