/**
 * 
 */
package main.com.crm.fieldComment;

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
public class fieldcommentRepositoryImpl implements fieldcommentRepository{

	@Autowired
	private SessionFactory sessionFactory;
	Session session; 
	

	

	@Override
	public fieldcomment addfieldcomment(fieldcomment data) {
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
	public List<fieldcomment> getAll() {
				 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("fieldcomment.getAll");

				 @SuppressWarnings("unchecked")
				List<fieldcomment> results=query.list();
				 if(results.size()!=0){
					 return results;
				 }else{
					 return null;
				 }
	}

	
	@Override
	public boolean delete(fieldcomment data) {
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
	public fieldcomment getById(int id) {
		// TODO Auto-generated method stub
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("fieldcomment.getById").setInteger("id",id);

		 @SuppressWarnings("unchecked")
		List<fieldcomment> results=query.list();
		 if(results.size()!=0){
			 return results.get(0);
		 }else{
			 return null;
		 }
	}





	@Override
	public List<fieldcomment> getAllByFieldUser(int fieldUser_on_who_comment) {
		// TODO Auto-generated method stub
				 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("fieldcomment.getByFieldUser").setInteger("fieldUser_on_who_comment",fieldUser_on_who_comment);

				 @SuppressWarnings("unchecked")
				List<fieldcomment> results=query.list();
				return results;
	}



}
