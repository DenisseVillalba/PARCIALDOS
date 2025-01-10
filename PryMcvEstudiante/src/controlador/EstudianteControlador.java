
package controlador;

import modelo.EstudianteModelo;
import vista.EstudianteVista;

public class EstudianteControlador {
    public EstudianteModelo em;
    public EstudianteVista ev;

    public EstudianteControlador(EstudianteModelo em, EstudianteVista ev) {
        this.em = em;
        this.ev = ev;
    }
    
    public void asignarNombre(String nombre){
        em.setNombre(nombre);
        
    }
    public void asignarCalificacion(int calificacion){
        em.setCalificacion(calificacion);  
    }
    
    public void iniciar(){
        ev.mostrarDetalle(em.getNombre(), em.getCalificacion());
        
    }
}
