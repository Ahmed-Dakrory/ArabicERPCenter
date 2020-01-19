/**
 * 
 */
package main.com.crm.work_field_user;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dakrory
 *
 */
@Service("work_field_userFacadeImpl")
public class work_field_userAppServiceImpl implements Iwork_field_userAppService{

	@Autowired
	work_field_userRepository work_field_userDataRepository;
	
	
	@Override
	public List<work_field_user> getAll() {
		try{
			List<work_field_user> course=work_field_userDataRepository.getAll();
			
			return course;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}

	

	@Override
	public work_field_user addwork_field_user(work_field_user data) {
		try{
			work_field_user data2=work_field_userDataRepository.addwork_field_user(data);
			return data2;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}


	@Override
	public boolean delete(work_field_user data) {
		// TODO Auto-generated method stub
		try{
			work_field_userDataRepository.delete(data);
			return true;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return false;
			}
	}

	@Override
	public work_field_user getById(int id) {
		// TODO Auto-generated method stub
		try{
			work_field_user so=work_field_userDataRepository.getById(id);
			
			return so;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}


	@Override
	public List<work_field_user> getAllFieldsOfUserOfType(int userId,
			int type) {
		// TODO Auto-generated method stub
				try{
					List<work_field_user> so=work_field_userDataRepository.getAllFieldsOfUserOfType(userId,type);
					
					return so;
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
						return null;
					}
	}



	@Override
	public List<work_field_user> getAllByField(int id_field) {
		try{
			List<work_field_user> so=work_field_userDataRepository.getAllByField(id_field);
			
			return so;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}


	
}
		
		

	
		
	

