package com.example.services;

import java.util.List;
import java.util.UUID;

import com.example.entity.Staff;

public interface StaffService {
	Staff findByIdStaff(UUID id);

	Staff findByStaffName(String staffName);

	void saveStaff(Staff staff);

	void updateStaff(Staff staff);

	void deleteStaffById(UUID id);

	void deleteAllStaff();

	List<Staff> findAllStaff();

	boolean isStaffExist(Staff staff);

}
