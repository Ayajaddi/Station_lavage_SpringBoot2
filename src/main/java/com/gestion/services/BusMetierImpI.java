package com.gestion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gestion.Repository.BusRepository;
import com.gestion.models.Bus;


@Service
public class BusMetierImpI implements BusMetier {

	@Autowired
	private BusRepository busRepository;

	@Override
	public Bus saveBus(Bus b) {
		return busRepository.save(b) ;
	}

	@Override
	public void updateBus(Bus b) {
		busRepository.save(b) ;
	}

	@Override
	public Bus getBusByMatricule(Long matricule) {
		// TODO Auto-generated method stub
		return busRepository.getOne(matricule);
	}

	@Override
	public List<Bus> listBus() {
		// TODO Auto-generated method stub
		return busRepository.findAll();
	}


}