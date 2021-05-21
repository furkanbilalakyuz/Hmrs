package com.example.hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hmrs.business.abstracts.PositionService;
import com.example.hmrs.entities.concretes.Positions;


@RestController
@RequestMapping("/api/positions")
public class PositionsController {
	private PositionService positionService;
	@Autowired
	public PositionsController(PositionService positionService) {
		this.positionService = positionService;
	}

	@GetMapping("/getall")
	public List<Positions> getAll(){
		return this.positionService.getAll();
		
	}
}
