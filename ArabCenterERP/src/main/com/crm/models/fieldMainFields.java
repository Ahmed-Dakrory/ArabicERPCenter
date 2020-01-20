package main.com.crm.models;

import java.util.ArrayList;
import java.util.List;

import main.com.crm.loginNeeds.user;
import main.com.crm.work_field.work_field;
import main.com.crm.work_field.work_fieldAppServiceImpl;
import main.com.crm.work_field_user.work_field_user;
import main.com.crm.work_field_user.work_field_userAppServiceImpl;

public class fieldMainFields {
List<work_field_user> fieldUsers;
/**
 * this contain all fields related to the main field with the user include
 * in the extended field
 */
List<fieldExFields> exfields; 


List<work_field_user> newListUsers; 
List<work_field_user> hotListUsers; 
List<work_field_user> coldListUsers; 
List<work_field_user> oldListUsers; 

work_field mainField; 


work_field_userAppServiceImpl work_field_userDataFacede;
work_fieldAppServiceImpl work_fieldDataFacede; 



public fieldMainFields(work_field mainField,work_fieldAppServiceImpl work_fieldDataFacede, work_field_userAppServiceImpl work_field_userDataFacede) {
	super();
	
	this.work_field_userDataFacede = work_field_userDataFacede;
	this.work_fieldDataFacede=work_fieldDataFacede;
	this.fieldUsers = work_field_userDataFacede.getAllByField(mainField.getId());
	this.mainField = mainField;
	
	this.exfields = new ArrayList<fieldExFields>();
	List<work_field> extendedFields = work_fieldDataFacede.getAllWithRelatedToField(this.mainField.getId());
	
	if(extendedFields!=null) {
		for(int i=0;i<extendedFields.size();i++) {
			fieldExFields fX=new fieldExFields(extendedFields.get(i), work_fieldDataFacede, work_field_userDataFacede);
			if(fX!=null) {
			this.exfields.add(fX);
			}
		}
	}
	
	newListUsers = work_field_userDataFacede.getAllByFieldHaveEvalLikelessThanAndDislikeMoreThan(mainField.getId(), work_field_user.New_EqualOrLessThanLike, work_field_user.New_EqualOrMoreThanDisLike);
	hotListUsers = work_field_userDataFacede.getAllByFieldHaveEvalDiffLikeAndDislikeMoreThan(mainField.getId(), work_field_user.HotListEqualOrMoreThan);
	coldListUsers = work_field_userDataFacede.getAllByFieldHaveEvalDiffLikeAndDislikeLessThan(mainField.getId(), work_field_user.ColdListEqualOrLess);
	oldListUsers = work_field_userDataFacede.getAllByFieldAndInVacationStateHaveEvalDiffLikeAndDislikeLessThan(mainField.getId(), user.VACATIONSTATE_In_VACATION,work_field_user.OldLessThanOrEqual);
}



public List<work_field_user> getFieldUsers() {
	return fieldUsers;
}



public void setFieldUsers(List<work_field_user> fieldUsers) {
	this.fieldUsers = fieldUsers;
}





public List<fieldExFields> getExfields() {
	return exfields;
}



public void setExfields(List<fieldExFields> exfields) {
	this.exfields = exfields;
}



public work_field getMainField() {
	return mainField;
}



public void setMainField(work_field mainField) {
	this.mainField = mainField;
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



}


