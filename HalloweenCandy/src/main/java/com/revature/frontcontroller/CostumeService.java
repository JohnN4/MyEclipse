package com.revature.frontcontroller;

import java.util.List;

import com.revature.daos.CostumeDao;
import com.revature.frontcontroller.Costume;

/**
 * Service layer - Home of business logic for the costume API
 *
 */
public class CostumeService {
	
	CostumeDao costumeDao = new CostumeDao();

	public Costume getCostumeById(int id) {
		return costumeDao.getById(id);
	}
	
	public List<Costume> getAllCostumes() {
		
		return null;
	}
	
	public Costume saveCostume(Costume costume) {
		// should do some validation
		// ...but we're not
		
		return costumeDao.save(costume);
	}
	
}
