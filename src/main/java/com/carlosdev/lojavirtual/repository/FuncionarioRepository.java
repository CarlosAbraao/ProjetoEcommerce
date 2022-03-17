package com.carlosdev.lojavirtual.repository;

import com.carlosdev.lojavirtual.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
