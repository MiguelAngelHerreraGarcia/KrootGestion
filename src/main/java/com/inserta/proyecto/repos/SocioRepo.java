package com.inserta.proyecto.repos;

import com.inserta.proyecto.models.Socio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "socios")
public interface SocioRepo extends JpaRepository<Socio, Integer> {

}
