package org.web.mapper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.web.dtos.ProjectDTO;
import org.web.model.Project;

@Component
public class ProjectMapper {

	
	public ProjectMapper() {}
	
	public Project mapProjectDtoToProject(ProjectDTO projectDto){
//		Project project = modelMapper.map(projectDto, Project.class);
//		try {
//			DateFormat format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
//			project.setStartDate(format.parse(projectDto.getStartDate()));
//			project.setEndDate(format.parse(projectDto.getEndDate()));
//		}catch(ParseException e) {
//			project.setStartDate(null);
//			project.setEndDate(null);
//		}
//		return project;
		return null;
	}
	
}
