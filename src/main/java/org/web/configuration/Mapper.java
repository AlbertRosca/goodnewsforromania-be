package org.web.configuration;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.web.dtos.ProjectDTO;
import org.web.model.Project;

@Configuration
public class Mapper {
	
	private ProjectMap projectMap;
	
	@Autowired
	public Mapper(ProjectMap projectMap) {
		this.projectMap = projectMap;
	}

	@Bean
	@Qualifier("projectMapper")
	public ModelMapper projectMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.addMappings(projectMap);
		return modelMapper;
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}

@Component
class ProjectMap extends PropertyMap<ProjectDTO, Project>{

	@Override
	protected void configure() {
		skip(destination.getStartDate());
		skip(destination.getEndDate());
		skip(destination.getId());
	}
}