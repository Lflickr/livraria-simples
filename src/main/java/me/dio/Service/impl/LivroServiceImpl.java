package me.dio.Service.impl;

import me.dio.Service.LivroService;
import me.dio.model.Autor;
import me.dio.model.Livro;
import me.dio.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.NoSuchElementException;

public class LivroServiceImpl implements LivroService {
    @Autowired
    private LivroRepository livroRepository;

    @Override
    public List<Livro> livrosDoAutor(Autor autor) {
        return  livroRepository.findByAutor(autor);
    }

    @Override
    public Livro findById(Long livro) {
        return livroRepository.findById(livro).orElseThrow(NoSuchElementException::new);
    }
}
