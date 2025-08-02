package com.fabio.taskforce_api.model;

import com.fabio.taskforce_api.enums.Prioridade;
import com.fabio.taskforce_api.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Column(nullable = false)
    private String titulo;

    private String descricao;

    @NotNull
    @Column(nullable = false)
    private Prioridade prioridade;

    @NotNull
    @Column(nullable = false)
    private LocalDate dataPrazo;

    @NotNull
    @Column(nullable = false)
    private Status status;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDate getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(LocalDate dataPrazo) {
        this.dataPrazo = dataPrazo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean podeSerMarcadaComoVencida(LocalDate agora){
        return !this.status.equals(Status.CONCLUIDA) && !this.status.equals(Status.VENCIDA) && this.dataPrazo.isBefore(agora);
    }
}
