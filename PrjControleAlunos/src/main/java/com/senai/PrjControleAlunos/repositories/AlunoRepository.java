package com.senai.PrjControleAlunos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.PrjControleAlunos.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
