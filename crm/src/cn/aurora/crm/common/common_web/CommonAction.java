package cn.aurora.crm.common.common_web;

import cn.aurora.crm.common.utils.MyActionSupport;

public class CommonAction extends MyActionSupport{

	public String topPage() {
		return FRAME_TOPPAGESUCCESS;
	}
	
	public String controlPage() {
		return FRAME_CONTROLPAGESUCCESS;
	}
	
	public String leftPage() {
		return FRAME_LEFTPAGESUCCESS;
	}
	
	public String left1Page() {
		return FRAME_LEFT1PAGESUCCESS;
	}
	
	public String left2Page() {
		return FRAME_LEFT2PAGESUCCESS;
	}
	
	public String rightPage() {
		return FRAME_RIGHTPAGESUCCESS;
	}
	
	public String page() {
		return FRAME_PAGESUCCESS;
	}
}
