package com.example.controller;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Projects;
import com.example.entity.Staff;
import com.example.entity.StaffOnProjects;
import com.example.error.CustomErrorType;
import com.example.services.ProjectsService;
import com.example.services.StaffOnProjectsService;
import com.example.services.StaffService;

@RestController
@RequestMapping("/api")
public class RestApiController {
	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired
	private StaffService staffservice;
	
	@Autowired
	private StaffOnProjectsService staffonprojectservice;
	
	@Autowired
	private ProjectsService projectservice;
	
//	@RequestMapping(value = "/projects_staff_ref_roles/{idproject}", method = RequestMethod.GET)
//	public ResponseEntity<?> getProjects_staff_ref_roles(@PathVariable("id") UUID idproject) {
//		logger.info("Fetching Staff with id {}", idproject);
//		StaffOnProjects staffOnProjects = staffonprojectservice.findByProjectId(idproject);
//		
//		if (staffOnProjects == null) {
//			logger.error("Staff with id {} not found.", idproject);
//			return new ResponseEntity(new CustomErrorType("Staff with id " + idproject 
//					+ " not found"), HttpStatus.NOT_FOUND);
//		}
//		Projects projects = projectservice.findByProject_id(idproject);
//		Staff staff = staffservice.findByIdStaff(staffOnProjects.getStaffid());
//		return new ResponseEntity<Staff>(staff, HttpStatus.OK);
//	}
	
	
}
