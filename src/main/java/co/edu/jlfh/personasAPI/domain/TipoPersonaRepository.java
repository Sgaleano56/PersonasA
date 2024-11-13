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

public interface TipoPersonaRepository extends Repository<TipoPersona, Integer>{ List<TipoPersona> findAll();
}

