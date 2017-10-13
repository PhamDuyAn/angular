package com.example.services;

import java.util.List;

import com.example.entity.StaffOnProjects;

public interface StaffOnProjectsService{
	StaffOnProjects findByIdStaffOnProjects(int id);

	void saveStaffOnProjects(StaffOnProjects a);

	void updateStaffOnProjects(StaffOnProjects a);

	void deleteStaffOnProjectsById(int id);

	void deleteAllStaffOnProjects();

	List<StaffOnProjects> findAllStaffOnProjects();

	boolean isStaffExist(StaffOnProjects staffonprojects);

}
