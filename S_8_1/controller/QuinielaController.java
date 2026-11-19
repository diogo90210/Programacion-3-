package S_8_1.controller;
import java.util.ArrayList;

import S_8_1.model.*;
import S_8_1.view.*;

public class QuinielaController {

    private QuinielaModel model;
    private QuinielaView view;
    

    public QuinielaController (QuinielaModel model, QuinielaView view){
        this.model = model;
        this.view = view;
    }

    public  void init (){
        if (!model.cargarPartidos()) {
            view.mostrarMensaje("Aviso: No se pudo cargar el archivo equipos.txt");
        }
        view.displayMenu();
    }

    public ArrayList<Partido> getPartidos() {
        return model.getPartidos();
    }


    
}
