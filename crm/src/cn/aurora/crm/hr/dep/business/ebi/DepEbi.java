package cn.aurora.crm.hr.dep.business.ebi;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.aurora.crm.hr.dep.vo.DepModel;

@Transactional
public interface DepEbi {

	List<DepModel> findAll();

	void add(DepModel dm);

}
