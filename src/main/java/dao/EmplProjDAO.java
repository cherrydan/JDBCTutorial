package dao;



import entity.EmplProj;


import java.util.List;

public interface EmplProjDAO {
    // === CREATE
    void add(EmplProj emplProj);

    // === READ
    List<EmplProj> getAll();
    EmplProj getByEmployeeIdAndProjectId(Long employeeId, Long projectId);

    // === UPDATE
    void update(EmplProj emplProj);

    // === DELETE
    void remove(EmplProj emplProj);
}
