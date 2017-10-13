package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
