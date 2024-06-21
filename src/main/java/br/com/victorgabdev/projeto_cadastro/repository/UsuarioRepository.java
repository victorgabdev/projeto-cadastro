package br.com.victorgabdev.projeto_cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.victorgabdev.projeto_cadastro.model.Usuario;

@Repository
public interface UsuarioRepository extends  JpaRepository<Usuario, Long>{

}
