package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Staff;

@Repository
public interface StaffRepository extends CrudRepository<Staff, Integer> {
	
}
