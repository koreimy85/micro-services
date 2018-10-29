package vn.ifi.entities.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vn.ifi.entities.*;
import java.util.*;


import vn.ifi.entities.dao.SocieteRepository;

@RestController
public class SocieteService {
	@Autowired
	private SocieteRepository societeRepository;
	
	@RequestMapping(value="consulterSocietes",method=RequestMethod.GET)
	public List<Societe> listSociete(){
		return societeRepository.findAll();
		
	}
	
	@RequestMapping(value="/rechercheSociete/{id}",method=RequestMethod.GET)
	public Optional<Societe> getSociete(@PathVariable(name="id")Long id){
		return societeRepository.findById(id);
	}
	
	@RequestMapping(value="/AjoutSociete",method=RequestMethod.POST)
	public Societe save(@RequestBody Societe s) {
		return societeRepository.save(s);
		
	}

}
