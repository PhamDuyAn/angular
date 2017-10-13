package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.entity.Staff;
import com.example.entity.StaffOnProjects;
import com.example.repository.StaffOnProjectsRepository;
import com.example.repository.StaffRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientServiceFeesCassandraApplicationTests {

	@Autowired
	private StaffRepository staffRepository;
	
	
	@Autowired 
	private StaffOnProjectsRepository staffOnProjectsRepository;
	
	
	@Test
	public void contextLoads() {
		Staff staff =new Staff();
		staff.setStaff_id(1);
		staff.setStaff_name("duyan");
		staffRepository.save(staff);
		
		
	}
	@Test
	public void StaffOnProjectsTest() {
		//-----Save----
		StaffOnProjects staffonproject= new StaffOnProjects();
		staffonproject.setStaffid(1);
		staffonproject.setStaffOnProjectPeriocId(1);
		staffonproject.setRefRolescode("VT1");
		staffOnProjectsRepository.save(staffonproject);
		staffOnProjectsRepository.findAll();
		
	}
}
