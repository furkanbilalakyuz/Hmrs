package com.example.hmrs.business.abstracts;

import java.util.List;

import com.example.hmrs.entities.concretes.Positions;

public interface PositionService {
	List<Positions> getAll();
}
