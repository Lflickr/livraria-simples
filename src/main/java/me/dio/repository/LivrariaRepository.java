package me.dio.repository;

import me.dio.model.Livraria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrariaRepository extends JpaRepository<Livraria, Long> {
}
