package com.example.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Projects;
import com.example.repository.ProjectsRepository;


@Service
public class ProjectsServiceIpml implements ProjectsService{

	@Autowired ProjectsRepository projectsRepository;

	@Override
	public Projects findByProject_id(UUID id) {
		// TODO Auto-generated method stub
		return projectsRepository.findOne(id);
	}

	@Override
	public void saveProjects(Projects projects) {
		// TODO Auto-generated method stub
		projectsRepository.save(projects);
	}

	@Override
	public void updateProjects(Projects projects) {
		// TODO Auto-generated method stub
		projectsRepository.save(projects);
		
	}

	@Override
	public void deleteProjectsById(UUID id) {
		// TODO Auto-generated method stub
		projectsRepository.delete(id);
	}

	@Override
	public void deleteAllProjects() {
		// TODO Auto-generated method stub
		projectsRepository.deleteAll();
	}

	

	@Override
	public boolean isProjectsExist(Projects projects) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Projects> findAllProjeccts() {
		// TODO Auto-generated method stub
		return (List<Projects>) projectsRepository.findAll();
	}

	
	

}
