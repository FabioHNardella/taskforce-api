package com.fabio.taskforce_api.controller;

import com.fabio.taskforce_api.model.Tarefa;
import com.fabio.taskforce_api.repository.TarefaRepository;
import com.fabio.taskforce_api.service.TarefaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> listarTodasTarefas() {
        return tarefaService.listarTodasTarefas();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizar(@PathVariable Long id, @RequestBody @Valid Tarefa tarefaAtualizada) {
        return tarefaService.atualizarTarefa(id, tarefaAtualizada);
    }

    @PostMapping
    public Tarefa criarTarefa(@RequestBody @Valid Tarefa novaTarefa) {
        return tarefaService.criar(novaTarefa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Tarefa> deletarTarefa(@PathVariable Long id) {
        return tarefaService.deletar(id);
    }

}
