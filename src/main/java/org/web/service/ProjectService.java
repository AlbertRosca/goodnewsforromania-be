package org.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.model.Project;
import org.web.repositories.ProjectRepository;

@Service
public class ProjectService {

	private ProjectRepository projects;
	
	@Autowired
	public ProjectService(ProjectRepository projects) {
		this.projects = projects;
	}
	
	public Project saveProject(Project project) {
		return projects.save(project);
	}
	
	public List<Project> getAllProjects(){
		return projects.findAll();
	}
	
}
