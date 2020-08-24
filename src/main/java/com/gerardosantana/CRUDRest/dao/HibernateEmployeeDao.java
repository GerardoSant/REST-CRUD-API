package com.gerardosantana.CRUDRest.dao;

import com.gerardosantana.CRUDRest.entity.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class HibernateEmployeeDao implements EmployeeDao{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> findAll() {
        Session session  = entityManager.unwrap(Session.class);
        return session.createQuery("from Employee").getResultList();
    }

    @Override
    public void save(Employee employee) {
        Session session  = entityManager.unwrap(Session.class);
        session.saveOrUpdate(employee);
    }

    @Override
    public Employee findById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Employee.class, id);
    }

    @Override
    public void deleteById(int id) {
        Session session = entityManager.unwrap(Session.class);
        session.remove(session.get(Employee.class,id));
    }
}
