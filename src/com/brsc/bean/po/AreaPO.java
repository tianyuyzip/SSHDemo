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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author YuTian
 * 
 * 区域
 */
@Entity
@Table(name="TBL_AREA")
public class AreaPO {
	
	private Integer areaNo;
	private String  areaName;
	private AreaPO  parent;
	
	private Set<AreaPO> areas;
	
	
	public AreaPO() {
		areas = new HashSet<AreaPO>();
	}
	@Id
	@GeneratedValue
	public Integer getAreaNo() {
		return areaNo;
	}
	public void setAreaNo(Integer areaNo) {
		this.areaNo = areaNo;
	}
	@Column(length=100,nullable=false)
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	@ManyToOne
	@JoinColumn(name="parentArea")
	public AreaPO getParent() {
		return parent;
	}
	public void setParent(AreaPO parent) {
		this.parent = parent;
	}
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="areaNo")
	public Set<AreaPO> getAreas() {
		return areas;
	}
	public void setAreas(Set<AreaPO> areas) {
		this.areas = areas;
	}
	
}
