/**
 * 
 */
package com.brsc.bean.po;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author YuTian
 *
 * 登陆用户表
 */
@Entity
@Table(name="TBL_USER")
public class UserPO {

	private Integer userNo;
	private String  userName;
	private String  userPassword;
	private Date    preTime;
	private String  preIP;
	private StaffInfoPO staff;
	
	@Id
	@GeneratedValue
	public Integer getUserNo() {
		return userNo;
	}
	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}
	@Column
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Column
	public Date getPreTime() {
		return preTime;
	}
	public void setPreTime(Date preTime) {
		this.preTime = preTime;
	}
	@Column
	public String getPreIP() {
		return preIP;
	}
	public void setPreIP(String preIP) {
		this.preIP = preIP;
	}
	@OneToOne
	@JoinColumn(name="staffNo")
	public StaffInfoPO getStaff() {
		return staff;
	}
	public void setStaff(StaffInfoPO staff) {
		this.staff = staff;
	}
	
	
}
