package me.dio.controller;

import me.dio.Service.LivrariaService;
import me.dio.model.Livraria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/livraria")
public class LivrariaController {
    @Autowired
    private final LivrariaService livrariaService;

    public LivrariaController(LivrariaService livrariaService){
        this.livrariaService = livrariaService;
    }

    @PostMapping
    public ResponseEntity<Livraria> create(@RequestBody Livraria livraria){
        var liv = livrariaService.create(livraria);
        URI local = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("{id}")
                .buildAndExpand(liv.getId())
                .toUri();
        return ResponseEntity.created(local).body(liv);
    }
}
