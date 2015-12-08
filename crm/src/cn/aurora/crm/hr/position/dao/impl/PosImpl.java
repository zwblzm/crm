package cn.aurora.crm.hr.position.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.aurora.crm.hr.position.dao.dao.PosDao;
import cn.aurora.crm.hr.position.vo.PosModel;

public class PosImpl extends HibernateDaoSupport implements PosDao{

	@Override
	public void addPos(PosModel pm) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(pm);
	}

	@Override
	public List<PosModel> findAll() {
		// TODO Auto-generated method stub
		SessionFactory factory = this.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(PosModel.class);
		List<PosModel> poss = criteria.list();
		session.close();
		return poss;
	}

}
