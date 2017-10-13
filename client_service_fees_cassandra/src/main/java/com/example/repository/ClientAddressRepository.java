package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.ClientAddresses;

public interface ClientAddressRepository extends CrudRepository<ClientAddresses,String > {

}
