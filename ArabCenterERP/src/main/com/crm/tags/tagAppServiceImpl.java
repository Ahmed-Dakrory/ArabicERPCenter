/**
 * 
 */
package main.com.crm.tags;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dakrory
 *
 */
@Service("tagFacadeImpl")
public class tagAppServiceImpl implements ItagAppService{

	@Autowired
	tagRepository tagDataRepository;
	
	
	@Override
	public List<tag> getAll() {
		try{
			List<tag> course=tagDataRepository.getAll();
			
			return course;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}

	

	@Override
	public tag addtag(tag data) {
		try{
			tag data2=tagDataRepository.addtag(data);
			return data2;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}


	@Override
	public boolean delete(tag data) {
		// TODO Auto-generated method stub
		try{
			tagDataRepository.delete(data);
			return true;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return false;
			}
	}

	@Override
	public tag getById(int id) {
		// TODO Auto-generated method stub
		try{
			tag so=tagDataRepository.getById(id);
			
			return so;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}


	@Override
	public List<tag> getByUserIdAndTagType(int userId,
			int tagtype) {
		// TODO Auto-generated method stub
				try{
					List<tag> so=tagDataRepository.getByUserIdAndTagType(userId,tagtype);
					
					return so;
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
						return null;
					}
	}



	@Override
	public List<tag> getAllWithType(int tagType) {
		try{
			List<tag> so=tagDataRepository.getAllWithType(tagType);
			
			return so;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
	}


	
}
		
		

	
		
	


