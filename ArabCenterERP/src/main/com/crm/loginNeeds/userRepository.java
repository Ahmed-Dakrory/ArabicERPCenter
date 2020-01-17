/**
 * 
 */
package main.com.crm.loginNeeds;

import java.util.List;

/**
 * @author Dakrory
 *
 */
public interface userRepository {

	public List<user> getAll();
	public List<user> getAllWithRole(int role);
	public user adduser(user data);
	public user getById(int id);
	public user getByUserName(String UserName);
	public user getByUserNameAndPassword(String UserName,String password);
	public user getByUserNameAndPasswordNotActivated(String UserName,String password);
	public boolean delete(user data);
}
