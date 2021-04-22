package com.gestion.services;
import java.util.List;

import com.gestion.models.Bus;


public interface BusMetier  {
	 public Bus saveBus(Bus b);
	 public void  updateBus(Bus b);
	 public List<Bus> listBus();
	 //public Optional<Operation> getOperation(Date dateOperation);
	 public Bus getBusByMatricule(Long matricule);
}
