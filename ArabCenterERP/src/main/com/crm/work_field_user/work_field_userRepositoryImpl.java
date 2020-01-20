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

	@Override
	public List<work_field_user> getAllByFieldHaveEvalDiffLikeAndDislikeMoreThan(int idField, int diff) {
		// TODO Auto-generated method stub
				 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getAllByFieldHaveEvalDiffLikeAndDislikeMoreThan").setInteger("idField",idField).setInteger("diff", diff);

				 @SuppressWarnings("unchecked")
				List<work_field_user> results=query.list();
				 
					 return results;
	}

	@Override
	public List<work_field_user> getAllByFieldHaveEvalDiffLikeAndDislikeLessThan(int idField, int diff) {
		// TODO Auto-generated method stub
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getAllByFieldHaveEvalDiffLikeAndDislikeLessThan").setInteger("idField",idField).setInteger("diff", diff);

		 @SuppressWarnings("unchecked")
		List<work_field_user> results=query.list();
		 
			 return results;
	}

	@Override
	public List<work_field_user> getAllHaveEvalDiffLikeAndDislikeMoreThan(int diff) {
		// TODO Auto-generated method stub
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getAllHaveEvalDiffLikeAndDislikeMoreThan").setInteger("diff", diff);

		 @SuppressWarnings("unchecked")
		List<work_field_user> results=query.list();
		 
			 return results;
	}

	@Override
	public List<work_field_user> getAllHaveEvalDiffLikeAndDislikeLessThan(int diff) {
		// TODO Auto-generated method stub
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getAllHaveEvalDiffLikeAndDislikeLessThan").setInteger("diff", diff);

		 @SuppressWarnings("unchecked")
		List<work_field_user> results=query.list();
		 
			 return results;
	}

	@Override
	public List<work_field_user> getAllByFieldAndInVacationStateHaveEvalDiffLikeAndDislikeLessThan(int idField,
			int state, int diff) {
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getAllByFieldAndInVacationStateHaveEvalDiffLikeAndDislikeLessThan").setInteger("idField",idField).setInteger("state",state).setInteger("diff", diff);

		 @SuppressWarnings("unchecked")
		List<work_field_user> results=query.list();
		 
			 return results;
	}

	@Override
	public List<work_field_user> getAllInVacationStateHaveEvalDiffLikeAndDislikeLessThan(int state, int diff) {
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getAllInVacationStateHaveEvalDiffLikeAndDislikeLessThan").setInteger("state",state).setInteger("diff", diff);

		 @SuppressWarnings("unchecked")
		List<work_field_user> results=query.list();
		 
			 return results;
	}

	@Override
	public List<work_field_user> getAllHaveEvalLikelessThanAndDislikeMoreThan(int goodLess, int badMore) {
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getAllHaveEvalLikelessThanAndDislikeMoreThan").setInteger("goodLess",goodLess).setInteger("badMore",badMore);

		 @SuppressWarnings("unchecked")
		List<work_field_user> results=query.list();
		 
			 return results;
	}

	@Override
	public List<work_field_user> getAllByFieldHaveEvalLikelessThanAndDislikeMoreThan(int idField, int goodLess,
			int badMore) {
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getAllByFieldHaveEvalLikelessThanAndDislikeMoreThan").setInteger("idField",idField).setInteger("goodLess",goodLess).setInteger("badMore", badMore);

		 @SuppressWarnings("unchecked")
		List<work_field_user> results=query.list();
		 
			 return results;
	}

	@Override
	public List<work_field_user> getAllUnique() {
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getAllUnique");

		 @SuppressWarnings("unchecked")
		List<work_field_user> results=query.list();
		 if(results.size()!=0){
			 return results;
		 }else{
			 return null;
		 }
	}

	@Override
	public List<work_field_user> getAllInVacationStateHaveEvalDiffLikeAndDislikeLessThanUnique(int state, int diff) {
		 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getAllInVacationStateHaveEvalDiffLikeAndDislikeLessThanUnique").setInteger("state",state).setInteger("diff", diff);

		 @SuppressWarnings("unchecked")
		List<work_field_user> results=query.list();
		 
			 return results;
	}

	@Override
	public List<work_field_user> getAllHaveEvalLikelessThanAndDislikeMoreThanUnique(int goodLess, int badMore) {
		Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getAllHaveEvalLikelessThanAndDislikeMoreThanUnique").setInteger("goodLess",goodLess).setInteger("badMore",badMore);

		 @SuppressWarnings("unchecked")
		List<work_field_user> results=query.list();
		 
			 return results;
	}

	@Override
	public List<work_field_user> getAllHaveEvalDiffLikeAndDislikeMoreThanUnique(int diff) {
		// TODO Auto-generated method stub
				 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getAllHaveEvalDiffLikeAndDislikeMoreThan").setInteger("diff", diff);

				 @SuppressWarnings("unchecked")
				List<work_field_user> results=query.list();
				 
					 return results;
	}

	@Override
	public List<work_field_user> getAllHaveEvalDiffLikeAndDislikeLessThanUnique(int diff) {
		// TODO Auto-generated method stub
				 Query query 	=sessionFactory.getCurrentSession().getNamedQuery("work_field_user.getAllHaveEvalDiffLikeAndDislikeLessThanUnique").setInteger("diff", diff);

				 @SuppressWarnings("unchecked")
				List<work_field_user> results=query.list();
				 
					 return results;
	}



}
