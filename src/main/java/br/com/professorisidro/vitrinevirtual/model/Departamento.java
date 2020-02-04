package br.com.professorisidro.vitrinevirtual.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity                          // Departamento é uma entidade
@Table(name="tbldepartamento")   // cujo nome da tabela foi definido
public class Departamento {
	
	@Id                          // id é chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY)  // gerado pelo banco (auto-increment)
	@Column(name="id")           // nome da coluna
	private int id;
	
	@Column(name="nome", length=100)  // aqui definimos nome e tamanho da coluna no banco 
	private String nome;
	@Column(name="localizacao", length=30) 
	private String localizacao;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "depto")
	@JsonIgnoreProperties("depto")
	private List<Produto> produtos;
	
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
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
	

}
