
package controller;

import model.SumaModel;
import view.SumaView;

public class SumaControl {
    public SumaModel modeloSuma;  //creo atributo a clase SumaModel
    public SumaView vistaSuma;
    
    //constructor
    public SumaControl(SumaModel modeloSuma, SumaView vistaSuma){
        this.modeloSuma = modeloSuma;
        this.vistaSuma = vistaSuma;
    }
    public void iniciar(){
        int numeroUno, numeroDos, resultado;
        numeroUno = vistaSuma.pedirNumero("Ingrese N 1: ");
        numeroDos = vistaSuma.pedirNumero("Ingrese N 2: ");
        resultado = modeloSuma.sumar(numeroUno, numeroDos);
        vistaSuma.mostrarResultado(resultado);
    }
    
    
    
}
