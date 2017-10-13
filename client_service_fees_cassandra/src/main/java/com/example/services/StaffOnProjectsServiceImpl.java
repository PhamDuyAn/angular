package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Projects;
import com.example.entity.RefRoles;
import com.example.entity.Staff;
import com.example.entity.StaffOnProjects;
import com.example.repository.ProjectsRepository;
import com.example.repository.RefRolesRepository;
import com.example.repository.ServiceRepository;
import com.example.repository.StaffOnProjectsRepository;
import com.example.repository.StaffRepository;

@Service("staffonproject")
@Transactional
public class StaffOnProjectsServiceImpl implements StaffOnProjectsService{
	@Autowired
	private StaffOnProjectsRepository staffOnProjectsRepository;
	
	@Autowired
	private ProjectsRepository projectsRepository;
	
	@Autowired
	private RefRolesRepository refRolesRepository;
	
	@Autowired
	private StaffRepository staffRepository;
	
	@Override
	public StaffOnProjects findByIdStaffOnProjects(int id) {
		// TODO Auto-generated method stub
		return staffOnProjectsRepository.findOne(id);
	}

	@Override
	public void saveStaffOnProjects(StaffOnProjects a) {
		// TODO Auto-generated method stub

		staffOnProjectsRepository.save(a);
	}

	@Override
	public void updateStaffOnProjects(StaffOnProjects a) {
		// TODO Auto-generated method stub
		staffOnProjectsRepository.save(a);
	}

	@Override
	public void deleteStaffOnProjectsById(int id) {
		// TODO Auto-generated method stub
		staffOnProjectsRepository.delete(id);
	}

	@Override
	public void deleteAllStaffOnProjects() {
		// TODO Auto-generated method stub
		staffOnProjectsRepository.deleteAll();
	}

	@Override
	public List<StaffOnProjects> findAllStaffOnProjects() {
		// TODO Auto-generated method stub
		return (List<StaffOnProjects>) staffOnProjectsRepository.findAll();
	}

	@Override
	public boolean isStaffExist(StaffOnProjects staffonprojects) {
		// TODO Auto-generated method stub
		return false;
	}

	

	

}
