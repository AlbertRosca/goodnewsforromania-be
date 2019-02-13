package org.web.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.web.model.Family;

@Repository
public interface FamilyRepository extends JpaRepository<Family, Long>{
	
	Family save(Family family);
	
	List<Family> findAll();
}
