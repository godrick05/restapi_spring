package com.henriquecunha.crudjava.usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "usuarios", path ="usuarios")
public interface UsuarioRepository extends JpaRepository<Usuarios,Long>{
	
}
