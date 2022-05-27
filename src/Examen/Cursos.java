package Examen;

import java.util.concurrent.ThreadPoolExecutor;

public class Cursos {

    private String nombre;

    private Profesores[] profesores;

    private int contador;

    public Cursos(String nombre) {
        this.nombre = nombre;

        this.contador = 0;

        this.profesores = new Profesores[1];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setProfesores(Profesores profesores) {
        this.profesores[this.contador++] = profesores;
    }

    public Profesores[] getProfesores() {
        return profesores;
    }
}
