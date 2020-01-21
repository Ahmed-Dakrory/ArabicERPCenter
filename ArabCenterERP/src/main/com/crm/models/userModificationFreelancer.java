package main.com.crm.models;

import java.util.List;

import main.com.crm.fieldComment.fieldcomment;
import main.com.crm.loginNeeds.user;
import main.com.crm.work_field_user.work_field_user;

public class userModificationFreelancer {
work_field_user exfieldUsers;
user mainModifier;
String numberOfRequestsDeleivered;
String numberOfRequestsCurrent;
String numberOfRequestsCancelled;
String numberOfRequests;
List<fieldcomment>comments;
int likeState=0;

public static Integer NoAction = 0;
public static Integer IsLike = 1;
public static Integer IsDisLike = 2;



public userModificationFreelancer(work_field_user exfieldUsers, user mainModifier, String numberOfRequestsDeleivered,
		String numberOfRequestsCurrent, String numberOfRequestsCancelled, String numberOfRequests,
		List<fieldcomment> comments,int likeState) {
	super();
	this.exfieldUsers = exfieldUsers;
	this.mainModifier = mainModifier;
	this.numberOfRequestsDeleivered = numberOfRequestsDeleivered;
	this.numberOfRequestsCurrent = numberOfRequestsCurrent;
	this.numberOfRequestsCancelled = numberOfRequestsCancelled;
	this.numberOfRequests = numberOfRequests;
	this.comments = comments;
	this.likeState=likeState;
}




public int getLikeState() {
	return likeState;
}




public void setLikeState(int likeState) {
	this.likeState = likeState;
}




public work_field_user getExfieldUsers() {
	return exfieldUsers;
}
public void setExfieldUsers(work_field_user exfieldUsers) {
	this.exfieldUsers = exfieldUsers;
}
public user getMainModifier() {
	return mainModifier;
}
public void setMainModifier(user mainModifier) {
	this.mainModifier = mainModifier;
}
public String getNumberOfRequestsDeleivered() {
	return numberOfRequestsDeleivered;
}
public void setNumberOfRequestsDeleivered(String numberOfRequestsDeleivered) {
	this.numberOfRequestsDeleivered = numberOfRequestsDeleivered;
}
public String getNumberOfRequestsCurrent() {
	return numberOfRequestsCurrent;
}
public void setNumberOfRequestsCurrent(String numberOfRequestsCurrent) {
	this.numberOfRequestsCurrent = numberOfRequestsCurrent;
}
public String getNumberOfRequestsCancelled() {
	return numberOfRequestsCancelled;
}
public void setNumberOfRequestsCancelled(String numberOfRequestsCancelled) {
	this.numberOfRequestsCancelled = numberOfRequestsCancelled;
}
public String getNumberOfRequests() {
	return numberOfRequests;
}
public void setNumberOfRequests(String numberOfRequests) {
	this.numberOfRequests = numberOfRequests;
}
public List<fieldcomment> getComments() {
	return comments;
}
public void setComments(List<fieldcomment> comments) {
	this.comments = comments;
}




}


