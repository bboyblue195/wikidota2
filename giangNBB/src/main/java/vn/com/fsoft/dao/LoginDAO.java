package vn.com.fsoft.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import vn.com.fsoft.model.User;
import vn.com.fsoft.util.HibernateUtil;

import java.util.List;

public class LoginDAO {
	Session session = null;
	public boolean checkLogin(String user, String pass){
		session = HibernateUtil.getSessionFactory().openSession();
        //session.beginTransaction();
        String sql = "  From User u where u.ID=:user and u.Password=:pass";
        Query query = session.createQuery(sql);
        query.setParameter("user", user);
        query.setParameter("pass", pass);
        List<User> list = query.list();
        if (list.size() > 0) {
            return true;
        }
        session.close();
        return false;
	}
	public List getInforIfLoginSucess(String id){
		session = HibernateUtil.getSessionFactory().openSession();
        //session.beginTransaction();
        String sql = "From User u where u.ID=:ID";
        Query query = session.createQuery(sql);
        query.setParameter("ID", id);
        List<User> list = query.list();
        if (list.size() > 0) {
            return list;
        }
        session.close();
        return null;
	}
	
}
