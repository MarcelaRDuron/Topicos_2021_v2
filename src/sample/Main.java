package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sample.views.Loteria;


public class Main extends Application{
    private BorderPane bdpPrincipal;
    private MenuBar mnbOpciones;
    private Menu menCompetencia1, menCompetencia2, menSalir;
    private MenuItem mitLoteria, mitSalir;
    private Scene escena;

    @Override
    public void start(Stage primaryStage) throws Exception {
        CrearUI();
        escena = new Scene(bdpPrincipal);
        primaryStage.setScene(escena);
        primaryStage.setMaximized(true);
        primaryStage.setTitle("Formulario Principal");
        primaryStage.show();
    }

    private void CrearUI() {
        bdpPrincipal = new BorderPane();
        mnbOpciones = new MenuBar();
        menCompetencia1 = new Menu("1era. Competencia");
        menCompetencia2 = new Menu("2da. Competencia");
        menSalir = new Menu("Salir");


        //agregar menus al menubar
        mnbOpciones.getMenus().addAll(menCompetencia1,menCompetencia2,menSalir);
        bdpPrincipal.setTop(mnbOpciones);

        //instarciar lo Menuitems
        mitLoteria = new MenuItem("Loteria");
        //mitLoteria.setOnAction(event -> new Loteria());
        mitLoteria.setOnAction(event -> MenuOpciones(1));
        menCompetencia1.getItems().addAll(mitLoteria);

        mitSalir = new MenuItem("Hasta Luego");
        menSalir.getItems().addAll(mitSalir);
    }

    private void MenuOpciones(int opc) {
        switch (opc){
            case 1: new Loteria(); break;
            case 20: System.exit(0);
        }
    }


    public static void main(String[] args) {
        launch(args);
    }


}
