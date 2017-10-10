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
 * 检测条例
 */
@Entity
@Table(name="TBL_DEC_RULE")
public class DecRulePO {
	
	private Integer ruleNo;
	private String  ruleName;
	private String  ruleSect;
	private String  memo;
	private Float   score;
	
	@Id
	@GeneratedValue
	public Integer getRuleNo() {
		return ruleNo;
	}
	public void setRuleNo(Integer ruleNo) {
		this.ruleNo = ruleNo;
	}
	@Column
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	@Column
	public String getRuleSect() {
		return ruleSect;
	}
	public void setRuleSect(String ruleSect) {
		this.ruleSect = ruleSect;
	}
	@Column
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Column
	public Float getScore() {
		return score;
	}
	public void setScore(Float score) {
		this.score = score;
	}
}
