package vn.com.fsoft.dao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import vn.com.fsoft.model.Shirt;
import vn.com.fsoft.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class ShirtDAO {
	Session session = null;
	public ArrayList<Shirt> getList(){
		session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String sql = " From Shirt  ";
        Query query = session.createQuery(sql);
        
        ArrayList<Shirt> list =  (ArrayList<Shirt>)query.list();
        if (list.size() > 0) {
            return list;
        }
        session.close();
        return null;
	}
	public static void main(String[] args) {
		ShirtDAO shirtdao=new ShirtDAO();
		ArrayList<Shirt> list=shirtdao.getList();
		for (Shirt shirt  : list) {
			System.out.println(shirt.getName());
		}
	}
	public Shirt getShirt(String sid){
		session = HibernateUtil.getSessionFactory().openSession();
        //session.beginTransaction();
		String sql = " From Shirt s where .ID=:sid";
        Query query = session.createQuery(sql);
        query.setParameter("sid", sid);
        ArrayList<Shirt> list =  (ArrayList<Shirt>)query.list();
        Shirt shirt = list.get(0);
        if (list.size() > 0) {
            return shirt;
        }
        session.close();
        return null;
	}
	
}
