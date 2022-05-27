package Examen;

public class Semestre {

    private String ciclo;

    private Cursos[] cursos;

    private  int contador;

    public Semestre(String ciclo) {

        this.ciclo = ciclo;

        this.contador = 0;

        this.cursos = new Cursos[3];
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCursos(Cursos cursos) {
        this.cursos[this.contador++] = cursos;
    }

    public Cursos[] getCursos() {
        return cursos;
    }
}
