package com.fabio.taskforce_api.enums;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum Status {
    @Enumerated(EnumType.STRING)
    PENDENTE, EM_ANDAMENTO, CONCLUIDA, VENCIDA
}
