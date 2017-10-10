/**
 * 
 */
package com.brsc.bean.po;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author YuTian
 *
 * 单位
 */
@Entity
@Table(name="TBL_UNIT")
public class UnitPO {

	private Integer unitNo;
	private String  unitName;
	private String  unitAddr;
	private String  unitCode;
	private Long    phone;
	private AreaPO  areaPO;
	private UnitPO  parentUnit;
	private String  nature;
	
	@Id
	@GeneratedValue
	public Integer getUnitNo() {
		return unitNo;
	}
	public void setUnitNo(Integer unitNo) {
		this.unitNo = unitNo;
	}
	@Column(length=100,nullable=false)
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	@Column(nullable=false)
	public String getUnitAddr() {
		return unitAddr;
	}
	public void setUnitAddr(String unitAddr) {
		this.unitAddr = unitAddr;
	}
	@Column(length=20,nullable=false)
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	@Column(length=11,nullable=false)
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="areaNo")
	public AreaPO getAreaPO() {
		return areaPO;
	}
	public void setAreaPO(AreaPO areaPO) {
		this.areaPO = areaPO;
	}
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="parentUnit")
	public UnitPO getParentUnit() {
		return parentUnit;
	}
	public void setParentUnit(UnitPO parentUnit) {
		this.parentUnit = parentUnit;
	}
	@Column(nullable=false)
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	
}
