package com.example.demotrabalho.repository;

import com.example.demotrabalho.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {}
