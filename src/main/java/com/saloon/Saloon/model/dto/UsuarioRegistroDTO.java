package com.saloon.Saloon.model.dto;

import com.saloon.Saloon.model.enums.TipoUsuario;
import lombok.Data;

@Data
public class UsuarioRegistroDTO {

    private String email;
    private String nome;
    private String senha;
    private TipoUsuario tipoUsuario;
}
