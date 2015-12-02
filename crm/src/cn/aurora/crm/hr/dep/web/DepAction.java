package cn.aurora.crm.hr.dep.web;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import cn.aurora.crm.common.utils.MyActionSupport;
import cn.aurora.crm.hr.dep.business.ebi.DepEbi;
import cn.aurora.crm.hr.dep.vo.DepModel;

public class DepAction extends MyActionSupport{
	public DepModel dm = new DepModel();
	private DepEbi depEbi;

	public void setDepEbi(DepEbi depEbi) {
		this.depEbi = depEbi;
	}
	
	public String listPage() {
		List<DepModel> depList = depEbi.findAll();
		ActionContext.getContext().put("depList", depList);
		return DEPACTION_LISTPAGESUCCESS;
	}
	
	public String addDepPage() {
		return DEPACTION_ADDPAGESUCCESS;
	}
	
	public String addDep() {
		depEbi.add(dm);
		return DEPACTION_ADDSUCCESS;
	}
	
}
