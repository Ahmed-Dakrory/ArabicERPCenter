/**
 * 
 */
package main.com.crm.work_field_user;

import java.util.List;

/**
 * @author Dakrory
 *
 */
public interface work_field_userRepository {

	public List<work_field_user> getAll();
	public List<work_field_user> getAllByField(int id_field);
	public work_field_user addwork_field_user(work_field_user data);
	public work_field_user getById(int id);
	public List<work_field_user> getAllFieldsOfUserOfType(int userId,int field_type);
	public boolean delete(work_field_user data);
}
