package com.iset.stage.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.iset.stage.entities.Etudiant;

public interface EtudiantsRepository extends JpaRepository<Etudiant, Long>{
	
}
