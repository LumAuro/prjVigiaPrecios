package com.grupo27_1.appvigia;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.grupo27_1.appvigia.repositories.PrecioRepository;
import com.grupo27_1.appvigia.repositories.ProductoRepository;
import com.grupo27_1.appvigia.repositories.TiendaRepository;
import com.grupo27_1.appvigia.repositories.UsuarioRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
class AppvigiaApplicationTests {

    @Autowired
    private UsuarioRepository usuarioRepo;
    @Autowired
    private ProductoRepository productoRepo;
    @Autowired
    private TiendaRepository tiendaRepo;
    @Autowired
    private PrecioRepository precioRepo;

    // Borramos parte del contenido original y agregamos las siguientes lineas.
    @Test
    public void contextLoads() {
        Long numUsuarios = usuarioRepo.count();
        assertNotNull(numUsuarios);
        Long numProductos = productoRepo.count();
        assertNotNull(numProductos);
        Long numTiendas = tiendaRepo.count();
        assertNotNull(numTiendas);
        Long numPrecios = precioRepo.count();
        assertNotNull(numPrecios);
    }

}
