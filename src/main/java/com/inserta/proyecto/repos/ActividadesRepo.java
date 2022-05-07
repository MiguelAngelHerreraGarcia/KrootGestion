package com.inserta.proyecto.repos;

import com.inserta.proyecto.models.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "actividades")
public interface ActividadesRepo extends JpaRepository<Actividad,Integer> {
}
