package dao;

import entity.Address;

import java.util.List;

public interface AddressDAO {
    // === CREATE
    void add(Address address);

    // === READ
    List<Address> getAll();
    Address getById(Long id);

    // === UPDATE
    void update(Address address);

    // === DELETE
    void remove(Address address);
}
