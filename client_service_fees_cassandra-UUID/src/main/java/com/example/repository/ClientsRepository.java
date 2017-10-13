package com.example.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Clients;

public interface ClientsRepository extends CrudRepository<Clients, UUID> {

}
