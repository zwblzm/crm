package cn.aurora.crm.product.clazz.vo;

import cn.aurora.crm.product.lesson.vo.LessonModel;

public class ClazzModel {
	private String id;
	private String name;
	private Long openTime;
	private Long endTime;
	private Integer status;
	private Integer total;
	private Integer upNum;
	private Integer downNum;
	
	private LessonModel lesson = new LessonModel();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Long openTime) {
		this.openTime = openTime;
	}

	public Long getEndTime() {
		return endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getUpNum() {
		return upNum;
	}

	public void setUpNum(Integer upNum) {
		this.upNum = upNum;
	}

	public Integer getDownNum() {
		return downNum;
	}

	public void setDownNum(Integer downNum) {
		this.downNum = downNum;
	}

	public LessonModel getLesson() {
		return lesson;
	}

	public void setLesson(LessonModel lesson) {
		this.lesson = lesson;
	}

	@Override
	public String toString() {
		return "ClazzModel [id=" + id + ", name=" + name + ", openTime="
				+ openTime + ", endTime=" + endTime + ", status=" + status
				+ ", total=" + total + ", upNum=" + upNum + ", downNum="
				+ downNum + ", lesson=" + lesson + "]";
	}
	
	
	
}
