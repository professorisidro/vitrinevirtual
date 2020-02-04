package br.com.professorisidro.vitrinevirtual.services;

import java.util.List;

import br.com.professorisidro.vitrinevirtual.model.Usuario;

public interface IUsuarioService {
	public Usuario autenticarUsuario(String email, String senha);
	public List<Usuario> buscarTodos();

}
