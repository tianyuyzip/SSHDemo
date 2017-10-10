/**
 * 
 */
package com.brsc.service;

import java.util.List;

import com.brsc.bean.bo.DocumentBO;
import com.brsc.bean.po.DocumentPO;

/**
 * @author YuTian
 *
 */
public interface DocumentService {
	
	public boolean addDoc(DocumentBO doc);
	public boolean delDoc(Integer id);
	public boolean uptDoc(DocumentBO doc);
	public DocumentBO getDoc(Integer id);
	public List<DocumentBO> getDocs();

}
