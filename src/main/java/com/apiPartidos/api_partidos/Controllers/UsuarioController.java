package com.apiPartidos.api_partidos.Controllers;

import com.apiPartidos.api_partidos.Models.peticiones.UsuarioCrearRequestModel;
import com.apiPartidos.api_partidos.Models.respuestas.UsuarioDataRestModel;
import com.apiPartidos.api_partidos.Services.IUsuarioService;
import com.apiPartidos.api_partidos.Shared.UsuarioDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private IUsuarioService iUsuarioService;

    /*se usa para obtener información */
    @GetMapping
    public UsuarioDataRestModel leerUsuario (){
        String username = "ElkinG";

        UsuarioDto usuarioDto = iUsuarioService.leerUsuario(username);

        UsuarioDataRestModel usuarioDataRestModel = modelMapper.map(usuarioDto, UsuarioDataRestModel.class);

        return usuarioDataRestModel;
    }
    /*se usa para crear un nuevo usuario */
    @PostMapping
    public UsuarioDataRestModel crearUsuario (@RequestBody UsuarioCrearRequestModel usuarioCrearRequestModel){

        UsuarioDto usuarioCrearDto = modelMapper.map(usuarioCrearRequestModel, UsuarioDto.class);

        UsuarioDto usuarioDto = iUsuarioService.crearUsuario(usuarioCrearDto);

        UsuarioDataRestModel usuarioDataRestModel = modelMapper.map(usuarioDto, UsuarioDataRestModel.class);

        return usuarioDataRestModel;
    }

}
