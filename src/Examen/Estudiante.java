package Examen;

public class Estudiante {

    private String nombres;

    private int codigo;

    private Semestre[] semestre;

    private int contador;

    public Estudiante(String nombres, int codigo) {
        this.nombres = nombres;

        this.codigo = codigo;

        this.contador = 0;

        this.semestre = new Semestre[1];

    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNombres() {
        return nombres;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre[this.contador++] = semestre;
    }

    public Semestre[] getSemestre() {
        return semestre;
    }
}
