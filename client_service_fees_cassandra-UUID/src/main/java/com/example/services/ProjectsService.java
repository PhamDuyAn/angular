package com.example.services;

import java.util.List;
import java.util.UUID;

import com.example.entity.Projects;

public interface ProjectsService{
	
	Projects findByProject_id(UUID id);

	void saveProjects(Projects projects);

	void updateProjects(Projects projects);

	void deleteProjectsById(UUID id);

	void deleteAllProjects();

	List<Projects> findAllProjeccts();

	boolean isProjectsExist(Projects projects);

}
