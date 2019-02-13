package org.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.model.Family;
import org.web.repositories.FamilyRepository;

@Service
public class FamilyService {

	private FamilyRepository families;
	
	@Autowired
	public FamilyService(FamilyRepository families) {
		this.families = families;
	}
	
	public Family saveFamily(Family family) {
		return families.save(family);
	}
	
	public List<Family> getAllFamilies(){
		return families.findAll();
	}
	
}
