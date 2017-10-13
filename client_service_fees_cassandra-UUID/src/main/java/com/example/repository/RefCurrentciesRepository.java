package com.example.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.RefCurencies;

public interface RefCurrentciesRepository extends CrudRepository<RefCurencies, UUID> {

}
