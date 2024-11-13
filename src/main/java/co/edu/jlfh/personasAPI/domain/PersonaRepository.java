package co.edu.jlfh.personasAPI.domain;

import java.util.List;

import org.springframework.data.repository.Repository;

/**
 *
 *
 *
 * @author Juan Luis Mendivelso, Felipe Fonseca, Holmant Alarcon
 *
 */

public interface PersonaRepository extends Repository<Persona, Integer> {

    List<Persona> findAll();

    Persona findById(int id);

    Persona save(Persona p);

    void delete(Persona p);

}
