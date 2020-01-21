/**
 * 
 */
package main.com.crm.fieldComment;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dakrory
 *
 */
@Service("fieldcommentFacadeImpl")
public class fieldcommentAppServiceImpl implements IfieldcommentAppService{

	@Autowired
	fieldcommentRepository fieldcommentDataRepository;
	
	
	@Override
	public List<fieldcomment> getAll() {
		try{
			List<fieldcomment> course=fieldcommentDataRepository.getAll();
			
			return course;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}

	

	@Override
	public fieldcomment addfieldcomment(fieldcomment data) {
		try{
			fieldcomment data2=fieldcommentDataRepository.addfieldcomment(data);
			return data2;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}


	@Override
	public boolean delete(fieldcomment data) {
		// TODO Auto-generated method stub
		try{
			fieldcommentDataRepository.delete(data);
			return true;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return false;
			}
	}

	@Override
	public fieldcomment getById(int id) {
		// TODO Auto-generated method stub
		try{
			fieldcomment so=fieldcommentDataRepository.getById(id);
			
			return so;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}



	@Override
	public List<fieldcomment> getAllByFieldUser(int fieldfieldUser_on_who_comment) {
		// TODO Auto-generated method stub
				try{
					List<fieldcomment> so=fieldcommentDataRepository.getAllByFieldUser(fieldfieldUser_on_who_comment);
					
					return so;
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
						return null;
					}
	}


	
}
		
		

	
		
	


