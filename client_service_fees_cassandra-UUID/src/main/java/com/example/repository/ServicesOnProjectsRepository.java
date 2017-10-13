package com.example.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.ServicesOnProjects;

public interface ServicesOnProjectsRepository extends CrudRepository<ServicesOnProjects, UUID> {

}
