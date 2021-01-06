package com.veterinaria.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.veterinaria.dao.AnimalDAO;
import com.veterinaria.model.Animal;

@CrossOrigin(origins="http://localhost:3000")
//@CrossOrigin(origins="https://c39390a17455.ngrok.io")
@RestController
@RequestMapping("animales")
public class AnimalRest {
	
	@Autowired
	private AnimalDAO animalDAO;
	
	@PostMapping("/create")
	public void create(@RequestBody Animal animal) {
		animalDAO.save(animal);
	}
	@GetMapping("/read")
	public List<Animal> read(){
		return animalDAO.findAll();
	}
	
	@GetMapping("/readId/{id}")
	public Optional<Animal> readId(@PathVariable("id") Integer id){
		return animalDAO.findById(id);
	}
	@PutMapping("/update")
	public void update(@RequestBody Animal animal) {
		animalDAO.save(animal);
		
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		animalDAO.deleteById(id);
	}
}
