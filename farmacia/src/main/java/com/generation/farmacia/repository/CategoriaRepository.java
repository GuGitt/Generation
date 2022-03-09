package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farmacia.model.Categoria;
													                  //Metod carry
public interface CategoriaRepository extends JpaRepository <Categoria, Long> {

	public List <Categoria> findAllByCategoriaContainingIgnoreCase (String categoria);
	//select * from tb_categoria  where nome like "%nome";
	//, "nome"Atributo da classe
	
		
	
}
