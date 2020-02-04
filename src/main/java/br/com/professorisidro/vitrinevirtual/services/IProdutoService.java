package br.com.professorisidro.vitrinevirtual.services;

import java.util.List;

import br.com.professorisidro.vitrinevirtual.model.Produto;

public interface IProdutoService {
	public List<Produto> recuperarTodos();
	public Produto recuperarPorId(int id);
	public void novoProduto(Produto produto);
	public List<Produto> buscarPorPalavraChave(String palavra);
}
