package com.senai.PrjControleAlunos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAluno;
	
	private String nome;
	
	private String cpf;
	
	private String rg;
	
	private String endereco;
	
	//gets e sets
	
	public Long getIdAluno() {
		return idAluno;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
