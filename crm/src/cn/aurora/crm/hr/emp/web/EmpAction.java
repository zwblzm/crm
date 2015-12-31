package cn.aurora.crm.hr.emp.web;

import java.util.List;

import cn.aurora.crm.common.utils.MyActionSupport;
import cn.aurora.crm.hr.dep.business.ebi.DepEbi;
import cn.aurora.crm.hr.emp.business.ebi.EmpEbi;
import cn.aurora.crm.hr.emp.vo.EmpModel;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class EmpAction extends MyActionSupport{
	public EmpModel em = new EmpModel();
	private EmpEbi empEbi;
	private DepEbi depEbi;

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
		System.out.println(em);
		empEbi.addEmploy(em);
		return EMPACTION_REGISTSUCCESS;
	}
	
	public String listPage() {
		List<EmpModel> emps = empEbi.findAll();
		System.out.println(emps);
		putRequest("emps", emps);
		return EMPACTION_LISTPAGE;
	}
	
	public String toUpd() {
		em = empEbi.getByUuid(em.getId());
		
		
		
		return null;
	}
	
}
