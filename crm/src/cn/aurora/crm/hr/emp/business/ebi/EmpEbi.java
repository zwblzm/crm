package cn.aurora.crm.hr.emp.business.ebi;

import org.springframework.transaction.annotation.Transactional;

import cn.aurora.crm.hr.emp.vo.EmpModel;
@Transactional
public interface EmpEbi {

	EmpModel findByName(EmpModel em);

}
