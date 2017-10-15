package com.example.demo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="issue3", type = "issue")
public class IssuesDemo {
	@Id
	private Integer id;

    private String subject;
    private Integer parentId;
    private Float estimatedHours;
    private Float spentHours;
    private String assignee;
    private String priorityText;
    private Integer priorityId;
    private Integer doneRatio;
    private String project;
    private String author;
    private Date startDate;
    private Date dueDate;
    private String tracker;
    private String description;
    private Date createdOn;
    private Date updatedOn;
    private Integer statusId;
    private String statusName;
    //private Version targetVersion;
    private String category;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Float getEstimatedHours() {
		return estimatedHours;
	}
	public void setEstimatedHours(Float estimatedHours) {
		this.estimatedHours = estimatedHours;
	}
	public Float getSpentHours() {
		return spentHours;
	}
	public void setSpentHours(Float spentHours) {
		this.spentHours = spentHours;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getPriorityText() {
		return priorityText;
	}
	public void setPriorityText(String priorityText) {
		this.priorityText = priorityText;
	}
	public Integer getPriorityId() {
		return priorityId;
	}
	public void setPriorityId(Integer priorityId) {
		this.priorityId = priorityId;
	}
	public Integer getDoneRatio() {
		return doneRatio;
	}
	public void setDoneRatio(Integer doneRatio) {
		this.doneRatio = doneRatio;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public String getTracker() {
		return tracker;
	}
	public void setTracker(String tracker) {
		this.tracker = tracker;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public IssuesDemo(Integer id, String subject, Integer parentId, Float estimatedHours, Float spentHours,
			String assignee, String priorityText, Integer priorityId, Integer doneRatio, String project, String author,
			Date startDate, Date dueDate, String tracker, String description, Date createdOn, Date updatedOn,
			Integer statusId, String statusName, String category) {
		super();
		this.id = id;
		this.subject = subject;
		this.parentId = parentId;
		this.estimatedHours = estimatedHours;
		this.spentHours = spentHours;
		this.assignee = assignee;
		this.priorityText = priorityText;
		this.priorityId = priorityId;
		this.doneRatio = doneRatio;
		this.project = project;
		this.author = author;
		this.startDate = startDate;
		this.dueDate = dueDate;
		this.tracker = tracker;
		this.description = description;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.statusId = statusId;
		this.statusName = statusName;
		this.category = category;
	}
	public IssuesDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "IssuesDemo [id=" + id + ", subject=" + subject + ", parentId=" + parentId + ", estimatedHours="
				+ estimatedHours + ", spentHours=" + spentHours + ", assignee=" + assignee + ", priorityText="
				+ priorityText + ", priorityId=" + priorityId + ", doneRatio=" + doneRatio + ", project=" + project
				+ ", author=" + author + ", startDate=" + startDate + ", dueDate=" + dueDate + ", tracker=" + tracker
				+ ", description=" + description + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn
				+ ", statusId=" + statusId + ", statusName=" + statusName + "]";
	}
	public IssuesDemo(String subject, Integer parentId, Float estimatedHours, Float spentHours, String assignee,
			String priorityText, Integer priorityId, Integer doneRatio, String project, String author, Date startDate,
			Date dueDate, String tracker, String description, Date createdOn, Date updatedOn, Integer statusId,
			String statusName, String category) {
		super();
		this.subject = subject;
		this.parentId = parentId;
		this.estimatedHours = estimatedHours;
		this.spentHours = spentHours;
		this.assignee = assignee;
		this.priorityText = priorityText;
		this.priorityId = priorityId;
		this.doneRatio = doneRatio;
		this.project = project;
		this.author = author;
		this.startDate = startDate;
		this.dueDate = dueDate;
		this.tracker = tracker;
		this.description = description;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.statusId = statusId;
		this.statusName = statusName;
		this.category = category;
	}
    
    
	
	

}
