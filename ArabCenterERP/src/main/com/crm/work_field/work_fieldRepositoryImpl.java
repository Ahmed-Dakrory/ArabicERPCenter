/**
 * 
 */
package main.com.crm.work_field;

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
public class work_fieldRepositoryImpl implements work_fieldRepository{

	@Autowired
	private SessionFactory sessionFactory;
	Session session; 
	

	

	@Override
	public work_field addwork_field(work_field data) {
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
	public List<work_field> getAll() {
				 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field.getAll");

				 @SuppressWarnings("unchecked")
				List<work_field> results=query.list();
				 if(results.size()!=0){
					 return results;
				 }else{
					 return null;
				 }
	}

	
	@Override
	public boolean delete(work_field data) {
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
	public work_field getById(int id) {
		// TODO Auto-generated method stub
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field.getById").setInteger("id",id);

		 @SuppressWarnings("unchecked")
		List<work_field> results=query.list();
		 if(results.size()!=0){
			 return results.get(0);
		 }else{
			 return null;
		 }
	}

	@Override
	public List<work_field> getAllWithRelatedToField(int mainFieldId) {
		// TODO Auto-generated method stub
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field.getAllWithRelatedToField").setInteger("mainFieldId", mainFieldId);

		 @SuppressWarnings("unchecked")
		List<work_field> results=query.list();
		 
			 return results;
		
	}

	@Override
	public List<work_field> getAllWithType(int work_fieldType) {
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field.getAllWithType").setInteger("work_fieldType", work_fieldType);

		 @SuppressWarnings("unchecked")
		List<work_field> results=query.list();
		 if(results.size()!=0){
			 return results;
		 }else{
			 return null;
		 }
	}

	@Override
	public work_field getByField(String field) {
		// TODO Auto-generated method stub
				 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field.getByField").setString("field",field);

				 @SuppressWarnings("unchecked")
				List<work_field> results=query.list();
				 if(results.size()!=0){
					 return results.get(0);
				 }else{
					 return null;
				 }
	}



}
