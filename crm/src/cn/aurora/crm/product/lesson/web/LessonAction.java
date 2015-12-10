package cn.aurora.crm.product.lesson.web;

import java.util.List;

import cn.aurora.crm.common.utils.MyActionSupport;
import cn.aurora.crm.product.lesson.business.ebi.LessonEbi;
import cn.aurora.crm.product.lesson.vo.LessonModel;

import com.opensymphony.xwork2.ActionContext;

public class LessonAction extends MyActionSupport{
	public LessonModel lm = new LessonModel();
	
	private LessonEbi lessonEbi;

	public void setLessonEbi(LessonEbi lessonEbi) {
		this.lessonEbi = lessonEbi;
	}
	
	public String listPage() {
		List<LessonModel> lms = lessonEbi.findAll();
		ActionContext.getContext().put("lms", lms);
		return LESSONACTION_LISTPAGE;
	}
	
	public String addPage() {
		lm=null;
		return LESSONACTION_ADDPAGE;
	}
	
	public String addLesson() {
		lessonEbi.addLesson(lm);
		
		return LESSONACTION_ADDLESSON;
	}
}
