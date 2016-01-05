package cn.aurora.crm.hr.position.business.ebi;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.aurora.crm.hr.position.vo.PosModel;

@Transactional
public interface PosEbi {

	void addPos(PosModel pm);

	List<PosModel> findAll();

	List<PosModel> findByDid(String id);

}
