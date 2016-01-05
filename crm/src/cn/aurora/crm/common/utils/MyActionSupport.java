package cn.aurora.crm.common.utils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MyActionSupport extends ActionSupport{
	
	public Integer pageNum=1;
	public Integer preNum=2;
	public Integer totalPage = 0;

	protected static final String FRAME_TOPPAGESUCCESS="topPageSuccess";
	protected static final String FRAME_CONTROLPAGESUCCESS="controlPageSuccess";
	protected static final String FRAME_LEFTPAGESUCCESS="leftPageSuccess";
	protected static final String FRAME_LEFT1PAGESUCCESS="left1PageSuccess";
	protected static final String FRAME_LEFT2PAGESUCCESS="left2PageSuccess";
	protected static final String FRAME_RIGHTPAGESUCCESS="rightPageSuccess";
	
	protected static final String EMPACTION_LOGINSUCCESS="loginSuccess";
	protected static final String EMPACTION_LOGINERROR="loginError";
	protected static final String EMPACTION_REGISTPAGE="registPage";
	protected static final String EMPACTION_REGISTSUCCESS="registSuccess";
	protected static final String EMPACTION_LISTPAGE="listpage";
	protected static final String EMPACTION_EDITPAGE="editpage";
	protected static final String EMPACTION_EMPUPD="empupd";
	
	protected static final String DEPACTION_LISTPAGESUCCESS="listPageSuccess";
	protected static final String DEPACTION_ADDSUCCESS="addSuccess";
	protected static final String DEPACTION_ADDPAGESUCCESS="addPageSuccess";
	
	protected static final String POSITIONACTION_ADDSUCCESS="addSuccess";
	protected static final String POSITIONACTION_ADDPAGESUCCESS="addPageSuccess";
	protected static final String POSITIONACTION_LISTPAGESUCCESS="listPageSuccess";
	protected static final String POSITIONACTION_AJAXSUCCESS="ajaxSuccess";
	
	protected static final String LESSONACTION_LISTPAGE="listPageSuccess";
	protected static final String LESSONACTION_ADDPAGE="addPageSuccess";
	protected static final String LESSONACTION_ADDLESSON="addSuccess";
	protected static final String LESSONACTION_EDITPAGESUCCESS="editPageSuccess";
	protected static final String LESSONACTION_EDITPAGEERROR="editPageError";
	
	protected static final String CLAZZACTION_LISTPAGE="listpage";
	protected static final String CLAZZACTION_ADDPAGE="addpage";
	protected static final String CLAZZACTION_ADDSUCCESS="addSuccess";
	protected static final String FRAME_PAGESUCCESS="pageSuccess";
	
	protected void setTotalPage(Integer count) {
		this.totalPage = (count+preNum-1)/preNum;
	}
	
	protected  void putRequest(String name, Object value) {
		ActionContext.getContext().put(name, value);
	}
	
	protected  void putSession(String name, Object value) {
		ActionContext.getContext().getSession().put(name, value);
	}
	
	
}
