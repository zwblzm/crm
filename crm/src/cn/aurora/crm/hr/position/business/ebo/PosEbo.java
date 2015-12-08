package cn.aurora.crm.hr.position.business.ebo;

import java.util.List;

import cn.aurora.crm.common.utils.UUIDUtils;
import cn.aurora.crm.hr.position.business.ebi.PosEbi;
import cn.aurora.crm.hr.position.dao.dao.PosDao;
import cn.aurora.crm.hr.position.vo.PosModel;

public class PosEbo implements PosEbi{
	private PosDao posDao;

	public void setPosDao(PosDao posDao) {
		this.posDao = posDao;
	}

	@Override
	public void addPos(PosModel pm) {
		// TODO Auto-generated method stub
		pm.setId(UUIDUtils.getUUID());
		System.out.println(pm.getDm().getId());
		posDao.addPos(pm);
	}

	@Override
	public List<PosModel> findAll() {
		// TODO Auto-generated method stub
		List<PosModel> poss = posDao.findAll();
		
		return poss;
	}
	
	
}
