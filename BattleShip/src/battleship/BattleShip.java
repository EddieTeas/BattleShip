/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Edward
 */
public class BattleShip extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane bPane = new BorderPane();
        StackPane root = new StackPane();
        Grid g = new Grid();
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        root.getChildren().add(btn);
        
      
        
        
        bPane.setBottom(root);
        Scene scene = new Scene(bPane, 700, 700);
        
        primaryStage.setTitle("Battleship");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
