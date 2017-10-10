/**
 * 
 */
package com.brsc.bean.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author YuTian
 *
 */
@Entity
@Table(name="TBL_DOCUMENT_TYPE")
public class DocTypePO {
	
	private Integer typeNO;
	private String  typeName;
	
	@Id
	@GeneratedValue
	public Integer getTypeNO() {
		return typeNO;
	}
	public void setTypeNO(Integer typeNO) {
		this.typeNO = typeNO;
	}
	@Column
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}	
}
