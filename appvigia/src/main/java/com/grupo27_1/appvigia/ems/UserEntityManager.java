package com.grupo27_1.appvigia.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;

import com.grupo27_1.appvigia.entities.Usuario;
import com.grupo27_1.appvigia.repositories.UsuarioRepository;

@AutoConfiguration
public class UserEntityManager {

    @Autowired
    private static UsuarioRepository usrRepo;

    public static Usuario createUser(Usuario usr) {

        try {
            Usuario result = usrRepo.save(usr);
            if (result.getId() > 0) {
                return result;
            }
            return null;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
