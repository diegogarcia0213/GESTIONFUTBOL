package co.ucentral.GestionFUTBOL.Servicios;


import co.ucentral.GestionFUTBOL.Persistencia.Entidades.Jugador;
import co.ucentral.GestionFUTBOL.Persistencia.Repositorios.JugadorRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class JugadorServicios {

    JugadorRepositorio JugadorRepositorio;

    public List<Jugador> obtenerjugadores() {
        List<Jugador> listado = (List<Jugador>) JugadorRepositorio.findAll();
        return listado;
    }

    public boolean borrar(Jugador Jugador) {

        try{
        JugadorRepositorio.delete(Jugador);
        } catch (Exception e) {
            return false;
        }

        return true;
    }


}