package com.padroesprojetospring.labpadroesprojetospring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.padroesprojetospring.labpadroesprojetospring.model.Endereco;

@Repository
public  interface  EnderecoRepository extends CrudRepository<Endereco, String> {
    
}
