package br.usjt.cloudtech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.cloudtech.model.Usuario;
import br.usjt.cloudtech.repository.UsuarioRepository;

@Service
public class LoginService {

	@Autowired
	UsuarioRepository usuarioRepo;
	
	public boolean logar(Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
}