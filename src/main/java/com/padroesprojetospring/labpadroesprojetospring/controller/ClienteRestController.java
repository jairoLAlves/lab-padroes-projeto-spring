package com.padroesprojetospring.labpadroesprojetospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.padroesprojetospring.labpadroesprojetospring.model.Cliente;
import com.padroesprojetospring.labpadroesprojetospring.service.ClienteService;


@RestController
@RequestMapping("clientes")
public class ClienteRestController{
    @Autowired
    private ClienteService cienteService;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos(){
        return ResponseEntity.ok(cienteService.buscarTodos());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(cienteService.buscarPorId(id));
    }
    @GetMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente ){
        cienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(
        @PathVariable Long id,
        @RequestBody Cliente cliente
    ){
        cienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> deletar(@PathVariable Long id){
        cienteService.deletar(id);
        return ResponseEntity.ok().build();
    }

} 