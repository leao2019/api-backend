package com.avaliacaotecnica.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avaliacaotecnica.crm.model.Cursos;
@Repository
public interface ClienteRepository extends JpaRepository<Cursos, Long>{
	
	
	
	

}
