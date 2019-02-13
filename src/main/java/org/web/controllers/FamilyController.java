package org.web.controllers;

import static org.web.utils.ExpositionUtils.GET_ALL_FAMILIES;
import static org.web.utils.ExpositionUtils.SAVE_FAMILY;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.web.dtos.FamilyDTO;
import org.web.model.Family;
import org.web.service.FamilyService;

@RestController
public class FamilyController {

	private FamilyService familyService;
	private HttpStatus httpStatus;
	private ModelMapper modelMapper;
	
	@Autowired
	public FamilyController(FamilyService familyService,
			HttpStatus httpStatus,
			ModelMapper modelMapper) {
		this.familyService = familyService;
		this.httpStatus = httpStatus;
		this.modelMapper = modelMapper;
	}
	
	@RequestMapping(value = GET_ALL_FAMILIES, method = RequestMethod.GET)
    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }
	
	@RequestMapping(value = SAVE_FAMILY, method = RequestMethod.POST)
	public  ResponseEntity<String> saveFamily(FamilyDTO famDto) {
		Family family = modelMapper.map(famDto, Family.class);
		String familyId = Integer.toString(familyService.saveFamily(family).getId());
		return new ResponseEntity<String>(familyId,httpStatus);
	}
	
}
