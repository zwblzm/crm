package cn.aurora.crm.product.lesson.dao.dao;

import java.util.List;

import cn.aurora.crm.product.lesson.vo.LessonModel;

public interface LessonDao {

	List<LessonModel> findAll();

	void addLesson(LessonModel lm);

}