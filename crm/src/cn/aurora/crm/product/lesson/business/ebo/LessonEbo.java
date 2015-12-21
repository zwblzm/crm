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
		lm.setUuid(UUIDUtils.getUUID());
		lessonDao.addLesson(lm);
	}

	@Override
	public LessonModel get(String id) {
		// TODO Auto-generated method stub
		LessonModel lesson = lessonDao.get(id);
		
		return lesson;
	}

	@Override
	public void updateLesson(LessonModel lm) {
		// TODO Auto-generated method stub
		lessonDao.updateLesson(lm);
	}

	@Override
	public void deleteLesson(String uuid) {
		// TODO Auto-generated method stub
		lessonDao.deleteLesson(uuid);
	}
	
	
}
