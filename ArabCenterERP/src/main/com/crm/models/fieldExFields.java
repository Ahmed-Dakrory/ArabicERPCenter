package main.com.crm.models;

import java.util.ArrayList;
import java.util.List;

import main.com.crm.work_field.work_field;
import main.com.crm.work_field.work_fieldAppServiceImpl;
import main.com.crm.work_field_user.work_field_userAppServiceImpl;

public class fieldExFields {
List<fieldUsers> exfieldUsers;
work_field field; 


work_field_userAppServiceImpl work_field_userDataFacede;
work_fieldAppServiceImpl work_fieldDataFacede; 



public fieldExFields(work_field field,work_fieldAppServiceImpl work_fieldDataFacede, work_field_userAppServiceImpl work_field_userDataFacede) {
	super();
	this.field = field;
	this.work_field_userDataFacede = work_field_userDataFacede;
	this.work_fieldDataFacede=work_fieldDataFacede;
	exfieldUsers=new ArrayList<fieldUsers>();
	List<work_field> exFields = work_fieldDataFacede.getAllWithRelatedToField(this.field.getId());
	
	if(exFields!=null) {
		for(int i=0;i<exFields.size();i++) {
			fieldUsers exfieldUsersObject = new fieldUsers(exFields.get(i), work_field_userDataFacede);
			exfieldUsers.add(exfieldUsersObject);
		}
	}
	}



public List<fieldUsers> getExfieldUsers() {
	return exfieldUsers;
}



public void setExfieldUsers(List<fieldUsers> exfieldUsers) {
	this.exfieldUsers = exfieldUsers;
}



public work_field getField() {
	return field;
}



public void setField(work_field field) {
	this.field = field;
}



}


