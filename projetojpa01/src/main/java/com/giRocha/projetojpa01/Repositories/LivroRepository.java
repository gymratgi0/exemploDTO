package com.giRocha.projetojpa01.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giRocha.projetojpa01.Entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>  {

}
