package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;
//import java.awt.Button;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        //Titulo de la ventana principal
        primaryStage.setTitle("Botón abre dialogo texto, Ejercicio 21");

        // Botón con el texto indicado
        Button abrirVentana = new Button("Introducir nombre");

        //Al pulsar el botón llama al método
        abrirVentana.setOnAction(e -> {abrirVentanaSecundaria();});

        VBox vBox = new VBox(abrirVentana);
        Scene scene = new Scene(vBox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void abrirVentanaSecundaria(){
        Stage ventanaSecundaria = new Stage();
        ventanaSecundaria.setTitle("Ventana Secundaria");

        Label etiquetaNombre = new Label("Nombre:");
        TextField nombre = new TextField();
        Button confirmar = new Button("Confirmar");

        confirmar.setOnAction(e -> {System.out.println(nombre.getText());});

        GridPane tabla = new GridPane();
        tabla.add(etiquetaNombre, 0, 0);
        tabla.add(nombre, 1, 0);
        tabla.setHgap(10);
        tabla.setVgap(10);

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(confirmar);
        borderPane.setTop(tabla);

        Scene scene = new Scene(borderPane, 300, 200);
        ventanaSecundaria.setScene(scene);
        ventanaSecundaria.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}