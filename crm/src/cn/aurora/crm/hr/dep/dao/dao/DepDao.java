package cn.aurora.crm.hr.dep.dao.dao;

import java.util.List;

import cn.aurora.crm.hr.dep.vo.DepModel;

public interface DepDao {

	List<DepModel> findAll();

	void add(DepModel dm);

}
