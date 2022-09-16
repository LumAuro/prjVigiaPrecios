package com.grupo27_1.appvigia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.grupo27_1.appvigia.entities.Usuario;
import com.grupo27_1.appvigia.repositories.UsuarioRepository;

//Con las siguientes instrucciones estamos indicando que es un test tipo dato JPA
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class UsuarioCrudTest {

    @Autowired
    private UsuarioRepository usrRepo;

    @Test
    public void createUser() {
        Usuario usr = new Usuario("nombre", "usuario", "clave", "correo", "prefijo", "celular");
        Usuario result;
        try {
            result = usrRepo.save(usr);
            assertNotNull(result.getId());
            assertTrue(result.getId() > 0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
