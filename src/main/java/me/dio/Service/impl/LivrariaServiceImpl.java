package me.dio.Service.impl;

import me.dio.Service.LivrariaService;
import me.dio.model.Livraria;
import me.dio.repository.LivrariaRepository;


public class LivrariaServiceImpl implements LivrariaService {

    private final LivrariaRepository livrariaRepository;

    public LivrariaServiceImpl(LivrariaRepository livrariaRepository){
        this.livrariaRepository = livrariaRepository;
    }

    @Override
    public Livraria create(Livraria livraria) {
        if(livrariaRepository.existsById(livraria.getId()) && livraria.getId() != null){
            throw new IllegalArgumentException("Livraria ja existente");
        }
        return livrariaRepository.save(livraria);
    }

}
