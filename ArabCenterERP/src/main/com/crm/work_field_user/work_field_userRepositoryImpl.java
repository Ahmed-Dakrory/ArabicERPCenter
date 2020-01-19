/**
 * 
 */
package main.com.crm.work_field_user;

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
public class work_field_userRepositoryImpl implements work_field_userRepository{

	@Autowired
	private SessionFactory sessionFactory;
	Session session; 
	

	

	@Override
	public work_field_user addwork_field_user(work_field_user data) {
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
	public List<work_field_user> getAll() {
				 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getAll");

				 @SuppressWarnings("unchecked")
				List<work_field_user> results=query.list();
				 if(results.size()!=0){
					 return results;
				 }else{
					 return null;
				 }
	}

	
	@Override
	public boolean delete(work_field_user data) {
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
	public work_field_user getById(int id) {
		// TODO Auto-generated method stub
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getById").setInteger("id",id);

		 @SuppressWarnings("unchecked")
		List<work_field_user> results=query.list();
		 if(results.size()!=0){
			 return results.get(0);
		 }else{
			 return null;
		 }
	}

	@Override
	public List<work_field_user> getAllFieldsOfUserOfType(int userId,
			int type) {
		// TODO Auto-generated method stub
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getAllFieldsOfUserOfType").setInteger("idUser",userId).setInteger("type", type);

		 @SuppressWarnings("unchecked")
		List<work_field_user> results=query.list();
		 
			 return results;
		
	}

	@Override
	public List<work_field_user> getAllByField(int id) {
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getAllByField").setInteger("id", id);

		 @SuppressWarnings("unchecked")
		List<work_field_user> results=query.list();
		 if(results.size()!=0){
			 return results;
		 }else{
			 return null;
		 }
	}



}
