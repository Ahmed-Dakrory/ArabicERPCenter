/**
 * 
 */
package main.com.crm.tags;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author A7med Al-Dakrory
 *
 */
@Repository
@Transactional
public class tagRepositoryImpl implements tagRepository{

	@Autowired
	private SessionFactory sessionFactory;
	Session session; 
	

	

	@Override
	public tag addtag(tag data) {
		try{
			session = sessionFactory.openSession();
			Transaction tx1 = session.beginTransaction();
			session.saveOrUpdate(data);
			tx1.commit();
			session.close(); 
			return data; 
			}
			catch(Exception ex)
			{
				System.out.println(">>>>>>>>>>");
				ex.printStackTrace();
				return null;
			}
	}

	@Override
	public List<tag> getAll() {
				 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("tag.getAll");

				 @SuppressWarnings("unchecked")
				List<tag> results=query.list();
				 if(results.size()!=0){
					 return results;
				 }else{
					 return null;
				 }
	}

	
	@Override
	public boolean delete(tag data) {
		// TODO Auto-generated method stub
		try {
			session = sessionFactory.openSession();
			Transaction tx1 = session.beginTransaction();
			session.delete(data);
			tx1.commit();
			session.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public tag getById(int id) {
		// TODO Auto-generated method stub
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("tag.getById").setInteger("id",id);

		 @SuppressWarnings("unchecked")
		List<tag> results=query.list();
		 if(results.size()!=0){
			 return results.get(0);
		 }else{
			 return null;
		 }
	}

	@Override
	public List<tag> getByUserIdAndTagType(int userId,
			int tagType) {
		// TODO Auto-generated method stub
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("tag.getByUserIdAndTagType").setInteger("idUser",userId).setInteger("tagType", tagType);

		 @SuppressWarnings("unchecked")
		List<tag> results=query.list();
		 
			 return results;
		
	}

	@Override
	public List<tag> getAllWithType(int tagType) {
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("tag.getAllWithType").setInteger("tagType", tagType);

		 @SuppressWarnings("unchecked")
		List<tag> results=query.list();
		 if(results.size()!=0){
			 return results;
		 }else{
			 return null;
		 }
	}



}
