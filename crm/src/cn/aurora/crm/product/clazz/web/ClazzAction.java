package cn.aurora.crm.product.clazz.web;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import cn.aurora.crm.common.utils.MyActionSupport;
import cn.aurora.crm.product.clazz.business.ebi.ClazzEbi;
import cn.aurora.crm.product.clazz.vo.ClazzModel;
import cn.aurora.crm.product.lesson.business.ebi.LessonEbi;
import cn.aurora.crm.product.lesson.vo.LessonModel;

public class ClazzAction extends MyActionSupport{
	public ClazzModel cm = new ClazzModel();
	private LessonEbi lessonEbi;
	private ClazzEbi clazzEbi;

	
	public void setLessonEbi(LessonEbi lessonEbi) {
		this.lessonEbi = lessonEbi;
	}

	public void setClazzEbi(ClazzEbi clazzEbi) {
		this.clazzEbi = clazzEbi;
	}
	
	public String listPage() {
		List<ClazzModel> clazzs = clazzEbi.findAll();
		putRequest("clazzs", clazzs);
		return CLAZZACTION_LISTPAGE;
	}
	
	public String addPage() {
		List<LessonModel> lessons = lessonEbi.findAll();
		putRequest("lessons", lessons);
		return CLAZZACTION_ADDPAGE;
	}
	
	public String addClazz() {
		
		
		clazzEbi.addClazz(cm);
		cm  =new ClazzModel();
		return CLAZZACTION_ADDSUCCESS;
	}
}
