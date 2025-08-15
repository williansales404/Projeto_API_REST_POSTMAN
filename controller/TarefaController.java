package com.example.demotrabalho.controller;

import com.example.demotrabalho.model.Tarefa;
import com.example.demotrabalho.repository.TarefaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaRepository tarefaRepository;

    public TarefaController(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    @PostMapping
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    @GetMapping
    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    @PutMapping("/{id}")
    public Tarefa atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa nova) {
        return tarefaRepository.findById(id).map(tarefa -> {
            tarefa.setTitulo(nova.getTitulo());
            tarefa.setResponsavel(nova.getResponsavel());
            tarefa.setDataEntrega(nova.getDataEntrega());
            return tarefaRepository.save(tarefa);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletarTarefa(@PathVariable Long id) {
        tarefaRepository.deleteById(id);
    }
}
