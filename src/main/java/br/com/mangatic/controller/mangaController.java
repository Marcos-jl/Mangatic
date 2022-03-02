package br.com.mangatic.controller;

import br.com.mangatic.model.Mangas;
import br.com.mangatic.repository.CRUD;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mangas")
public class mangaController {
	
	@Autowired
	private CRUD repository;

	@GetMapping
	public List<Mangas> seachAll(){
		return repository.findAll();
	}

	@PostMapping
	public void add(@RequestBody Mangas manga) {
		repository.save(manga);
	}

	@PutMapping
	public void reflesh(@RequestBody Mangas manga) {
		repository.save(manga);
	}

	@DeleteMapping("/{cod}")
	public void del(@PathVariable Long cod) {
		repository.deleteById(cod);
	}

	@GetMapping("/{cod}")
	public Optional<Mangas> filter(@PathVariable Long cod){
		return repository.findById(cod);
	}

}
