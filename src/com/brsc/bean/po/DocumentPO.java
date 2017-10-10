/**
 * 
 */
package com.brsc.bean.po;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author YuTian
 *
 * 文书表
 */
@Entity
@Table(name="TBL_DOUCMENT_INFO")
@Inheritance(strategy=InheritanceType.JOINED)
public class DocumentPO {
	
	private Integer docNo;
	private String  title;
	private String  content;
	private StaffInfoPO staff;
	private Set<UnitPO>  recUnits;
	private DocTypePO docType;
	
	
	public DocumentPO() {
		recUnits = new HashSet<UnitPO>();
	}
	@Id
	@GeneratedValue
	public Integer getDocNo() {
		return docNo;
	}
	public void setDocNo(Integer docNo) {
		this.docNo = docNo;
	}
	@Column
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Lob
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@OneToOne
	@JoinColumn(name="staffNo")
	public StaffInfoPO getStaff() {
		return staff;
	}
	public void setStaff(StaffInfoPO staff) {
		this.staff = staff;
	}
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="docType")
	public DocTypePO getDocType() {
		return docType;
	}
	@OneToMany
	@JoinColumn(name="unitNo")
	public Set<UnitPO> getRecUnits() {
		return recUnits;
	}
	public void setRecUnits(Set<UnitPO> recUnits) {
		this.recUnits = recUnits;
	}
	public void setDocType(DocTypePO docType) {
		this.docType = docType;
	}
}
