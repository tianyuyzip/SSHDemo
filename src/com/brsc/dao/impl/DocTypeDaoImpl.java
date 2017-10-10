/**
 * 
 */
package com.brsc.dao.impl;

import org.springframework.stereotype.Repository;

import com.brsc.bean.po.DocTypePO;
import com.brsc.dao.DocTypeDao;

/**
 * @author YuTian
 *
 */
@Repository("docTypeDao")
public class DocTypeDaoImpl extends GenericDaoImpl<DocTypePO,Integer> implements DocTypeDao {

	
}
