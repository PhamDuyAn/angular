package com.example.demo.controller;

import java.util.Currency;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.model.IssuesDemo;
import com.example.demo.service.IssuesDemoService;

@Controller
@RequestMapping("/api")
@CrossOrigin(origins= {"http://localhost:4200"})
public class IssuesDemoController {
	
	public static final Logger logger = LoggerFactory.getLogger(IssuesDemoController.class);
	
	@Autowired
	private IssuesDemoService issuesDemoService;
	
	@RequestMapping(value = "/issuedemo/", method = RequestMethod.GET)
	public ResponseEntity<List<IssuesDemo>> ListAllIssue() {
		List<IssuesDemo> issue = issuesDemoService.findAllIssuesDemo();
		//System.out.println("An Gay"+staff.get(0).getDailyCost());
		if (issue==null) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<IssuesDemo>>(issue, HttpStatus.OK);
		
	}

	// -------------------Retrieve ----------------------------------------

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/issuedemo/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getIssue(@PathVariable("id") int id) {
		logger.info("Fetching issue with id {}", id);
		IssuesDemo projects = issuesDemoService.findByIssuesDemoId(id);
		if (projects == null) {
			logger.error("issue with id {} not found.", id);
//			return new ResponseEntihttp://localhost:8080ty(new CustomErrorType("Projects with id " + id 
//					+ " not found"), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<IssuesDemo>(projects, HttpStatus.OK);
	}

	// -------------------Create--------------------

	@RequestMapping(value = "/issuedemo/", method = RequestMethod.POST)
	public ResponseEntity<?> createIssue(@RequestBody IssuesDemo projects, UriComponentsBuilder ucBuilder) {
		logger.info("Creating issue : {}", projects);

		if (issuesDemoService.isIssuesDemoExist(projects)) {
			logger.error("Unable to create. A issue with name {} already exist");
//			return new ResponseEntity(new CustomErrorType("Unable to create. A Projects with name  already exist."),HttpStatus.CONFLICT);
		}
		issuesDemoService.saveIssuesDemo(projects);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/issue/{id}").buildAndExpand(projects.getId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

	// ------------------- Update-----------------------------------------------

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/issuedemo/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateIssue(@PathVariable("id") int id, @RequestBody IssuesDemo projects) {
		logger.info("Updating issue with id {}", id);

		IssuesDemo currentpro = issuesDemoService.findByIssuesDemoId(id);

		if (currentpro == null) {
			logger.error("Unable to update with id {} not found.", id);
			//return new ResponseEn.getAssignee())tity(new CustomErrorType("Unable to upate. Projects with id " + id + " not found."),
					//HttpStatus.NOT_FOUND);
		}
		currentpro.setDueDate(projects.getDueDate());
		currentpro.setStartDate(projects.getStartDate());
		currentpro.setPriorityText(projects.getPriorityText());
		currentpro.setAssignee(projects.getAssignee());
		currentpro.setCreatedOn(projects.getCreatedOn());
		currentpro.setAuthor(projects.getAuthor());
		currentpro.setDoneRatio(projects.getDoneRatio());
		currentpro.setDescription(projects.getDescription());
		currentpro.setEstimatedHours(projects.getEstimatedHours());
		currentpro.setParentId(projects.getParentId());
		currentpro.setPriorityId(projects.getPriorityId());
		currentpro.setStatusId(projects.getStatusId());
		currentpro.setCategory(projects.getCategory());
		currentpro.setProject(projects.getProject());
		currentpro.setStatusName(projects.getStatusName());
		currentpro.setSubject(projects.getSubject());
		currentpro.setTracker(projects.getTracker());
		currentpro.setUpdatedOn(projects.getUpdatedOn());
		currentpro.setSpentHours(projects.getSpentHours());
		
		
		
		return new ResponseEntity<IssuesDemo>(currentpro, HttpStatus.OK);
	}

	// ------------------- Delete----------------------------------------

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/issuedemo/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteIssue(@PathVariable("id") int id) {
		logger.info("Fetching & Deleting  with id {}", id);

		IssuesDemo projects = issuesDemoService.findByIssuesDemoId(id);
		if (projects == null) {
			logger.error("Unable to delete. issue with id {} not found.", id);
//			return new ResponseEntity(new CustomErrorType("Unable to delete with id " + id + " not found."),
//					HttpStatus.NOT_FOUND);
		}
		issuesDemoService.deleteIssuesDemoById(id);
		return new ResponseEntity<IssuesDemo>(HttpStatus.NO_CONTENT);
	}

	// ------------------- Delete All-----------------------------

	@RequestMapping(value = "/issuedemo/deletall", method = RequestMethod.DELETE)
	public ResponseEntity<IssuesDemo> deleteAllIssue() {
		logger.info("Deleting All");

		issuesDemoService.deleteAllIssue();
		return new ResponseEntity<IssuesDemo>(HttpStatus.NO_CONTENT);
	}

}
