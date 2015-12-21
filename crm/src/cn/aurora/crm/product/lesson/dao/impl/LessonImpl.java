package cn.aurora.crm.product.lesson.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.aurora.crm.product.lesson.dao.dao.LessonDao;
import cn.aurora.crm.product.lesson.vo.LessonModel;

public class LessonImpl extends HibernateDaoSupport implements LessonDao{

	@Override
	public List<LessonModel> findAll() {
		// TODO Auto-generated method stub
		String hql="FROM LessonModel";
		List<LessonModel> lms = this.getHibernateTemplate().find(hql);
		return lms;
	}

	@Override
	public void addLesson(LessonModel lm) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(lm);
	}

	@Override
	public LessonModel get(String id) {
		// TODO Auto-generated method stub
		LessonModel lesson = this.getHibernateTemplate().get(LessonModel.class, id);
		return lesson;
	}

	@Override
	public void updateLesson(LessonModel lm) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(lm);
	}

	@Override
	public void deleteLesson(String uuid) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(uuid);
	}

}
