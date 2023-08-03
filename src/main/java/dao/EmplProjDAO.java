package dao;



import entity.EmplProj;


import java.sql.SQLException;
import java.util.List;

public interface EmplProjDAO {
    // === CREATE
    void add(EmplProj emplProj) throws SQLException;

    // === READ
    List<EmplProj> getAll() throws SQLException;
    EmplProj getByEmployeeIdAndProjectId(Long employeeId, Long projectId) throws
            SQLException;

    // === UPDATE
    void update(EmplProj emplProj) throws SQLException;

    // === DELETE
    void remove(EmplProj emplProj) throws SQLException;
}
