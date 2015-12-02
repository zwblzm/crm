package cn.aurora.crm.hr.dep.business.ebo;

import java.util.List;

import cn.aurora.crm.common.utils.UUIDUtils;
import cn.aurora.crm.hr.dep.business.ebi.DepEbi;
import cn.aurora.crm.hr.dep.dao.dao.DepDao;
import cn.aurora.crm.hr.dep.vo.DepModel;

public class DepEbo implements DepEbi{
	private DepDao depDao;

	public void setDepDao(DepDao depDao) {
		this.depDao = depDao;
	}

	@Override
	public List<DepModel> findAll() {
		// TODO Auto-generated method stub
		List<DepModel> depList = depDao.findAll();
		return depList;
	}

	@Override
	public void add(DepModel dm) {
		// TODO Auto-generated method stub
		dm.setId(UUIDUtils.getUUID());
		depDao.add(dm);
	}
	
	
}
