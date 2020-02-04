package br.com.professorisidro.vitrinevirtual.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tblproduto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nome", length = 100)
	private String nome;
	
	@Column(name="detalhes", length = 500)	
	private String detalhes;
	
	@Column(name="preco")
	private float  preco;
	
	@Column(name="linkfoto", length = 200)
	private String linkfoto;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Departamento depto;
	
	@ManyToMany(mappedBy = "compras", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("compras")
	private List<Usuario> compradores;
	
	
	
	

	public List<Usuario> getCompradores() {
		return compradores;
	}

	public void setCompradores(List<Usuario> compradores) {
		this.compradores = compradores;
	}

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

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getLinkfoto() {
		return linkfoto;
	}

	public void setLinkfoto(String linkfoto) {
		this.linkfoto = linkfoto;
	}

	public Departamento getDepto() {
		return depto;
	}

	public void setDepto(Departamento depto) {
		this.depto = depto;
	}

	
}
