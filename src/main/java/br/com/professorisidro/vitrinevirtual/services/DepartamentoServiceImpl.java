package br.com.professorisidro.vitrinevirtual.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.professorisidro.vitrinevirtual.dao.DepartamentoRepo;
import br.com.professorisidro.vitrinevirtual.model.Departamento;

@Component
public class DepartamentoServiceImpl implements IDepartamentoService{

	@Autowired
	private DepartamentoRepo repo;
	
	@Override
	public void adicionarNovoDepartamento(Departamento depto) {
		repo.save(depto);
	}

	@Override
	public Departamento recuperarDetalhes(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<Departamento> recuperarTodos() {
		// TODO Auto-generated method stub
		return (List<Departamento>)repo.findAll();
	}

}
