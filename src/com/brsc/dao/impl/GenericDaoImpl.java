/**
 * 
 */
package com.brsc.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.brsc.dao.GenericDao;

/**
 * @author YuTian
 */
@Repository
public abstract class GenericDaoImpl<Obj,Id extends Serializable> implements GenericDao<Obj, Id> {
	
	@Resource
	private SessionFactory sessionFactory;
	private Class<Obj> clazz;	
	
	public GenericDaoImpl() {
//		Class c = this.getClass();
//		Type t = c.getGenericSuperclass();
//		if (t instanceof ParameterizedType) {
//            Type[] p = ((ParameterizedType) t).getActualTypeArguments();
//            this.clazz = (Class<Obj>) p[0];
//        }
		clazz = (Class<Obj>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public boolean add(Obj obj) {
		return cud(ADD,obj);
	}

	@Override
	public boolean del(Obj obj) {
		return cud(DEL,obj);
	}

	@Override
	public boolean update(Obj obj) {
		return cud(UPT,obj);
	}

	@Override
	public Obj getDocById(Id id) {
		
		Session session = null;
		Obj obj = null;
		
		try{
			session = sessionFactory.openSession();
			obj = (Obj)session.get(clazz, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(session!=null)
				session.close();
		}
		
		return obj;
	}

	@Override
	public List<Obj> getDocs(String hql) {
		
		Session session = null;
		List<Obj> docs = null;
		
		try{
			session = sessionFactory.openSession();
			Query query = session.createQuery(hql);
			docs = query.list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(session!=null)
				session.close();
		}
		
		return docs;
	}
	
	private boolean cud(int opt,Obj obj)
	{
		boolean flag = false;
		Session session = null;
		try
		{
//			session = sessionFactory.openSession();
//			session.beginTransaction();
			session = sessionFactory.getCurrentSession();
			//操作
			switch(opt)
			{
				case ADD:
					session.save(obj);
					break;
				case DEL:
					session.delete(obj);
					break;
				case UPT:
					session.update(obj);
					break;
			}
//			session.getTransaction().commit();
			flag = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
//			if(session != null)
//				session.close();
		}
		return flag;
	}

}
