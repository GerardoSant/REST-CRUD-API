package com.gerardosantana.CRUDRest.service;

import com.gerardosantana.CRUDRest.dao.EmployeeDao;
import com.gerardosantana.CRUDRest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    @Qualifier("JPAEmployeeDao")
    private EmployeeDao employeeDao;

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    @Transactional
    public Employee findById(int id) {
        return employeeDao.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        employeeDao.deleteById(id);
    }
}
