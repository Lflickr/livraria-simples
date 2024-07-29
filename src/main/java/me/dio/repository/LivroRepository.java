package me.dio.repository;

import me.dio.model.Autor;
import me.dio.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    List<Livro> findByAutor(Autor autor);
}
