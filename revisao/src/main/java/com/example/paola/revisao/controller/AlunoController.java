package com.example.paola.revisao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.paola.revisao.entities.Aluno;
import com.example.paola.revisao.services.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

private final AlunoService alunoService;
	
	@Autowired
	public AlunoController(AlunoService alunoService) {
		this.alunoService = alunoService;
	}
	
	@PostMapping
	public Aluno createProduct(@RequestBody Aluno aluno) {
		return alunoService.saveProduto(aluno);
	}
	
	@GetMapping("/{id}")
	public Aluno getProduto(@PathVariable Long id) {
		return alunoService.getProdutobyId(id);
	}
	
	@GetMapping
	public List<Aluno> getAllProdutos () {
		return alunoService.getAllProdutos();
		}
	
	@DeleteMapping("/{id}")
	public void deleteProduto (@PathVariable Long id) {
		alunoService.deleteProduto(id);
	}

	

}
