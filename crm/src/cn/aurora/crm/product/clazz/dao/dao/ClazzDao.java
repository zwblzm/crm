package cn.aurora.crm.product.clazz.dao.dao;

import java.util.List;

import cn.aurora.crm.product.clazz.vo.ClazzModel;

public interface ClazzDao {

	void addClazz(ClazzModel cm);

	List<ClazzModel> findAll();

}
