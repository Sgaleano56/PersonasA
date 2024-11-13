package co.edu.jlfh.personasAPI.domain;

import jakarta.persistence.*;

/**
 *
 *
 *
 * @author Juan Luis Mendivelso, Felipe Fonseca, Holmant Alarcon
 *
 */
@Entity
@Table(name = "personas")
public class Persona {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_p;

    @Column
    private String nombre_p;

    @Column
    private String apellidos_p;

    @Column
    private int id_to_p;

    public int getId() {
        return id_p;
    }

    public void setId(int id) {
        this.id_p = id;
    }

    public String getNombres() {
        return nombre_p;
    }

    public void setNombres(String nombres) {
        this.nombre_p = nombres;
    }

    public String getApellidos() {
        return apellidos_p;
    }

    public void setApellidos(String apellidos) {
        this.apellidos_p = apellidos;
    }

    public int getId_tp() {
        return id_to_p;
    }

    public void setId_tp(int id_tp) {
        this.id_to_p = id_tp;
    }

}
