package br.com.professorisidro.vitrinevirtual.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.professorisidro.vitrinevirtual.dao.UsuarioRepo;
import br.com.professorisidro.vitrinevirtual.model.Usuario;

@Component
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private UsuarioRepo repo;

	@Override
	public Usuario autenticarUsuario(String email, String senha) {
		// TODO Auto-generated method stub
		return repo.findByEmailAndSenha(email, senha);
	}

	@Override
	public List<Usuario> buscarTodos() {
		// TODO Auto-generated method stub
		return (ArrayList<Usuario>)repo.findAll();
	}

}
