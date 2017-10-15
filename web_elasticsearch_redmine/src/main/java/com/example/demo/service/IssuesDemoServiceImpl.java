package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.model.IssuesDemo;
import com.example.demo.repository.IssuesDemoRepository;



@Service
public class IssuesDemoServiceImpl implements IssuesDemoService{

	@Autowired
	IssuesDemoRepository issuesDemoRepository;
	
	@Override
	public IssuesDemo findByIssuesDemoId(int id) {
		// TODO Auto-generated method stub
		return issuesDemoRepository.findOne(id);
	}

	@Override
	public void saveIssuesDemo(IssuesDemo issue) {
		// TODO Auto-generated method stub
		issuesDemoRepository.save(issue);
	}

	@Override
	public void updateIssuesDemo(IssuesDemo issue) {
		// TODO Auto-generated method stub
		issuesDemoRepository.save(issue);
	}

	@Override
	public void deleteIssuesDemoById(int id) {
		// TODO Auto-generated method stub
		issuesDemoRepository.delete(id);
	}

	@Override
	public void deleteAllIssue() {
		// TODO Auto-generated method stub
		issuesDemoRepository.deleteAll();
	}

	@Override
	public List<IssuesDemo> findAllIssuesDemo() {
		// TODO Auto-generated method stub
		return  issuesDemoRepository.findAll(new PageRequest(0, 100)).getContent();
	}

	@Override
	public boolean isIssuesDemoExist(IssuesDemo issues) {
		// TODO Auto-generated method stub
		return false;
	}

}
