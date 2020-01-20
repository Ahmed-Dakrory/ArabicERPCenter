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
	public List<work_field_user> getAllByFieldHaveEvalDiffLikeAndDislikeMoreThan(int idField,int diff);
	public List<work_field_user> getAllByFieldHaveEvalDiffLikeAndDislikeLessThan(int idField,int diff);
	public List<work_field_user> getAllByFieldAndInVacationStateHaveEvalDiffLikeAndDislikeLessThan(int idField,int state,int diff);
	public List<work_field_user> getAllInVacationStateHaveEvalDiffLikeAndDislikeLessThan(int state,int diff);
	

	public List<work_field_user> getAllHaveEvalLikelessThanAndDislikeMoreThan(int goodLess,int badMore);
	public List<work_field_user> getAllByFieldHaveEvalLikelessThanAndDislikeMoreThan(int idField,int goodLess,int badMore);
	
	public List<work_field_user> getAllHaveEvalDiffLikeAndDislikeMoreThan(int diff);
	public List<work_field_user> getAllHaveEvalDiffLikeAndDislikeLessThan(int diff);
	public boolean delete(work_field_user data);
}
