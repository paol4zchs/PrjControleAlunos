package com.example.paola.revisao.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.paola.revisao.Repository.AlunoRepository;
import com.example.paola.revisao.entities.Aluno;

@Service
public class AlunoService {

private final AlunoRepository alunoRepository;
	
	public AlunoService(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}
	
	public Aluno saveProduto(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	public Aluno getProdutobyId(Long id) {
		return alunoRepository.findById(id).orElse(null);
	}
	
	public List<Aluno> getAllProdutos() {
		return alunoRepository.findAll();
		}
	
	public void deleteProduto(Long id) {
		alunoRepository.deleteById(id);
	}
	
}


