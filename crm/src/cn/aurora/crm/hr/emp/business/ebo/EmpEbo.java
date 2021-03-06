package cn.aurora.crm.hr.emp.business.ebo;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;

import com.sun.xml.internal.bind.v2.TODO;

import cn.aurora.crm.common.utils.UUIDUtils;
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

	@Override
	public void addEmploy(EmpModel em) {
		// TODO Auto-generated method stub
		em.setUuid(UUIDUtils.getUUID());
		em.setEntryTime(new Date().getTime());
		empDao.addEmploy(em);
	}

	@Override
	public List<EmpModel> findAll() {
		
		List<EmpModel> emps = empDao.findAll();
		return emps;
	}

	@Override
	public EmpModel findByUuid(String id) {
	
		EmpModel em = empDao.findByUuid(id);
		return em;
	}

	@Override
	public void updateEmp(EmpModel em) {
		
		EmpModel temp = empDao.findByUuid(em.getUuid());
		//TODO 完成更新功能
		
	}
	
	
}
