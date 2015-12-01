package cn.aurora.crm.hr.emp.web;

import com.opensymphony.xwork2.ActionContext;

import cn.aurora.crm.common.utils.MyActionSupport;
import cn.aurora.crm.hr.emp.business.ebi.EmpEbi;
import cn.aurora.crm.hr.emp.vo.EmpModel;

public class EmpAction extends MyActionSupport{
	public EmpModel em = new EmpModel();
	private EmpEbi empEbi;

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
	
}
