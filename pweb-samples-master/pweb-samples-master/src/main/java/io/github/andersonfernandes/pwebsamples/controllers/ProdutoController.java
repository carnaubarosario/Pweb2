package io.github.andersonfernandes.pwebsamples.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.andersonfernandes.pwebsamples.models.Produto;
import io.github.andersonfernandes.pwebsamples.repositories.ProdutoRepository;

@RestController
@RequestMapping(value="/api")
public class ProdutoController {

	@Autowired
	ProdutoRepository pr;
	
	@GetMapping("/produtos")
	public List<Produto> listaProdutos() {
		
		return pr.findAll();
	}
	@GetMapping("/produto/{id}")	
	public Optional<Produto> listaUmProduto(@PathVariable(value="id") long id) {
		
		return pr.findById(id);
	}
	
	@PostMapping
	public Produto novoProduto(@RequestBody Produto produto) {
		return pr.save(produto);
	}
}

