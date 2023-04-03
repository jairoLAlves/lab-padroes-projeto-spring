package com.padroesprojetospring.labpadroesprojetospring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.padroesprojetospring.labpadroesprojetospring.model.Endereco;

@FeignClient(name="viacep", url="https://viacep.com.br/ws")
public interface ViaCepService {


    @RequestMapping
    Endereco consultarCep(@PathVariable("cep") String cep);
    
}
