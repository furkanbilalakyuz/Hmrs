package com.example.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hmrs.entities.concretes.Positions;

public interface PositionsDao extends JpaRepository<Positions,Integer> {

}
