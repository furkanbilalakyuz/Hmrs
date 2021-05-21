package com.example.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hmrs.business.abstracts.PositionService;
import com.example.hmrs.dataAccess.abstracts.PositionsDao;
import com.example.hmrs.entities.concretes.Positions;
@Service
public class PositionsManager implements PositionService {
	private PositionsDao positionsDao;

	@Autowired
	public PositionsManager(PositionsDao positionsDao) {
		this.positionsDao = positionsDao;
		
	}
	
	
	@Override
	public List<Positions> getAll() {
		
		return this.positionsDao.findAll();
	}
	
	
}
