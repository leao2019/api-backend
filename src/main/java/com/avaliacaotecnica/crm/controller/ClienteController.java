package com.avaliacaotecnica.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacaotecnica.crm.model.Cursos;
import com.avaliacaotecnica.crm.repository.ClienteRepository;

@RestController
@RequestMapping("/cursos")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping
	public List<Cursos> listar() {
		return clienteRepository.findAll();

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cursos adicionar(@RequestBody Cursos cursos) {
		return clienteRepository.save(cursos);
	}

	@DeleteMapping("/cursos")
	public ResponseEntity<String> delete(@RequestParam Long Id) {
		clienteRepository.deleteById(Id);
		return new ResponseEntity<String>("Usuário deletado com sucesso", HttpStatus.OK);
	}

	@PutMapping("/cursos")
	public ResponseEntity<String> atualizar(@RequestParam Long Id) {
		clienteRepository.save(null);

		return new ResponseEntity<String>("Usuário atualizado com sucesso", HttpStatus.OK);
	}
}
