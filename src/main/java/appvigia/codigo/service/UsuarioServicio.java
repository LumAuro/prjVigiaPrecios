package appvigia.codigo.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import appvigia.codigo.Controller.dto.UsuarioRegistroDTO;
import appvigia.codigo.Model.entities.Usuario;

public interface UsuarioServicio extends UserDetailsService {

    public Usuario guardar(UsuarioRegistroDTO registroDTO);

    public List<Usuario> listarUsuarios();

}
