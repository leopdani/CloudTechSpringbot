package br.usjt.cloudtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.cloudtech.model.Previsao;

public interface PrevisoesRepository extends JpaRepository<Previsao, Long> {

}