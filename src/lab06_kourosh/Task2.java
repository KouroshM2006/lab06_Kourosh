/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06_kourosh;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author 2440557
 */
public class Task2 extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        int SCENE_WIDTH = 500, SCENE_HEIGHT = 600;
        Rectangle grass = new Rectangle(0, SCENE_HEIGHT - (SCENE_HEIGHT * 0.15), SCENE_WIDTH, SCENE_HEIGHT * 0.15);
        grass.setStroke(Color.GREEN);
        grass.setFill(Color.GREEN);
        
        Rectangle porch = new Rectangle(SCENE_WIDTH/4, SCENE_HEIGHT - (SCENE_HEIGHT * 0.15), SCENE_WIDTH/2, SCENE_HEIGHT * 0.02);
        porch.setStroke(Color.BEIGE);
        porch.setFill(Color.BEIGE);
        
        Rectangle house = new Rectangle(SCENE_WIDTH/4, SCENE_HEIGHT - (SCENE_HEIGHT * 0.45), SCENE_WIDTH/2, SCENE_HEIGHT * 0.3);
        house.setStroke(Color.LIGHTGRAY);
        house.setFill(Color.LIGHTGRAY);
        
        Polygon roof = new Polygon(SCENE_WIDTH/4, SCENE_HEIGHT - (SCENE_HEIGHT * 0.45), SCENE_WIDTH * 0.75, SCENE_HEIGHT - (SCENE_HEIGHT * 0.45), SCENE_WIDTH/2, SCENE_HEIGHT * 0.3);
        roof.setStroke(Color.RED);
        roof.setFill(Color.RED);
        
        Rectangle door = new Rectangle(SCENE_WIDTH * 0.6, SCENE_HEIGHT * 0.65, SCENE_WIDTH * 0.1, SCENE_HEIGHT * 0.1);
        door.setStroke(Color.BROWN);
        door.setFill(Color.BROWN);
        
        Pane root = new Pane();
        root.getChildren().addAll(grass, porch, house, roof, door);
        
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        stage.setScene(scene);
        stage.setTitle("HouseWithWindowPanesLab");
        stage.show();
    }
    
}
