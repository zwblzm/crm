package cn.aurora.crm.hr.emp.dao.dao;

import java.util.List;

import cn.aurora.crm.hr.emp.vo.EmpModel;

public interface EmpDao {

	EmpModel findByName(EmpModel em);

	void addEmploy(EmpModel em);

	List<EmpModel> findAll();

	EmpModel findByUuid(String id);

}
