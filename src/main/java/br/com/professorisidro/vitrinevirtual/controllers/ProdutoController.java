package br.com.professorisidro.vitrinevirtual.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.professorisidro.vitrinevirtual.model.Produto;
import br.com.professorisidro.vitrinevirtual.services.IProdutoService;

@RestController
@CrossOrigin("*")
public class ProdutoController {

	@Autowired
	private IProdutoService servico; // declaramos sempre a interface

	@PostMapping("/produto/novo")
	public ResponseEntity<Produto> inserirProduto(@RequestBody Produto produto) {
		servico.novoProduto(produto);
		return ResponseEntity.ok(produto);
	}

	@GetMapping("/produto")
	public ResponseEntity<List<Produto>> mostrarTodos() {
		return ResponseEntity.ok(servico.recuperarTodos());
	}

	@GetMapping("/produto/{id}")
	public ResponseEntity<Produto> mostrarPeloId(@PathVariable int id) {
		Produto p = servico.recuperarPorId(id);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/produto/busca")
	public ResponseEntity<List<Produto>> buscaPorKeyword(@RequestParam String key){
		return ResponseEntity.ok(servico.buscarPorPalavraChave(key));
	}

}
