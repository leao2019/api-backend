package com.avaliacaotecnica.crm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avaliacaotecnica.crm.model.Cursos;

@Repository
public interface CursosRepository extends JpaRepository <Cursos, Long> {
	
	

}
