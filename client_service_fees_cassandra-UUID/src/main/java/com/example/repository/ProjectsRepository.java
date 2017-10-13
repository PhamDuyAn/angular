package com.example.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Projects;

public interface ProjectsRepository extends CrudRepository<Projects, UUID>{


	
}
