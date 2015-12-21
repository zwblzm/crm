package cn.aurora.crm.product.lesson.business.ebi;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.aurora.crm.product.lesson.vo.LessonModel;

@Transactional
public interface LessonEbi {

	List<LessonModel> findAll();

	void addLesson(LessonModel lm);

	LessonModel get(String id);

	void updateLesson(LessonModel lm);

	void deleteLesson(String uuid);

}
