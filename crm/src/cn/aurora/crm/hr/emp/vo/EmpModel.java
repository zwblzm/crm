package cn.aurora.crm.hr.emp.vo;

import java.util.HashMap;
import java.util.Map;

import cn.aurora.crm.common.utils.FormatUtils;
import cn.aurora.crm.hr.dep.vo.DepModel;
import cn.aurora.crm.hr.position.vo.PosModel;

public class EmpModel {
	private static final String GENDER_MAN_VIEW = "男";
	private static final String GENDER_WOMAN_VIEW = "女";
	private static final Integer GENDER_MAN = 1;
	private static final Integer GENDER_WOMAN = 2;
	
	//类别视图
	private String genderView;
	//非类别视图
	private String birthdayView;
	private String entryTimeView;
	
	
	public static  Map<Integer, String> genderMap = new HashMap<Integer, String> ();
	
	static {
		genderMap.put(GENDER_MAN, GENDER_MAN_VIEW);
		genderMap.put(GENDER_WOMAN, GENDER_WOMAN_VIEW);
	}
	
	private String uuid;
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
	private DepModel dep;
	
	
	
	
	public DepModel getDep() {
		return dep;
	}
	public void setDep(DepModel dep) {
		this.dep = dep;
	}
	public String getEntryTimeView() {
		return entryTimeView;
	}
	public String getBirthdayView() {
		return birthdayView;
	}
	public String getGenderView() {
		return genderView;
	}
	public PosModel getPos() {
		return pos;
	}
	public void setPos(PosModel pos) {
		this.pos = pos;
	}
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
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
		this.genderView = genderMap.get(gender);
	}
	public Long getBirthday() {
		return birthday;
	}
	public void setBirthday(Long birthday) {
		this.birthday = birthday;
		this.birthdayView = FormatUtils.formatDate(birthday);
	}
	public Long getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Long entryTime) {
		this.entryTime = entryTime;
		this.entryTimeView = FormatUtils.formatDate(entryTime);
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
		return "EmpModel [id=" + uuid + ", code=" + code + ", name=" + name
				+ ", realName=" + realName + ", password=" + password
				+ ", repassword=" + repassword + ", gender=" + gender
				+ ", birthday=" + birthday + ", entryTime=" + entryTime
				+ ", status=" + status + ", pos=" + pos + "]";
	}
	
	
	
	
}
