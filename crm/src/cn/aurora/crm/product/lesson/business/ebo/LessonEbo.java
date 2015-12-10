package cn.aurora.crm.product.lesson.business.ebo;

import java.util.List;

import cn.aurora.crm.common.utils.UUIDUtils;
import cn.aurora.crm.product.lesson.business.ebi.LessonEbi;
import cn.aurora.crm.product.lesson.dao.dao.LessonDao;
import cn.aurora.crm.product.lesson.vo.LessonModel;

public class LessonEbo implements LessonEbi{
	private LessonDao lessonDao;

	public void setLessonDao(LessonDao lessonDao) {
		this.lessonDao = lessonDao;
	}

	@Override
	public List<LessonModel> findAll() {
		// TODO Auto-generated method stub
		List<LessonModel> lms = lessonDao.findAll();
		return lms;
	}

	@Override
	public void addLesson(LessonModel lm) {
		// TODO Auto-generated method stub
		lm.setId(UUIDUtils.getUUID());
		lessonDao.addLesson(lm);
	}
	
	
}
