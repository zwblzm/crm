package cn.aurora.crm.hr.emp.web;

import java.util.List;

import cn.aurora.crm.common.utils.MyActionSupport;
import cn.aurora.crm.hr.dep.business.ebi.DepEbi;
import cn.aurora.crm.hr.dep.vo.DepModel;
import cn.aurora.crm.hr.emp.business.ebi.EmpEbi;
import cn.aurora.crm.hr.emp.vo.EmpModel;
import cn.aurora.crm.hr.position.business.ebi.PosEbi;
import cn.aurora.crm.hr.position.vo.PosModel;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class EmpAction extends MyActionSupport{
	public EmpModel em = new EmpModel();
	private EmpEbi empEbi;
	private DepEbi depEbi;
	private PosEbi posEbi;
	
	
	

	
	public void setDepEbi(DepEbi depEbi) {
		this.depEbi = depEbi;
	}

	public void setPosEbi(PosEbi posEbi) {
		this.posEbi = posEbi;
	}

	public void setEmpEbi(EmpEbi empEbi) {
		this.empEbi = empEbi;
	}
	
	public String execute() {
		return SUCCESS;
	}
	
	public String login() {
		EmpModel existEmp = empEbi.findByName(em);
		if(existEmp != null) {
			ActionContext.getContext().getSession().put("existEmp", existEmp);
			return EMPACTION_LOGINSUCCESS;
		}else{
			addFieldError("empNull", "用户名或密码错误");
			return EMPACTION_LOGINERROR;
		}
	}
	
	public String registPage() {
		
		return EMPACTION_REGISTPAGE;
	}
	@InputConfig(resultName="registInput")
	public String regist() {
		
		empEbi.addEmploy(em);
		return EMPACTION_REGISTSUCCESS;
	}
	
	public String listPage() {
		List<EmpModel> emps = empEbi.findAll();
		
		putRequest("emps", emps);
		return EMPACTION_LISTPAGE;
	}
	
	public String toUpd() {
		//获取员工信息
		em = empEbi.findByUuid(em.getUuid());
		//获取部门信息
		List<DepModel> deps = depEbi.findAll();
		List<PosModel> poss = posEbi.findAll();
		
		putRequest("deps", deps);
		putRequest("poss", poss);
		return EMPACTION_EDITPAGE;
	}
	
	public String upd() {
		return EMPACTION_EMPUPD;
	}
	
}
