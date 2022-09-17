package com.bolsadeideas.springboot.app.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.bolsadeideas.springboot.app.models.entity.Usuario;
import com.bolsadeideas.springboot.app.models.service.IUsuarioService;

@Controller
@SessionAttributes("usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de usuarios");
        model.addAttribute("usuarios", usuarioService.findAll());
        return "listar";
    }

    @RequestMapping(value = "/form")
    public String crear(Map<String, Object> model) {

        Usuario usuario = new Usuario();
        model.put("usuario", usuario);
        model.put("titulo", "Formulario de Cliente");
        return "form";
    }

    @RequestMapping(value = "/form/{id}")
    public String editar(@PathVariable(value = "id") Long id, Map<String, Object> model) {

        Usuario usuario = null;

        if (id > 0) {
            usuario = usuarioService.findOne(id);
        } else {
            return "redirect:/listar";
        }
        model.put("usuario", usuario);
        model.put("titulo", "Editar Cliente");
        return "form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String guardar(Usuario usuario, BindingResult result, Model model, SessionStatus status) {
        if (result.hasErrors()) {
            model.addAttribute("titulo", "Formulario de Cliente");
            return "form";
        }

        usuarioService.save(usuario);
        status.setComplete();
        return "redirect:listar";
    }

    @RequestMapping(value = "/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id) {

        if (id > 0) {
            usuarioService.delete(id);
        }
        return "redirect:/listar";
    }
}