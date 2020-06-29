package com.aop.service;

import com.aop.model.Employee;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

    public Employee createEmployee(int empId, String name, String address) {

        Employee emp = new Employee();
        emp.setName(name);
        emp.setEmpId(empId);
        emp.setAddress(address);
        return emp;
    }

    public void deleteEmployee(int empId) {

    }
}