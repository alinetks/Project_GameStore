package com.ecommerce.GameStore.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;

	@NotBlank(message = "Insira seu nome completo. Campo obrigatório!") 
	private String nome;

	@Email
	@NotBlank(message = "Insira um email valido. Campo obrigatório!") 
	private String usuario;

	@NotNull(message = "Insira uma senha. Campo obrigatório!") 
	private String senha;

	//@Column(name = "data_nascimento")
	//@DateTimeFormat(pattern = "dd/MM/yyyy")
	//@NotBlank(message = "Insira sua data de nascimento. Campo obrigatório!") 
	
	
	@Column(name = "data_nascimento")
	@JsonFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "O atributo Data de Nascimento é Obrigatório!")
	private LocalDate nascimento;
	
	//Parâmetros
	 
	
		public Usuario(Long id, String nome, String usuario, String senha, LocalDate nascimento) {
			this.id = id;
			this.nome = nome;
			this.usuario = usuario;
			this.senha = senha;
			this.nascimento = nascimento;
		}
		
		public Usuario() { }
	
	//GET AND SET

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	
	

}
