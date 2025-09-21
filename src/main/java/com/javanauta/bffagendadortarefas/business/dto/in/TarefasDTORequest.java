package com.javanauta.bffagendadortarefas.business.dto.in;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.javanauta.bffagendadortarefas.infrastructure.client.enums.StatusNotificacaoEnum;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TarefasDTORequest {

    private String  descricao;
    private String nomeTarefa;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime dataEvento;
}
