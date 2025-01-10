
package prymvcsuma;

import controller.SumaControl;
import model.SumaModel;
import view.SumaView;


public class PryMvcSuma {

    public static void main(String[] args) {
        SumaModel sumaModel = new SumaModel();
        SumaView sumaView = new SumaView();
        SumaControl sumaControl= new SumaControl(sumaModel, sumaView);
        
        sumaControl.iniciar();
    }
}
