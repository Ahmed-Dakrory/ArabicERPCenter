/**
 * 
 */
package main.com.crm.tags;

import java.util.List;

/**
 * @author Dakrory
 *
 */
public interface tagRepository {

	public List<tag> getAll();
	public List<tag> getAllWithType(int tagType);
	public tag addtag(tag data);
	public tag getById(int id);
	public List<tag> getByUserIdAndTagType(int userId,int tagType);
	public boolean delete(tag data);
}
