package com.example.demo.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.IssuesDemo;

@Repository
public interface IssuesDemoRepository extends ElasticsearchRepository<IssuesDemo, Integer>{
	

}
