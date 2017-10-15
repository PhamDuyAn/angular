package com.mkyong.book.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.mkyong.book.model.IssuesDemo;

@Repository
public interface IssuesDemoRepository extends ElasticsearchRepository<IssuesDemo, Integer>{

}
