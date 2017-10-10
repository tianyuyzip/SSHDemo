/**
 * 
 */
package com.brsc.bean.po;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author YuTian
 * 执法文书
 */
@Entity
@Table(name="TBL_LAW_DOC")
public class LawDocumentPO extends DocumentPO{

	private Integer lawDocNo;
	private Set<DocumentPO> citeDoc;
	private Set<UnitPO> assisUnits;
	
	public LawDocumentPO() {
		assisUnits = new HashSet<UnitPO>();
		citeDoc = new HashSet<DocumentPO>();
	}

	public Integer getLawDocNo() {
		return lawDocNo;
	}

	public void setLawDocNo(Integer lawDocNo) {
		this.lawDocNo = lawDocNo;
	}
	@ManyToOne(targetEntity=DocumentPO.class,cascade={CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="citeDocNO")
	public Set<DocumentPO> getCiteDoc() {
		return citeDoc;
	}

	public void setCiteDoc(Set<DocumentPO> citeDoc) {
		this.citeDoc = citeDoc;
	}
	@OneToMany(cascade={CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="assisUnitNo")
	public Set<UnitPO> getAssisUnits() {
		return assisUnits;
	}

	public void setAssisUnits(Set<UnitPO> assisUnits) {
		this.assisUnits = assisUnits;
	}
}
