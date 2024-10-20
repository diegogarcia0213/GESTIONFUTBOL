package co.ucentral.GestionFUTBOL.Persistencia.Repositorios;

import co.ucentral.GestionFUTBOL.Persistencia.Entidades.Jugador;
import org.springframework.data.repository.CrudRepository;

public interface JugadorRepositorio extends CrudRepository<Jugador, Long > {
}
