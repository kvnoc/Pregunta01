package Examen;

public class Matricula {

    private int codigo;

    private Estudiante[] estudiante;

    private int contador;

    public Matricula(int codigo) {
        this.codigo = codigo;

        this.contador = 0;

        this.estudiante = new Estudiante[1];
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante[this.contador++] = estudiante;
    }

    public Estudiante[] getEstudiante() {
        return estudiante;
    }
}
