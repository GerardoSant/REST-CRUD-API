package com.gerardosantana.CRUDRest.service;

import com.gerardosantana.CRUDRest.dao.EmployeeDao;
import com.gerardosantana.CRUDRest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public Employee findById(int id) {
        return employeeDao.findById(id);
    }

    @Override
    public void deleteById(int id) {
        employeeDao.deleteById(id);
    }
}
