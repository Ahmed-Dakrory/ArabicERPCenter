/**
 * 
 */
package main.com.crm.fieldComment;

import java.util.List;

/**
 * @author Dakrory
 *
 */
public interface IfieldcommentAppService {

	public List<fieldcomment> getAll();
	public fieldcomment addfieldcomment(fieldcomment data);
	public fieldcomment getById(int id);
	public List<fieldcomment> getAllByFieldUser(int fieldUser_on_who_comment);
	public boolean delete(fieldcomment data);
}
