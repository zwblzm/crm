package cn.aurora.crm.hr.emp.vo;

import cn.aurora.crm.hr.dep.vo.DepModel;
import cn.aurora.crm.hr.position.vo.PosModel;

public class EmpModel {
	private String id;
	private String code;
	private String name;
	private String realName;
	private String password;
	private String repassword;
	private Integer gender ;
	private Long birthday;
	private Long entryTime;
	private Integer status;
	
	private PosModel pos;
	
	
	public PosModel getPos() {
		return pos;
	}
	public void setPos(PosModel pos) {
		this.pos = pos;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Long getBirthday() {
		return birthday;
	}
	public void setBirthday(Long birthday) {
		this.birthday = birthday;
	}
	public Long getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Long entryTime) {
		this.entryTime = entryTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
	
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	@Override
	public String toString() {
		return "EmpModel [id=" + id + ", code=" + code + ", name=" + name
				+ ", realName=" + realName + ", password=" + password
				+ ", repassword=" + repassword + ", gender=" + gender
				+ ", birthday=" + birthday + ", entryTime=" + entryTime
				+ ", status=" + status + ", pos=" + pos + "]";
	}
	
	
	
	
}
