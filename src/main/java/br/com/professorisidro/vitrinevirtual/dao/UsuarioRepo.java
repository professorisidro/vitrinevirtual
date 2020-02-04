package br.com.professorisidro.vitrinevirtual.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.professorisidro.vitrinevirtual.model.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario, Integer>{
    public Usuario findByEmailAndSenha(String email, String senha);
}
