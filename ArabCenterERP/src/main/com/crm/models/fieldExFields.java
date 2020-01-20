package main.com.crm.models;

import java.util.List;

import main.com.crm.loginNeeds.user;
import main.com.crm.work_field.work_field;
import main.com.crm.work_field.work_fieldAppServiceImpl;
import main.com.crm.work_field_user.work_field_user;
import main.com.crm.work_field_user.work_field_userAppServiceImpl;

public class fieldExFields {
List<work_field_user> exfieldUsers;
work_field field; 


work_field_userAppServiceImpl work_field_userDataFacede;
work_fieldAppServiceImpl work_fieldDataFacede; 


List<work_field_user> newListUsers; 
List<work_field_user> hotListUsers; 
List<work_field_user> coldListUsers; 
List<work_field_user> oldListUsers; 

public fieldExFields(work_field field,work_fieldAppServiceImpl work_fieldDataFacede, work_field_userAppServiceImpl work_field_userDataFacede) {
	super();
	this.field = field;
	this.work_field_userDataFacede = work_field_userDataFacede;
	this.work_fieldDataFacede=work_fieldDataFacede;
	this.exfieldUsers = work_field_userDataFacede.getAllByField(this.field.getId());
	System.out.println("MpoAhmed: "+field.getId());
	
	newListUsers = work_field_userDataFacede.getAllByFieldHaveEvalLikelessThanAndDislikeMoreThan(field.getId(), work_field_user.New_EqualOrLessThanLike, work_field_user.New_EqualOrMoreThanDisLike);
	hotListUsers = work_field_userDataFacede.getAllByFieldHaveEvalDiffLikeAndDislikeMoreThan(field.getId(), work_field_user.HotListEqualOrMoreThan);
	coldListUsers = work_field_userDataFacede.getAllByFieldHaveEvalDiffLikeAndDislikeLessThan(field.getId(), work_field_user.ColdListEqualOrLess);
	oldListUsers = work_field_userDataFacede.getAllByFieldAndInVacationStateHaveEvalDiffLikeAndDislikeLessThan(field.getId(), user.VACATIONSTATE_In_VACATION,work_field_user.OldLessThanOrEqual);

	
	}



public List<work_field_user> getNewListUsers() {
	return newListUsers;
}



public void setNewListUsers(List<work_field_user> newListUsers) {
	this.newListUsers = newListUsers;
}



public List<work_field_user> getHotListUsers() {
	return hotListUsers;
}



public void setHotListUsers(List<work_field_user> hotListUsers) {
	this.hotListUsers = hotListUsers;
}



public List<work_field_user> getColdListUsers() {
	return coldListUsers;
}



public void setColdListUsers(List<work_field_user> coldListUsers) {
	this.coldListUsers = coldListUsers;
}



public List<work_field_user> getOldListUsers() {
	return oldListUsers;
}



public void setOldListUsers(List<work_field_user> oldListUsers) {
	this.oldListUsers = oldListUsers;
}



public List<work_field_user> getExfieldUsers() {
	return exfieldUsers;
}



public void setExfieldUsers(List<work_field_user> exfieldUsers) {
	this.exfieldUsers = exfieldUsers;
}



public work_field getField() {
	return field;
}



public void setField(work_field field) {
	this.field = field;
}



}


