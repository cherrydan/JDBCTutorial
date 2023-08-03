package dao;


import entity.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    // === CREATE
    void add(Employee employee) throws SQLException;

    // === READ
    List<Employee> getAll() throws SQLException;
    Employee getById(Long id) throws SQLException;

    // === UPDATE
    void update(Employee employee) throws SQLException;

    // === DELETE
    void remove(Employee employee) throws SQLException;
}
