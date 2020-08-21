package com.gerardosantana.CRUDRest.dao;

import com.gerardosantana.CRUDRest.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> findAll();

    public void save(Employee employee);

    public Employee findById(int id);

    public void deleteById(int id);

}
