package cn.aurora.crm.hr.emp.business.ebo;

import cn.aurora.crm.hr.emp.business.ebi.EmpEbi;
import cn.aurora.crm.hr.emp.dao.dao.EmpDao;
import cn.aurora.crm.hr.emp.vo.EmpModel;

public class EmpEbo implements EmpEbi{
	private EmpDao empDao;

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public EmpModel findByName(EmpModel em) {
		// TODO Auto-generated method stub
		EmpModel existModel = empDao.findByName(em);
		return existModel;
	}
	
	
}
