package co.edu.jlfh.personasAPI.domain;

import java.util.List;

/**
 *
 *
 *
 * @author Juan Luis Mendivelso, Felipe Fonseca, Holmant Alarcon
 *
 */

public interface PersonaService {

    List<Persona> listar();

    Persona listarId(int id);

    Persona add(Persona p);

    Persona edit(Persona p);

    Persona delete(int id);
}
