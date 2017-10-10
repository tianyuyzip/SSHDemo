/**
 * 
 */
package com.brsc.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author YuTian
 * */
public interface GenericDao<Obj,Id extends Serializable> {
	
	int ADD = 1;
	int DEL = 2;
	int UPT = 3;
	
	public boolean add(Obj obj);
	public boolean del(Obj obj);
	public boolean update(Obj obj);
	public Obj getDocById(Id id);
	public List<Obj> getDocs(String hql);
}
