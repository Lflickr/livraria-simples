package me.dio.controller;

import me.dio.Service.LivroService;
import me.dio.model.Autor;
import me.dio.model.Livro;
import me.dio.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroService livroService;

    @Autowired
    private AutorRepository autorRepository;

    @GetMapping("/autor")
    public List<Livro> getLivrosDoAutor(@RequestParam String nomeAutor){
        Autor autor = autorRepository.findByNome(nomeAutor);
        if(autor != null){
            return livroService.livrosDoAutor(autor);
        }
        return List.of();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> findById(@PathVariable Long id){
        var livro = livroService.findById(id);
        return  ResponseEntity.ok(livro);
    }
}
