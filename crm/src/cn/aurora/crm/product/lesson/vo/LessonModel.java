package cn.aurora.crm.product.lesson.vo;

public class LessonModel {
	private String id;
	private String name;
	private Integer total;
	private Double price;
	private String descript;
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
		return "LessonModel [id=" + id + ", name=" + name + ", total=" + total
				+ ", price=" + price + ", descript=" + descript + "]";
	}
	
	
	
}
