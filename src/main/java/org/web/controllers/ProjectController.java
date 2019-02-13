package org.web.controllers;

import static org.web.utils.ExpositionUtils.GET_ALL_PROJECTS;
import static org.web.utils.ExpositionUtils.SAVE_PROJECT;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.web.dtos.ProjectDTO;
import org.web.mapper.ProjectMapper;
import org.web.model.Project;
import org.web.service.ProjectService;;

@RestController
public class ProjectController {

	private ProjectService projectService;
	private HttpStatus httpStatus;

	@Autowired
	@Qualifier("projectMapper")
	private ModelMapper modelMapper;
	
	
	@Autowired
	public ProjectController(ProjectService projectService,
							HttpStatus httpStatus) {
		this.projectService = projectService;
		this.httpStatus = httpStatus;
	}
	
	@RequestMapping(value = GET_ALL_PROJECTS, method = RequestMethod.GET)
	public List<Project> getAllProjects(){
		return projectService.getAllProjects();
	}
	

	@RequestMapping(value = SAVE_PROJECT, method = RequestMethod.POST)
	public ResponseEntity<String> saveProject(ProjectDTO projectDto){
		Project project = modelMapper.map(projectDto, Project.class);
		String projectId = Integer.toString(projectService.saveProject(project).getId());
		return new ResponseEntity<String>(projectId, httpStatus);
	}
	
}