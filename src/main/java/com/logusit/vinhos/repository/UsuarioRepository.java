package com.logusit.vinhos.repository;

import org.springframework.data.repository.CrudRepository;

import com.logusit.vinhos.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

	Usuario findByLogin(String login);
}
