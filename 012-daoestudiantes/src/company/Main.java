package company;

import company.dao.EstudianteDAOH2;
import company.entidades.Estudiante;
import company.servicios.EstudianteService;

public class Main {

    public static void main(String[] args) {
        //objeto de negocio
        Estudiante estudiante = new Estudiante();

        estudiante.setId(1L);
        estudiante.setNombre("Javier");
        estudiante.setApellido("Ramirez");


        //instanciamos service
        EstudianteService estudianteService = new EstudianteService();

        //seteamos una estrategia de persistencia es decir un DAO
        estudianteService.setEstudianteIDao(new EstudianteDAOH2());

        estudianteService.guardarEstudiante(estudiante);
    }

}
