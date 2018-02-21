package com.curso.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.patrimonio.model.Item;


public interface ItemRepository extends JpaRepository<Item, Long> {

}
