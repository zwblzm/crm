package cn.aurora.crm.product.clazz.business.ebi;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.aurora.crm.product.clazz.vo.ClazzModel;

@Transactional
public interface ClazzEbi {

	void addClazz(ClazzModel cm);

	List<ClazzModel> findAll();

}
