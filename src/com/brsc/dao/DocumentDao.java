/**
 * 
 */
package com.brsc.dao;

import java.util.List;

import com.brsc.bean.po.DocumentPO;

/**
 * @author YuTian
 *
 */
public interface DocumentDao extends GenericDao<DocumentPO,Integer>{

	public List<DocumentPO> getDocs();
}
