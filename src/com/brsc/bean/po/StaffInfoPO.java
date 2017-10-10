/**
 * 
 */
package com.brsc.bean.po;

import java.util.Date;

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
 * 人员信息
 */
@Entity
@Table(name="TBL_STAFF_INFO")
public class StaffInfoPO {

	private Integer staffNo;
	private String identityId;
	private String name;
	private Date   birthDay;
	private Long   phone;
	private String sex;
	private UnitPO unit;

	@Id
	@GeneratedValue
	public Integer getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(Integer staffNo) {
		this.staffNo = staffNo;
	}
	@Column(length=18,nullable=false)
	public String getIdentityId() {
		return identityId;
	}

	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}
	@Column(length=100,nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	@Column(length=11)
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	@Column(length=1)
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="unitNo")
	public UnitPO getUnit() {
		return unit;
	}
	public void setUnit(UnitPO unit) {
		this.unit = unit;
	}
}
