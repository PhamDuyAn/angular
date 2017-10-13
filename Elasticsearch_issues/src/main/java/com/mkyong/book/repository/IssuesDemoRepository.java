package com.mkyong.book.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.mkyong.book.model.IssuesDemo;

public interface IssuesDemoRepository extends ElasticsearchRepository<IssuesDemo, Integer>{

}
