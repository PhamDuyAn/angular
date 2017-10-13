package com.example.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.RefRoles;

public interface RefRolesRepository extends CrudRepository<RefRoles, UUID> {

}
