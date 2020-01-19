/**
 * 
 */
package main.com.crm.work_field;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dakrory
 *
 */
@Service("work_fieldFacadeImpl")
public class work_fieldAppServiceImpl implements Iwork_fieldAppService{

	@Autowired
	work_fieldRepository work_fieldDataRepository;
	
	
	@Override
	public List<work_field> getAll() {
		try{
			List<work_field> course=work_fieldDataRepository.getAll();
			
			return course;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}

	

	@Override
	public work_field addwork_field(work_field data) {
		try{
			work_field data2=work_fieldDataRepository.addwork_field(data);
			return data2;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}


	@Override
	public boolean delete(work_field data) {
		// TODO Auto-generated method stub
		try{
			work_fieldDataRepository.delete(data);
			return true;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return false;
			}
	}

	@Override
	public work_field getById(int id) {
		// TODO Auto-generated method stub
		try{
			work_field so=work_fieldDataRepository.getById(id);
			
			return so;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}


	@Override
	public List<work_field> getAllWithRelatedToField(int mainFieldId) {
		// TODO Auto-generated method stub
				try{
					List<work_field> so=work_fieldDataRepository.getAllWithRelatedToField(mainFieldId);
					
					return so;
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
						return null;
					}
	}



	@Override
	public List<work_field> getAllWithType(int work_fieldType) {
		try{
			List<work_field> so=work_fieldDataRepository.getAllWithType(work_fieldType);
			
			return so;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}



	@Override
	public work_field getByField(String field) {
		// TODO Auto-generated method stub
				try{
					work_field so=work_fieldDataRepository.getByField(field);
					
					return so;
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
						return null;
					}
	}


	
}
		
		

	
		
	


