package com.example.repository;

import java.util.UUID;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.entity.StaffOnProjects;

public interface StaffOnProjectsRepository extends CrudRepository<StaffOnProjects, UUID> {
	@Query("SELECT * FROM staff_on_projects WHERE project_id = ?0 ALLOW FILTERING")
	Iterable<StaffOnProjects> findByProject_id(UUID project_id);
	
}
