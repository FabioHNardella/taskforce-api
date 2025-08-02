package com.fabio.taskforce_api.scheduler;

import com.fabio.taskforce_api.model.Tarefa;
import com.fabio.taskforce_api.service.TarefaService;
import com.fabio.taskforce_api.service.VencimentoDeTarefasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class VencimentoDeTarefaScheduler {
    @Autowired
    private VencimentoDeTarefasService vencimentoDeTarefasService;

    @Scheduled(cron = "0 0 0 * * *")
    public void verificarTarefasVencidas(){

    }



}
