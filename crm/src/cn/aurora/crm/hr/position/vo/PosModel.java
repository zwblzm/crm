package cn.aurora.crm.hr.position.vo;

import cn.aurora.crm.hr.dep.vo.DepModel;

public class PosModel {
	private String id;
	private String name;
	private DepModel dm;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DepModel getDm() {
		return dm;
	}
	public void setDm(DepModel dm) {
		this.dm = dm;
	}
	@Override
	public String toString() {
		return "PosModel [id=" + id + ", name=" + name + ", dm=" + dm + "]";
	}
	
	
}
