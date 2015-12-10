package cn.aurora.crm.hr.emp.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.aurora.crm.hr.emp.dao.dao.EmpDao;
import cn.aurora.crm.hr.emp.vo.EmpModel;

public class EmpImpl extends HibernateDaoSupport implements EmpDao{

	@Override
	public EmpModel findByName(EmpModel em) {
		// TODO Auto-generated method stub
		String hql="FROM EmpModel WHERE name=? and password=?";
		List<EmpModel> emps = this.getHibernateTemplate().find(hql, em.getName(),em.getPassword());
		
		return emps.size()>0?emps.get(0):null;
	}

	@Override
	public void addEmploy(EmpModel em) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(em);
	}

}
