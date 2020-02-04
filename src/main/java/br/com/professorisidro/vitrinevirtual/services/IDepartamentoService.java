package br.com.professorisidro.vitrinevirtual.services;

import java.util.List;

import br.com.professorisidro.vitrinevirtual.model.Departamento;

public interface IDepartamentoService {

	public void adicionarNovoDepartamento(Departamento depto);
	public Departamento recuperarDetalhes(int id);
	public List<Departamento> recuperarTodos();
}
