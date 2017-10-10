/**
 * 
 */
package com.brsc.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.brsc.bean.po.DocumentPO;
import com.brsc.dao.DocumentDao;

/**
 * @author YuTian
 *
 */
@Repository("documentDao")
public class DocumentDaoImpl extends GenericDaoImpl<DocumentPO,Integer> implements DocumentDao {

	@Override
	public List<DocumentPO> getDocs() {
		return this.getDocs("from DoucmentPO doc");
	}
}
