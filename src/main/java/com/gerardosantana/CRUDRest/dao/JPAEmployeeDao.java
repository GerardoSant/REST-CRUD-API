package com.gerardosantana.CRUDRest.dao;

import com.gerardosantana.CRUDRest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class JPAEmployeeDao implements EmployeeDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> findAll() {
        return entityManager.createQuery("from Employee").getResultList();
    }

    @Override
    public void save(Employee employee) {
        entityManager.merge(employee);
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class,id);
    }

    @Override
    public void deleteById(int id) {
        Query query = entityManager.createQuery("delete from Employee where id=:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}
