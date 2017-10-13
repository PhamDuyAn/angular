package com.example;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.repository.StaffOnProjectsRepository;

@SpringBootApplication
public class ClientServiceFeesCassandraApplication implements CommandLineRunner{
	@Autowired
	StaffOnProjectsRepository onProjectsRepository;
	public static void main(String[] args) {
		SpringApplication.run(ClientServiceFeesCassandraApplication.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(((List)onProjectsRepository.findByProject_id(UUID.fromString("db50fcc0-aa46-11e7-a715-c9183d69a46e"))).get(0).toString());
		
	}
	
}
