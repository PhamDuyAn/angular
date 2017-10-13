package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Staff;
import com.example.repository.StaffRepository;

@Service("staffservice")
@Transactional
public class StaffServiceImplement implements StaffService {

	@Autowired
	private StaffRepository staffrepository;

	@Override
	public Staff findByIdStaff(int id) {
		// TODO Auto-generated method stub
		return staffrepository.findOne(id);
	}

	@Override
	public Staff findByStaffName(String staffName) {
		// TODO Auto-generated method stub
		return staffrepository.findByStaffName(staffName);
	}

	@Override
	public void saveStaff(Staff staff) {
		// TODO Auto-generated method stub
		staffrepository.save(staff);
		
	}

	@Override
	public void updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		staffrepository.save(staff);
		
	}

	@Override
	public void deleteStaffById(int id) {
		// TODO Auto-generated method stub
		staffrepository.delete(id);
	}

	@Override
	public void deleteAllStaff() {
		// TODO Auto-generated method stub
		staffrepository.deleteAll();
	}

	@Override
	public List<Staff> findAllStaff() {
		// TODO Auto-generated method stub
		return (List<Staff>) staffrepository.findAll();
	}

	@Override
	public boolean isStaffExist(Staff staff) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	

}
