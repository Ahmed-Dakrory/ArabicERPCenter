/**
 * 
 */
package main.com.crm.fieldLike;

import java.util.Date;
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
public class field_likeRepositoryImpl implements field_likeRepository{

	@Autowired
	private SessionFactory sessionFactory;
	Session session; 
	

	

	@Override
	public field_like addfield_like(field_like data) {
		try{
			session = sessionFactory.openSession();
			Transaction tx1 = session.beginTransaction();
			data.setDateTime(new Date());
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
	public List<field_like> getAll() {
				 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("field_like.getAll");

				 @SuppressWarnings("unchecked")
				List<field_like> results=query.list();
				 if(results.size()!=0){
					 return results;
				 }else{
					 return null;
				 }
	}

	
	@Override
	public boolean delete(field_like data) {
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
	public field_like getById(int id) {
		// TODO Auto-generated method stub
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("field_like.getById").setInteger("id",id);

		 @SuppressWarnings("unchecked")
		List<field_like> results=query.list();
		 if(results.size()!=0){
			 return results.get(0);
		 }else{
			 return null;
		 }
	}

	
	


	@Override
	public field_like getByUserMarkedAndWorkFieldUser(int userMarkedId, int workFieldId) {
		// TODO Auto-generated method stub
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("field_like.getByUserMarkedAndWorkFieldUser").setInteger("userMarkedId",userMarkedId).setInteger("workFieldId",workFieldId);

		 @SuppressWarnings("unchecked")
		List<field_like> results=query.list();
		 if(results.size()!=0){
			 return results.get(0);
		 }else{
			 return null;
		 }
	}

	@Override
	public List<field_like> getAllByworkFieldUserIdAndType(int fieldUserId, int type) {
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("field_like.getAllByworkFieldUserIdAndType").setInteger("fieldUserId", fieldUserId).setInteger("type", type);

		 @SuppressWarnings("unchecked")
		List<field_like> results=query.list();
		 if(results.size()!=0){
			 return results;
		 }else{
			 return null;
		 }
	}

	@Override
	public List<field_like> getAllByworkFieldUserId(int fieldUserId) {
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("field_like.getAllByworkFieldUserId").setInteger("fieldUserId", fieldUserId);

		 @SuppressWarnings("unchecked")
		List<field_like> results=query.list();
		 if(results.size()!=0){
			 return results;
		 }else{
			 return null;
		 }
	}



}
