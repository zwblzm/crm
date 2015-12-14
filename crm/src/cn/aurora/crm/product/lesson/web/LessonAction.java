package cn.aurora.crm.product.lesson.web;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import cn.aurora.crm.common.utils.MyActionSupport;
import cn.aurora.crm.product.lesson.business.ebi.LessonEbi;
import cn.aurora.crm.product.lesson.vo.LessonModel;


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
		if(lm !=null){
			lm = new LessonModel();
		}
		return LESSONACTION_ADDPAGE;
	}
	
	public String addLesson() {
		lessonEbi.addLesson(lm);
		
		return LESSONACTION_ADDLESSON;
	}
	public String editPage() {
		if(lm.getUuid() != null) {
			
			lm = lessonEbi.get(lm.getUuid());
			return LESSONACTION_EDITPAGESUCCESS;
		} else{
			addFieldError("editerror", "对不起，没有相关信息！");
			return LESSONACTION_EDITPAGEERROR;
		}
	}
	
	public String edit() {
		lessonEbi.updateLesson(lm);
		return LESSONACTION_LISTPAGE;
	}
}
