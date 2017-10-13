package com.example.services;

import java.util.List;

import com.example.entity.Staff;

public interface StaffService {
	Staff findByIdStaff(int id);

	Staff findByStaffName(String staffName);

	void saveStaff(Staff staff);

	void updateStaff(Staff staff);

	void deleteStaffById(int id);

	void deleteAllStaff();

	List<Staff> findAllStaff();

	boolean isStaffExist(Staff staff);

}
