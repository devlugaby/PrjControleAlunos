package com.senai.PrjControleAlunos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.senai.PrjControleAlunos.entities.Aluno;
import com.senai.PrjControleAlunos.services.AlunoService;

public class AlunoController {
	
	 @Autowired
	    private AlunoService alunoService;

	    @GetMapping
	    public ResponseEntity<List<Aluno>> consultarTodosAlunos() {
	        return alunoService.consultarTodosAlunos();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Aluno> consultarAlunoPorId(@PathVariable Long id) {
	        return alunoService.consultarAlunoPorId(id);
	    }

	    @PostMapping
	    public Aluno salvarAluno(@RequestBody Aluno aluno) {
	        return alunoService.saveAluno(aluno);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Aluno> atualizarAluno(@PathVariable Long id, @RequestBody Aluno alunoAtualizado) {
	        return alunoService.atualizarAluno(id, alunoAtualizado);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deletarAluno(@PathVariable Long id) {
	        return alunoService.deleteAluno(id);
	    }
}
