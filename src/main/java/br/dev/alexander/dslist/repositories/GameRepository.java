package br.dev.alexander.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.alexander.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
