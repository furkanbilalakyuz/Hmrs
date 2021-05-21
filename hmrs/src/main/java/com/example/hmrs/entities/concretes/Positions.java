package com.example.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="positions")



public class Positions {

	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	      
	private int ID;
	
	@Column(name = "position_name")
	private String PositionName;


	public Positions(int iD, String positionName) {
		super();
		ID = iD;
		PositionName = positionName;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getPositionName() {
		return PositionName;
	}


	public void setPositionName(String positionName) {
		PositionName = positionName;
	}
	
}
