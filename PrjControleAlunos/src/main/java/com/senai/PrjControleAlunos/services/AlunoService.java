package com.senai.PrjControleAlunos.services;


import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.senai.PrjControleAlunos.entities.Aluno;
import com.senai.PrjControleAlunos.repositories.AlunoRepository;

@Service
public class AlunoService {
	private final AlunoRepository alunoRepository;

	public AlunoService(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}

	public Aluno saveAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}

	public Aluno getAlunoById(Long Id) {
		return alunoRepository.findById(Id).orElse(null);
	}

	public List<Aluno> getAllAluno() {
		return alunoRepository.findAll();
	}

	public ResponseEntity<Void> deleteAluno(Long id) {
		alunoRepository.deleteById(id);
		return null;
	}

	// fazendo o update do jogo com o optional
	public Aluno updateAluno(Long id, Aluno novoAluno) {
		Optional<Aluno> alunoOptional = alunoRepository.findById(id);
		if (alunoOptional.isPresent()) {
			Aluno alunoExistente = alunoOptional.get();
			alunoExistente.setNome(novoAluno.getNome());
			alunoExistente.setEndereco(novoAluno.getEndereco());
			return alunoRepository.save(alunoExistente);
		} else {
			return null;
		}
	}

	public ResponseEntity<Aluno> consultarAlunoPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<List<Aluno>> consultarTodosAlunos() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<Aluno> atualizarAluno(Long id, Aluno alunoAtualizado) {
		// TODO Auto-generated method stub
		return null;
	}
}