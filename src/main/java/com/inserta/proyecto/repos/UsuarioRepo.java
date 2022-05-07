package com.inserta.proyecto.repos;

import com.inserta.proyecto.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "usuarios")
public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {


}
