/**
 * 
 */
package main.com.crm.work_field;

import java.util.List;

/**
 * @author Dakrory
 *
 */
public interface work_fieldRepository {


	public List<work_field> getAll();
	public List<work_field> getAllWithType(int work_fieldType);
	public work_field addwork_field(work_field data);
	public work_field getById(int id);
	public work_field getByField(String field);
	public List<work_field> getAllWithRelatedToField(int mainFieldId);
	public boolean delete(work_field data);
}
