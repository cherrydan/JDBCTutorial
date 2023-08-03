package dao;

import entity.Address;

import java.sql.SQLException;
import java.util.List;

public interface AddressDAO {
    // === CREATE
    void add(Address address) throws SQLException;

    // === READ
    List<Address> getAll() throws SQLException;
    Address getById(Long id) throws SQLException;

    // === UPDATE
    void update(Address address) throws SQLException;

    // === DELETE
    void remove(Address address) throws SQLException;
}
