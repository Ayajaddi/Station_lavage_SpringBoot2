package com.gestion.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.models.Bus;
import com.gestion.services.BusMetier;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/bus")
public class BusController {
	
	@Autowired
	private BusMetier busMetier ;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public Bus saveOperation(@RequestBody Bus b) {
		return busMetier.saveBus(b);	
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Bus> getOperationByBus(@PathVariable Long matricule) 
	{
		return busMetier.listBus();
		
	}
	
	@RequestMapping(value="/getByMatricule/{matricule}", method=RequestMethod.GET)
	public Bus getBusByMatricule(@PathVariable Long matricule) 
	{
		return busMetier.getBusByMatricule(matricule);
		
	}

}
