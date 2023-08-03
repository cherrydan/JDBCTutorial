package dao;


import entity.Project;

import java.sql.SQLException;
import java.util.List;

public interface ProjectDAO {

    // === CREATE
    void add(Project project) throws SQLException;

    // === READ
    List<Project> getAll() throws SQLException;
    Project getById(Long id) throws SQLException;

    // === UPDATE
    void update(Project project) throws SQLException;

    // === DELETE
    void remove(Project project) throws SQLException;
}
