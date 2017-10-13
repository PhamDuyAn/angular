package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.entity.Projects;
import com.example.error.CustomErrorType;
import com.example.services.ProjectsService;

@Controller
@RequestMapping("/api")
public class ProjectsController {
	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
	
	@Autowired
	private ProjectsService projectsService;
	
	@RequestMapping(value = "/projects/", method = RequestMethod.GET)
	public ResponseEntity<List<Projects>> ListAllStaff() {
		List<Projects> projects = projectsService.findAllProjeccts();
		//System.out.println("An Gay"+staff.get(0).getDailyCost());
		if (projects==null) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Projects>>(projects, HttpStatus.OK);
		
	}

	// -------------------Retrieve ----------------------------------------

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/projects/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getStaff(@PathVariable("id") int id) {
		logger.info("Fetching Staff with id {}", id);
		Projects projects = projectsService.findByProject_id(id);
		if (projects == null) {
			logger.error("Projects with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("Projects with id " + id 
					+ " not found"), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Projects>(projects, HttpStatus.OK);
	}

	// -------------------Create--------------------

	@RequestMapping(value = "/projects/", method = RequestMethod.POST)
	public ResponseEntity<?> createStaff(@RequestBody Projects projects, UriComponentsBuilder ucBuilder) {
		logger.info("Creating Staff : {}", projects);

		if (projectsService.isProjectsExist(projects)) {
			logger.error("Unable to create. A Projects with name {} already exist");
			return new ResponseEntity(new CustomErrorType("Unable to create. A Projects with name  already exist."),HttpStatus.CONFLICT);
		}
		projectsService.saveProjects(projects);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/projects/{id}").buildAndExpand(projects.getProjectId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

	// ------------------- Update-----------------------------------------------

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/projects/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateStaff(@PathVariable("id") int id, @RequestBody Projects projects) {
		logger.info("Updating Projects with id {}", id);

		Projects currentpro = projectsService.findByProject_id(id);

		if (currentpro == null) {
			logger.error("Unable to update with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("Unable to upate. Projects with id " + id + " not found."),
					HttpStatus.NOT_FOUND);
		}

		currentpro.setProjectId(projects.getProjectId());
		currentpro.setClients(projects.getClients());
		currentpro.setProjectStartDate(projects.getProjectStartDate());
		currentpro.setProjectEndDate(projects.getProjectEndDate());
		currentpro.setProjectName(projects.getProjectName());
		currentpro.setProjectDescription(projects.getProjectDescription());
		currentpro.setOtherProjectDetails(projects.getOtherProjectDetails());
		projectsService.updateProjects(projects);
		return new ResponseEntity<Projects>(currentpro, HttpStatus.OK);
	}

	// ------------------- Delete----------------------------------------

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/projects/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteStaff(@PathVariable("id") int id) {
		logger.info("Fetching & Deleting  with id {}", id);

		Projects projects = projectsService.findByProject_id(id);
		if (projects == null) {
			logger.error("Unable to delete. Projects with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("Unable to delete with id " + id + " not found."),
					HttpStatus.NOT_FOUND);
		}
		projectsService.deleteProjectsById(id);
		return new ResponseEntity<Projects>(HttpStatus.NO_CONTENT);
	}

	// ------------------- Delete All-----------------------------

	@RequestMapping(value = "/projects/deletall", method = RequestMethod.DELETE)
	public ResponseEntity<Projects> deleteAllStaff() {
		logger.info("Deleting All");

		projectsService.deleteAllProjects();
		return new ResponseEntity<Projects>(HttpStatus.NO_CONTENT);
	}

}
