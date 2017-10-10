/**
 * 
 */
package com.brsc.service.impl.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.brsc.bean.bo.DocumentBO;
import com.brsc.service.DocumentService;

/**
 * @author YuTian
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/spring/spring.xml")
public class DocumentServiceTest {

	@Resource
	private DocumentService documentService;
	
	@Test
	public void testAdd(){
		
		DocumentBO doc = new DocumentBO();
		doc.setTitle("五一长假啦啦啦");
		doc.setTypeNO(1);
		
		documentService.addDoc(doc);
	}
}
