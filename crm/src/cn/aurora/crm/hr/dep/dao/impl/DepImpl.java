package cn.aurora.crm.hr.dep.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.aurora.crm.hr.dep.dao.dao.DepDao;
import cn.aurora.crm.hr.dep.vo.DepModel;

public class DepImpl extends HibernateDaoSupport implements DepDao{

	@Override
	public List<DepModel> findAll() {
		// TODO Auto-generated method stub
		String hql="FROM DepModel";
		List<DepModel> depList = this.getHibernateTemplate().find(hql);
		return depList;
	}

	@Override
	public void add(DepModel dm) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(dm);
	}
	
	
}
