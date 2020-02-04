package br.com.professorisidro.vitrinevirtual.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.professorisidro.vitrinevirtual.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer> {
 // aqui podem vir outros métodos
	public List<Produto> findAllByNomeContains(String texto);
}
