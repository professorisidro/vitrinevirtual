package br.com.professorisidro.vitrinevirtual.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.professorisidro.vitrinevirtual.model.Usuario;
import br.com.professorisidro.vitrinevirtual.services.IUsuarioService;

@RestController
@CrossOrigin("*")
public class UsuarioController {
	
    @Autowired
    private IUsuarioService srv;
    
	@PostMapping("/usuario/login")
	public ResponseEntity<Usuario> logarUsuario(@RequestBody Usuario usuario){
		Usuario u = srv.autenticarUsuario(usuario.getEmail(), usuario.getSenha());
		if (u != null) {
			return ResponseEntity.ok(u);
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/usuario/todos")
	public ResponseEntity<List<Usuario>> recuperarTudao(){
		return ResponseEntity.ok(srv.buscarTodos());
	}
}
