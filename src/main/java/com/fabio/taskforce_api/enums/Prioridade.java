package com.fabio.taskforce_api.enums;


import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum Prioridade {
    @Enumerated(EnumType.STRING)
    BAIXA, MEDIA, ALTA
}
