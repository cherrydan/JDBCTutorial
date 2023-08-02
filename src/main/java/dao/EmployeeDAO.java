package dao;


import entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    // === CREATE
    void add(Employee employee);

    // === READ
    List<Employee> getAll();
    Employee getById(Long id);

    // === UPDATE
    void update(Employee employee);

    // === DELETE
    void remove(Employee employee);
}
