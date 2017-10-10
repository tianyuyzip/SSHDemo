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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author YuTian
 * 检测明细
 */
@Entity
@Table(name="TBL_DETECT_INFO")
public class DetectInfo {
	
	private Integer detNo;
	private Set<DecRulePO> rules;
	private String  detResult;
	private String  detMemo;
	private DocumentPO document;
	
	
	public DetectInfo() {
		rules = new HashSet<DecRulePO>();
	}
	@Id
	@GeneratedValue
	public Integer getDetNo() {
		return detNo;
	}
	public void setDetNo(Integer detNo) {
		this.detNo = detNo;
	}
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ruleNo")
	public Set<DecRulePO> getRule() {
		return rules;
	}
	public void setRule(Set<DecRulePO> rules) {
		this.rules = rules;
	}
	@Column
	public String getDetResult() {
		return detResult;
	}
	public void setDetResult(String detResult) {
		this.detResult = detResult;
	}
	@Column
	public String getDetMemo() {
		return detMemo;
	}
	public void setDetMemo(String detMemo) {
		this.detMemo = detMemo;
	}
	@OneToOne
	public DocumentPO getDocument() {
		return document;
	}
	public void setDocument(DocumentPO document) {
		this.document = document;
	}
	
}
