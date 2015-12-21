package cn.aurora.crm.product.clazz.business.ebo;

import java.util.List;

import cn.aurora.crm.common.utils.UUIDUtils;
import cn.aurora.crm.product.clazz.business.ebi.ClazzEbi;
import cn.aurora.crm.product.clazz.dao.dao.ClazzDao;
import cn.aurora.crm.product.clazz.vo.ClazzModel;

public class ClazzEbo implements ClazzEbi{
	private ClazzDao clazzDao;

	public void setClazzDao(ClazzDao clazzDao) {
		this.clazzDao = clazzDao;
	}

	@Override
	public void addClazz(ClazzModel cm) {
		// TODO Auto-generated method stub
		cm.setId(UUIDUtils.getUUID());
		clazzDao.addClazz(cm);
	}

	@Override
	public List<ClazzModel> findAll() {
		// TODO Auto-generated method stub
		List<ClazzModel> clazz = clazzDao.findAll();
		return clazz;
	}
	
	
}
 