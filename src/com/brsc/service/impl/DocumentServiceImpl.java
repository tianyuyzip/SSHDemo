/**
 * 
 */
package com.brsc.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brsc.bean.bo.DocumentBO;
import com.brsc.bean.po.DocTypePO;
import com.brsc.bean.po.DocumentPO;
import com.brsc.dao.DocTypeDao;
import com.brsc.dao.DocumentDao;
import com.brsc.service.DocumentService;

/**
 * @author YuTian
 *
 */
@Service("documentService")
@Transactional
public class DocumentServiceImpl implements DocumentService {

	@Resource
	private DocumentDao documentDao;
	
	@Resource
	private DocTypeDao docTypeDao;
	/* (non-Javadoc)
	 * @see com.brsc.service.DocumentService#addDoc(com.brsc.bean.bo.DocumentBO)
	 */
	@Override
	public boolean addDoc(DocumentBO doc) {
		return documentDao.add(bo2po(doc));
	}

	/* (non-Javadoc)
	 * @see com.brsc.service.DocumentService#delDoc(java.lang.Integer)
	 */
	@Override
	public boolean delDoc(Integer id) {
		DocumentPO documentPO = new DocumentPO();
		documentPO.setDocNo(id);
		return documentDao.del(documentPO);
	}

	/* (non-Javadoc)
	 * @see com.brsc.service.DocumentService#uptDoc(com.brsc.bean.bo.DocumentBO)
	 */
	@Override
	public boolean uptDoc(DocumentBO doc) {
		return documentDao.update(bo2po(doc));
	}

	/* (non-Javadoc)
	 * @see com.brsc.service.DocumentService#getDoc(java.lang.Integer)
	 */
	@Override
	public DocumentBO getDoc(Integer id) {
		return po2bo(documentDao.getDocById(id));
	}

	/* (non-Javadoc)
	 * @see com.brsc.service.DocumentService#getDocs()
	 */
	@Override
	public List<DocumentBO> getDocs() {
		List<DocumentPO> docList = documentDao.getDocs();
		List<DocumentBO> doc = new ArrayList<DocumentBO>();
		
		for(DocumentPO docPO:docList){
			doc.add(po2bo(docPO));
		}
		return doc;
	}
	
	private DocumentPO bo2po(DocumentBO documentBO){
		
		DocumentPO documentPO = new DocumentPO();
		BeanUtils.copyProperties(documentBO, documentPO);
		
		DocTypePO docType = docTypeDao.getDocById(documentBO.getTypeNO());
		documentPO.setDocType(docType);
		
		return documentPO;
	}
	
	private DocumentBO po2bo(DocumentPO documentPO){
		
		DocumentBO documentBO = new DocumentBO();
		BeanUtils.copyProperties(documentPO, documentBO);
		
		return documentBO;
	}

}
