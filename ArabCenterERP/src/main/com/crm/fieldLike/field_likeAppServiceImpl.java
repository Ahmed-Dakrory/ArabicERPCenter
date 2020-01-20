/**
 * 
 */
package main.com.crm.fieldLike;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dakrory
 *
 */
@Service("field_likeFacadeImpl")
public class field_likeAppServiceImpl implements Ifield_likeAppService{

	@Autowired
	field_likeRepository field_likeDataRepository;
	
	
	@Override
	public List<field_like> getAll() {
		try{
			List<field_like> course=field_likeDataRepository.getAll();
			
			return course;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}

	

	@Override
	public field_like addfield_like(field_like data) {
		try{
			field_like data2=field_likeDataRepository.addfield_like(data);
			return data2;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}


	@Override
	public boolean delete(field_like data) {
		// TODO Auto-generated method stub
		try{
			field_likeDataRepository.delete(data);
			return true;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return false;
			}
	}

	@Override
	public field_like getById(int id) {
		// TODO Auto-generated method stub
		try{
			field_like so=field_likeDataRepository.getById(id);
			
			return so;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}


	




	@Override
	public field_like getByUserMarkedAndWorkFieldUser(int userMarkedId, int workFieldId) {
		// TODO Auto-generated method stub
		try{
			field_like so=field_likeDataRepository.getByUserMarkedAndWorkFieldUser(userMarkedId, workFieldId);
			
			return so;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}



	@Override
	public List<field_like> getAllByworkFieldUserIdAndType(int fieldUserId, int type) {
		// TODO Auto-generated method stub
		try{
			List<field_like> so=field_likeDataRepository.getAllByworkFieldUserIdAndType(fieldUserId,  type);
			
			return so;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}



	@Override
	public List<field_like> getAllByworkFieldUserId(int fieldUserId) {
		// TODO Auto-generated method stub
				try{
					List<field_like> so=field_likeDataRepository.getAllByworkFieldUserId(fieldUserId);
					
					return so;
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
						return null;
					}
	}


	
}
		
		

	
		
	


