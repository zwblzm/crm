package cn.aurora.crm.hr.position.web;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;

import com.opensymphony.xwork2.ActionContext;

import cn.aurora.crm.common.utils.MyActionSupport;
import cn.aurora.crm.hr.dep.business.ebi.DepEbi;
import cn.aurora.crm.hr.dep.vo.DepModel;
import cn.aurora.crm.hr.position.business.ebi.PosEbi;
import cn.aurora.crm.hr.position.vo.PosModel;

public class PosAction extends MyActionSupport{
	public PosModel pm = new PosModel();
	private PosEbi posEbi;
	private DepEbi depEbi;
	private List<PosModel> posList;
	
	
	public List<PosModel> getPosList() {
		return posList;
	}
	public void setDepEbi(DepEbi depEbi) {
		this.depEbi = depEbi;
	}
	public void setPosEbi(PosEbi posEbi) {
		this.posEbi = posEbi;
	}
	public String addPosPage() {
		List<DepModel> deps = depEbi.findAll();
		ActionContext.getContext().put("deps", deps);
		return POSITIONACTION_ADDPAGESUCCESS;
	}
	
	public String listPage() {
		List<PosModel> poss = posEbi.findAll();
		ActionContext.getContext().put("poss", poss);
		return POSITIONACTION_LISTPAGESUCCESS;
	}
	
	public String posAdd() {
		
		posEbi.addPos(pm);
		
		return POSITIONACTION_ADDSUCCESS;
	}
	
	public String ajaxGetPosition() {
		posList = posEbi.findByDid(pm.getDm().getId());
		
		
		return POSITIONACTION_AJAXSUCCESS;
	}
	
}
