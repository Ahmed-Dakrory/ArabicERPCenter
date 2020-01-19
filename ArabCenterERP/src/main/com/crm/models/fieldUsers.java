package main.com.crm.models;

import java.util.List;

import main.com.crm.work_field.work_field;
import main.com.crm.work_field_user.work_field_user;
import main.com.crm.work_field_user.work_field_userAppServiceImpl;

public class fieldUsers {
List<work_field_user> users;
work_field field_Ex; 


work_field_userAppServiceImpl work_field_userDataFacede;


public fieldUsers(work_field field_Ex,work_field_userAppServiceImpl work_field_userDataFacede) {
	super();
	this.field_Ex = field_Ex;
	this.work_field_userDataFacede = work_field_userDataFacede;
	this.users = work_field_userDataFacede.getAllByField(this.field_Ex.getId());
}


public List<work_field_user> getUsers() {
	return users;
}


public void setUsers(List<work_field_user> users) {
	this.users = users;
}


public work_field getField_Ex() {
	return field_Ex;
}


public void setField_Ex(work_field field_Ex) {
	this.field_Ex = field_Ex;
} 



}
