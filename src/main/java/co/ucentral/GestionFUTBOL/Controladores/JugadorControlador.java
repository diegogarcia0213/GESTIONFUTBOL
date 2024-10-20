package co.ucentral.GestionFUTBOL.Controladores;


import co.ucentral.GestionFUTBOL.Persistencia.Entidades.Jugador;
import co.ucentral.GestionFUTBOL.Servicios.JugadorServicios;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@AllArgsConstructor
@Controller


public class JugadorControlador {

    JugadorServicios JugadorServicios;

    public List<Jugador> Obtenerdatos(){
        return JugadorServicios.obtenerjugadores();

    }
}
