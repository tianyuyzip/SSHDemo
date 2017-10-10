/**
 * 
 */
package com.brsc.dao.impl.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.brsc.bean.po.DocTypePO;
import com.brsc.bean.po.DocumentPO;
import com.brsc.dao.DocumentDao;

/**
 * @author YuTian
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/spring/spring.xml")
public class DocumentDaoTest {
	
	@Resource
	private DocumentDao documentDao;
	@Test
	public void testAdd(){
		
		DocTypePO docType = new DocTypePO();
		docType.setTypeName("通知");
		
		DocumentPO doc = new DocumentPO();
		doc.setTitle("国庆放假");
		doc.setDocType(docType);
		
		documentDao.add(doc);
	}
	
	@Test
	public void getDocById(){
		
		DocumentPO doc = documentDao.getDocById(2);
		System.out.println(doc.getTitle());
	}
}
