package com.example.services;

import java.util.List;
import java.util.UUID;

import com.example.entity.StaffOnProjects;

public interface StaffOnProjectsService{
	StaffOnProjects findByIdStaffOnProjects(UUID id);
	
	StaffOnProjects findByProjectId(UUID id);

	void saveStaffOnProjects(StaffOnProjects a);

	void updateStaffOnProjects(StaffOnProjects a);

	void deleteStaffOnProjectsById(UUID id);

	void deleteAllStaffOnProjects();

	List<StaffOnProjects> findAllStaffOnProjects();

	boolean isStaffExist(StaffOnProjects staffonprojects);
	

}
