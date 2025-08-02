package com.fabio.taskforce_api.service;

import com.fabio.taskforce_api.enums.Status;
import com.fabio.taskforce_api.model.Tarefa;
import com.fabio.taskforce_api.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> listarTodasTarefas() {
        return tarefaRepository.findAll();
    }

    public Tarefa criar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public ResponseEntity<Tarefa> buscarPorId(long id) {
        Optional<Tarefa> tarefaOptional = tarefaRepository.findById(id);
        if(tarefaOptional.isEmpty()){
            return ResponseEntity.notFound().build();
        }


        return tarefaRepository.findById(id);
    }

    public ResponseEntity<Tarefa> atualizarTarefa(Long id, Tarefa tarefaAtualizada) {
        Optional<Tarefa> tarefaExistenteOptional = tarefaRepository.findById(id);
        if (tarefaExistenteOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Tarefa tarefaExistente = tarefaExistenteOptional.get();
        tarefaExistente.setTitulo(tarefaAtualizada.getTitulo());
        tarefaExistente.setDescricao(tarefaAtualizada.getDescricao());
        tarefaExistente.setPrioridade(tarefaAtualizada.getPrioridade());
        tarefaExistente.setStatus(tarefaAtualizada.getStatus());
        tarefaExistente.setDataPrazo(tarefaAtualizada.getDataPrazo());
        tarefaRepository.save(tarefaExistente);

        if(tarefaExistente.getStatus() == Status.CONCLUIDA){
            // enviar email para o usuário
        }

        return ResponseEntity.ok(tarefaExistenteOptional.get());
    }

    public Tarefa salvar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public ResponseEntity<Tarefa> deletar(Long id) {
        Optional<Tarefa> tarefaProcurada = tarefaRepository.findById(id);
        if (tarefaProcurada.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Tarefa tarefaParaDeletar = tarefaProcurada.get();
        tarefaRepository.delete(tarefaParaDeletar);
        return ResponseEntity.ok(tarefaProcurada.get());

    }
}
