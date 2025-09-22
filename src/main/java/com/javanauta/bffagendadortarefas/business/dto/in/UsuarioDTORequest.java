package com.javanauta.bffagendadortarefas.business.dto.in;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTORequest {

    private String email;
    private String senha;
    private String nome;
    private List<EnderecoDTORequest> enderecos;
    private List<TelefoneDTORequest> telefones;
}
