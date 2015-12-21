package cn.aurora.crm.product.clazz.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.aurora.crm.product.clazz.dao.dao.ClazzDao;
import cn.aurora.crm.product.clazz.vo.ClazzModel;

public class ClazzImpl extends HibernateDaoSupport implements ClazzDao{

	@Override
	public void addClazz(ClazzModel cm) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(cm);
	}

	@Override
	public List<ClazzModel> findAll() {
		// TODO Auto-generated method stub
		String hql="FROM ClazzModel";
		List<ClazzModel> clazzs = this.getHibernateTemplate().find(hql);
		return clazzs;
	}

}
