package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.entity.Staff;
import com.example.entity.StaffOnProjects;
import com.example.error.CustomErrorType;
import com.example.services.StaffOnProjectsService;

@RestController
@RequestMapping("/api")
public class StaffOnProjectsController {
	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired
	StaffOnProjectsService staffonprojectsservice;

	// -------------------Retrieve All staff on
	// projects---------------------------------------------

	// @SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/staffonprojects/", method = RequestMethod.GET)
	public ResponseEntity<List<StaffOnProjects>> ListAllStaffOnProjects() {
		List<StaffOnProjects> staff = staffonprojectsservice.findAllStaffOnProjects();
		// System.out.println("An Gay"+staff.get(0).getDailyCost());
		if (staff == null) {
			System.out.println("go herhea11111111111111111111111111111111111111111111111111111111111");
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<StaffOnProjects>>(staff, HttpStatus.OK);

	}

	// --------------------------get with id----------------------------------

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/staffonprojects/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getStaffOnProjects(@PathVariable("id") int id) {
		logger.info("Fetching Staff on Projects with id {}", id);
		StaffOnProjects staffonprojects = staffonprojectsservice.findByIdStaffOnProjects(id);
		if (staffonprojects == null) {
			logger.error("Staff with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("Staff on Projects with id " + id + " not found"),
					HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<StaffOnProjects>(staffonprojects, HttpStatus.OK);
	}

	// -------------------Create staff--------------------

	@RequestMapping(value = "/staffonprojects/", method = RequestMethod.POST)
	public ResponseEntity<?> createStaffOnProjects(@RequestBody StaffOnProjects staffonprojects,
			UriComponentsBuilder ucBuilder) {
		logger.info("Creating Staff on Projects : {}", staffonprojects);

		if (staffonprojectsservice.isStaffExist(staffonprojects)) {
			logger.error("Unable to create. A Staff on Projects on Projects with name {} already exist",
					staffonprojects.getStaff_on_project_id());
			return new ResponseEntity(new CustomErrorType("Unable to create. A Staff on Projects with name "
					+ staffonprojects.getStaff_on_project_id() + " already exist."), HttpStatus.CONFLICT);
		}
		staffonprojectsservice.saveStaffOnProjects(staffonprojects);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/staffonprojects/{id}")
				.buildAndExpand(staffonprojects.getStaff_on_project_id()).toUri());
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	// ------------------- Update-----------------------------------------------

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/staffonprojects/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateStaffOnProjects(@PathVariable("id") int id,
			@RequestBody StaffOnProjects staffonprojects) {
		logger.info("Updating Staff on Projects with id {}", id);

		StaffOnProjects currentStaffOnProjects = staffonprojectsservice.findByIdStaffOnProjects(id);

		if (currentStaffOnProjects == null) {
			logger.error("Unable to update. Staff with id {} not found.", id);
			return new ResponseEntity(
					new CustomErrorType("Unable to upate. Staff on Projects with id " + id + " not found."),
					HttpStatus.NOT_FOUND);
		}
		currentStaffOnProjects.setProject_id(staffonprojects.getProject_id());
		currentStaffOnProjects.setStaff_id(staffonprojects.getStaff_id());
		currentStaffOnProjects.setRole_code(staffonprojects.getRole_code());
		currentStaffOnProjects.setFrom_datetime(staffonprojects.getFrom_datetime());
		currentStaffOnProjects.setTo_datetime(staffonprojects.getTo_datetime());
		currentStaffOnProjects.setHourty_rate(staffonprojects.getHourty_rate());
		staffonprojectsservice.updateStaffOnProjects(currentStaffOnProjects);
		return new ResponseEntity<StaffOnProjects>(currentStaffOnProjects, HttpStatus.OK);
	}

	// ------------------- Delete----------------------------------------

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/staffonprojects/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteStaffOnProjects(@PathVariable("id") int id) {
		logger.info("Fetching & Deleting Staff on Projects with id {}", id);

		StaffOnProjects staffonprojects = staffonprojectsservice.findByIdStaffOnProjects(id);
		if (staffonprojects == null) {
			logger.error("Unable to delete. Staff on Projects with id {} not found.", id);
			return new ResponseEntity(
					new CustomErrorType("Unable to delete. Staff on Projects with id " + id + " not found."),
					HttpStatus.NOT_FOUND);
		}
		staffonprojectsservice.deleteStaffOnProjectsById(id);
		return new ResponseEntity<Staff>(HttpStatus.NO_CONTENT);
	}

	// ------------------- Delete All-----------------------------

	@RequestMapping(value = "/staffonprojects/", method = RequestMethod.DELETE)
	public ResponseEntity<StaffOnProjects> deleteAllStaffOnprojects() {
		logger.info("Deleting All ");

		staffonprojectsservice.deleteAllStaffOnProjects();
		return new ResponseEntity<StaffOnProjects>(HttpStatus.NO_CONTENT);
	}

}
