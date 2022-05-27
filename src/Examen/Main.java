package Examen;

import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args){

        Profesores marcos = new Profesores("Marcos Valverde");
        Profesores martha = new Profesores("Martha Zevallos");
        Profesores jose = new Profesores("Jose Orlandini");
        Profesores lucia = new Profesores("Lucia Pajuelo");
        Profesores ronald = new Profesores("ronald Valverde");
        Profesores jaime = new Profesores("Jaime Fernandez");


        Cursos redes = new Cursos("Redes y Telecomuniaciones I");
        Cursos servidores = new Cursos("Servidores I");
        Cursos programacion = new Cursos("Programacion Orientada a Objetos");
        Cursos estructura = new Cursos("Estructura de Datos");
        Cursos sistemas = new Cursos("Sistemas Operativos");
        Cursos calculo = new Cursos("Calculo II");

        redes.setProfesores(marcos);

        servidores.setProfesores(martha);

        programacion.setProfesores(jose);

        Semestre semestre = new Semestre("2022-I");

        semestre.setCursos(redes);

        semestre.setCursos(servidores);

        semestre.setCursos(programacion);

        Estudiante estudiante = new Estudiante("Jhon Hilario Dolores", 2022220385);

        estudiante.setSemestre(semestre);

        Matricula matricula = new Matricula(2080);

        System.out.println("Codigo de Matricula: "+matricula.getCodigo());

        matricula.setEstudiante(estudiante);

        for (Estudiante e: matricula.getEstudiante()){

            System.out.println("Estudiante: "+e.getNombres());

            System.out.println("Codigo Estudiante: "+e.getCodigo());

            for (Semestre s: estudiante.getSemestre()){

                System.out.println("Semestre Academico: "+s.getCiclo());

                for (Cursos c: semestre.getCursos()){

                    System.out.println("Curso: "+c.getNombre());

                    for (Profesores p: c.getProfesores()){

                        System.out.println("Profesor: "+p.getNombre());
                    }
                }
            }
        }
    }
}
