/**
 * 
 */
package main.com.crm.fieldLike;

import java.util.List;

/**
 * @author Dakrory
 *
 */
public interface field_likeRepository {


	public List<field_like> getAll();
	public field_like addfield_like(field_like data);
	public field_like getById(int id);
	public field_like getByUserMarkedAndWorkFieldUser(int userMarkedId,int workFieldId);
	public List<field_like> getAllByworkFieldUserIdAndType(int fieldUserId,int type);
	public List<field_like> getAllByworkFieldUserId(int fieldUserId);
	public boolean delete(field_like data);
}
