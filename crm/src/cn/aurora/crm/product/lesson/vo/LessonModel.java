package cn.aurora.crm.product.lesson.vo;

import cn.aurora.crm.common.utils.FormatUtils;

public class LessonModel {
	private String uuid;
	private String name;
	private Integer total;
	private Double price;
	private String descript;
	
	private String priceView;
	
	
	public String getPriceView() {
		return priceView;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		priceView=FormatUtils.formatPrice(price);
		this.price = price;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	@Override
	public String toString() {
		return "LessonModel [id=" + uuid + ", name=" + name + ", total=" + total
				+ ", price=" + price + ", descript=" + descript + "]";
	}
	
	
	
}
