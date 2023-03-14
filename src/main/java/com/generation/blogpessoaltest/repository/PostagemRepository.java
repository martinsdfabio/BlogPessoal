package com.generation.blogpessoaltest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoaltest.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem,Long> {
	

}
