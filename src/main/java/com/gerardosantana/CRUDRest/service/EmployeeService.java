package com.gerardosantana.CRUDRest.service;

import com.gerardosantana.CRUDRest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public void save(Employee employee);

    public Employee findById(int id);

    public void deleteById(int id);

}
