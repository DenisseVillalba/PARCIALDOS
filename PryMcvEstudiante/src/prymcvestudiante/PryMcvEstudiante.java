
package prymcvestudiante;

import controlador.EstudianteControlador;
import modelo.EstudianteModelo;
import vista.EstudianteVista;

public class PryMcvEstudiante {

    public static void main(String[] args) {
        EstudianteModelo em = new EstudianteModelo();
        EstudianteVista ev = new EstudianteVista();
        EstudianteControlador ec = new EstudianteControlador(em, ev);
        
        ec.asignarNombre("DENISSE");
        ec.asignarCalificacion(50);
        
        ec.iniciar();
    }
    
}
