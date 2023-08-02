package dao;


import entity.Project;

import java.util.List;

public interface ProjectDAO {

    // === CREATE
    void add(Project project);

    // === READ
    List<Project> getAll();
    Project getById(Long id);

    // === UPDATE
    void update(Project project);

    // === DELETE
    void remove(Project project);
}
