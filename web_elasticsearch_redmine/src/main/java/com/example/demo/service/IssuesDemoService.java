package com.example.demo.service;

import java.util.List;

import com.example.demo.model.IssuesDemo;




public interface IssuesDemoService {
	IssuesDemo findByIssuesDemoId(int id);

	void saveIssuesDemo(IssuesDemo issue);

	void updateIssuesDemo(IssuesDemo issue);

	void deleteIssuesDemoById(int id);

	void deleteAllProjects();

	List<IssuesDemo> findAllIssuesDemo();

	boolean isIssuesDemoExist(IssuesDemo issues);

}
