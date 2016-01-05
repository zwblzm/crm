package cn.aurora.crm.hr.position.dao.dao;

import java.util.List;

import cn.aurora.crm.hr.position.vo.PosModel;

public interface PosDao {

	void addPos(PosModel pm);

	List<PosModel> findAll();

	List<PosModel> findByDid(String id);

}
