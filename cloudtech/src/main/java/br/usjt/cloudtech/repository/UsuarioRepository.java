package br.usjt.cloudtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.cloudtech.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findOneByLoginAndSenha(String login, String senha);

}