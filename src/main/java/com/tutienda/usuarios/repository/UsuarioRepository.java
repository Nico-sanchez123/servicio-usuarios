// src/main/java/com/tutienda/usuarios/repository/UsuarioRepository.java
package com.tutienda.usuarios.repository;

import com.tutienda.usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Método para buscar un usuario por su correo (lo usaremos para el login)
    Optional<Usuario> findByCorreo(String correo);
}