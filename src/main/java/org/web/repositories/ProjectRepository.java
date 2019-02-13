package org.web.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.web.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
	
	Project save(Project project);
	
	List<Project> findAll();

}
