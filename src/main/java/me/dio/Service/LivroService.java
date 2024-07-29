package me.dio.Service;

import me.dio.model.Autor;
import me.dio.model.Livro;

import java.util.List;

public interface LivroService {
    List<Livro> livrosDoAutor(Autor autor);
    Livro findById(Long livro);

}
