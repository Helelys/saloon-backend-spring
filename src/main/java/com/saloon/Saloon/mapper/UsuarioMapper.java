package com.saloon.Saloon.mapper;

import com.saloon.Saloon.model.dto.UsuarioRegistroDTO;
import com.saloon.Saloon.model.entity.Usuario;
import org.mapstruct.Mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface UsuarioMapper {

    Usuario toEntity(UsuarioRegistroDTO usuarioRegistroDTO);
}
