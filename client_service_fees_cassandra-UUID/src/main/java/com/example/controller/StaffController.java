package com.example.controller;

import java.util.List;
import java.util.UUID;

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
import com.example.error.CustomErrorType;
import com.example.services.StaffService;


@RestController
@RequestMapping("/api")
public class StaffController {
	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired
	StaffService staffservice; //Service which will do all data retrieval/manipulation work

	// -------------------Retrieve All---------------------------------------------

//	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/staff/", method = RequestMethod.GET)
	public ResponseEntity<List<Staff>> ListAllStaff() {
		List<Staff> staff = staffservice.findAllStaff();
		//System.out.println("An Gay"+staff.get(0).getDailyCost());
		if (staff==null) {
			System.out.println("go herhea11111111111111111111111111111111111111111111111111111111111");
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Staff>>(staff, HttpStatus.OK);
		
	}

	// -------------------Retrieve Single-----------------------------------------

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/staff/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getStaff(@PathVariable("id") UUID id) {
		logger.info("Fetching Staff with id {}", id);
		Staff staff = staffservice.findByIdStaff(id);
		if (staff == null) {
			logger.error("Staff with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("Staff with id " + id 
					+ " not found"), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Staff>(staff, HttpStatus.OK);
	}

	// -------------------Create staff--------------------

	@RequestMapping(value = "/staff/", method = RequestMethod.POST)
	public ResponseEntity<?> createStaff(@RequestBody Staff staff, UriComponentsBuilder ucBuilder) {
		logger.info("Creating Staff : {}", staff);

		if (staffservice.isStaffExist(staff)) {
			logger.error("Unable to create. A Staff with name {} already exist", staff.getStaffName());
			return new ResponseEntity(new CustomErrorType("Unable to create. A Staff with name " + 
			staff.getStaffName() + " already exist."),HttpStatus.CONFLICT);
		}
		staffservice.saveStaff(staff);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/staff/{id}").buildAndExpand(staff.getStaffId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

	// ------------------- Update-----------------------------------------------

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/staff/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateStaff(@PathVariable("id") UUID id, @RequestBody Staff staff) {
		logger.info("Updating Staff with id {}", id);

		Staff currentStaff = staffservice.findByIdStaff(id);

		if (currentStaff == null) {
			logger.error("Unable to update. Staff with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("Unable to upate. Staff with id " + id + " not found."),
					HttpStatus.NOT_FOUND);
		}

		currentStaff.setStaffName(staff.getStaffName());
		currentStaff.setGenderMf(staff.getGenderMf());
		currentStaff.setDateOfBirth(staff.getDateOfBirth());
		currentStaff.setDailyCost(staff.getDailyCost());
		currentStaff.setDailyRate(staff.getDailyRate());
		currentStaff.setDateJoined(staff.getDateJoined());
		currentStaff.setDateLeft(staff.getDateLeft());
		currentStaff.setOtherStaffDetails(staff.getOtherStaffDetails());
		staffservice.updateStaff(currentStaff);
		return new ResponseEntity<Staff>(currentStaff, HttpStatus.OK);
	}

	// ------------------- Delete----------------------------------------

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/staff/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteStaff(@PathVariable("id") UUID id) {
		logger.info("Fetching & Deleting User with id {}", id);

		Staff staff = staffservice.findByIdStaff(id);
		if (staff == null) {
			logger.error("Unable to delete. Staff with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("Unable to delete. Staff with id " + id + " not found."),
					HttpStatus.NOT_FOUND);
		}
		staffservice.deleteStaffById(id);
		return new ResponseEntity<Staff>(HttpStatus.NO_CONTENT);
	}

	// ------------------- Delete All-----------------------------

	@RequestMapping(value = "/staff/deletall", method = RequestMethod.DELETE)
	public ResponseEntity<Staff> deleteAllStaff() {
		logger.info("Deleting All");

		staffservice.deleteAllStaff();
		return new ResponseEntity<Staff>(HttpStatus.NO_CONTENT);
	}
	
}
