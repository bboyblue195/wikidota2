package vn.com.fsoft.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import vn.com.fsoft.model.User;
import vn.com.fsoft.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	Session session = null;
	
	public ArrayList<User> getList(){
		session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String sql = " From User u ";
        Query query = session.createQuery(sql);
        
        ArrayList<User> list =  (ArrayList<User>)query.list();
        if (list.size() > 0) {
            return list;
        }
        session.close();
        return null;
	}
	
	public int addUser(User u){
		int result = 0;
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
        session.close();
        return result;
	}
	public boolean checkUser(String user){
		session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String sql = " From User u where u.ID=:user ";
        Query query = session.createQuery(sql);
        query.setParameter("user", user);
        List<User> list = query.list();
        if (list.size() > 0) {
            return true;
        }
        session.close();
        return false;
	}
	
	
}
