package com.veterinaria.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinaria.model.Animal;

public interface AnimalDAO extends JpaRepository <Animal,Integer> {

}
