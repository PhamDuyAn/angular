package com.example.services;

import java.util.List;

import com.example.entity.Projects;


public interface ProjectsService{
	
	Projects findByProject_id(int id);

	void saveProjects(Projects projects);

	void updateProjects(Projects projects);

	void deleteProjectsById(int id);

	void deleteAllProjects();

	List<Projects> findAllProjeccts();

	boolean isProjectsExist(Projects projects);

}
