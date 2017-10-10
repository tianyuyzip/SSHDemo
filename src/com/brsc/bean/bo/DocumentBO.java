/**
 * 
 */
package com.brsc.bean.bo;

/**
 * @author YuTian
 *
 */
public class DocumentBO {

	private Integer docNO;
	private String title;
	private String content;
	private Integer typeNO;
	private String typeName;
	
	public Integer getDocNO() {
		return docNO;
	}
	public void setDocNO(Integer docNO) {
		this.docNO = docNO;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getTypeNO() {
		return typeNO;
	}
	public void setTypeNO(Integer typeNO) {
		this.typeNO = typeNO;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
}
