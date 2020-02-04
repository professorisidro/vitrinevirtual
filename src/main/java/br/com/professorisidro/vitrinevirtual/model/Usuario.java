package br.com.professorisidro.vitrinevirtual.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tblusuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idusuario")
	private int id;
	@Column(name="nome", length = 100)
	private String nome;
	@Column(name="email", length = 100)
	private String email;
	@Column(name="senha", length = 50)
	private String senha;
	
	@ManyToMany
	@JoinTable(name="tblcompra", 
	           joinColumns = @JoinColumn(name="idusuario"),
	           inverseJoinColumns = @JoinColumn(name="idproduto")
			   )
	@JsonIgnoreProperties("compradores")
	private List<Produto> compras;
		
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public List<Produto> getCompras() {
		return compras;
	}
	public void setCompras(List<Produto> compras) {
		this.compras = compras;
	}

}
