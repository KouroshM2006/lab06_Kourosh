/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06_kourosh;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
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
        house.setStroke(Color.BLACK);
        house.setFill(Color.LIGHTGRAY);
        
        Polygon roof = new Polygon(SCENE_WIDTH/4, SCENE_HEIGHT - (SCENE_HEIGHT * 0.45), SCENE_WIDTH * 0.75, SCENE_HEIGHT - (SCENE_HEIGHT * 0.45), SCENE_WIDTH/2, SCENE_HEIGHT * 0.33);
        roof.setStroke(Color.RED);
        roof.setFill(Color.RED);
        
        Rectangle door = new Rectangle(SCENE_WIDTH * 0.5, SCENE_HEIGHT * 0.7, SCENE_WIDTH * 0.1, SCENE_HEIGHT * 0.15);
        door.setStroke(Color.BROWN);
        door.setFill(Color.BROWN);
        
        Rectangle leftWindow = new Rectangle(house.getX() + 15, house.getY() + 35, SCENE_WIDTH * 0.1, SCENE_WIDTH * 0.1);
        leftWindow.setStroke(Color.LIGHTBLUE);
        leftWindow.setFill(Color.LIGHTBLUE);
        
        Line leftWindowVline = new Line(leftWindow.getX() + (leftWindow.getWidth()/2), leftWindow.getY(), leftWindow.getX() + (leftWindow.getWidth()/2), leftWindow.getY() + leftWindow.getHeight());
        Line leftWindowHline = new Line(leftWindow.getX(), leftWindow.getY() + (leftWindow.getHeight()/2), leftWindow.getX() + leftWindow.getWidth(), leftWindow.getY() +  (leftWindow.getHeight()/2));
        
        Rectangle rightWindow = new Rectangle(house.getX() + house.getWidth() - (leftWindow.getWidth() + 15), leftWindow.getY(), leftWindow.getWidth(), leftWindow.getHeight());
        rightWindow.setStroke(Color.LIGHTBLUE);
        rightWindow.setFill(Color.LIGHTBLUE);
        
        Line rightWindowVline = new Line(rightWindow.getX() + rightWindow.getWidth()/2, rightWindow.getY(), rightWindow.getX() + rightWindow.getWidth()/2, rightWindow.getY() + rightWindow.getHeight());
        Line rightWindowHline = new Line(rightWindow.getX(), rightWindow.getY() + rightWindow.getHeight()/2, rightWindow.getX() + rightWindow.getWidth(), rightWindow.getY() + rightWindow.getHeight()/2);
        
        Rectangle chimney = new Rectangle(door.getX() - 20, SCENE_HEIGHT * 0.37, SCENE_WIDTH * 0.04, SCENE_HEIGHT * 0.14 );
        chimney.setStroke(Color.DARKGRAY);
        chimney.setFill(Color.DARKGRAY);
        
        Circle sun = new Circle(SCENE_WIDTH - SCENE_WIDTH * 0.08 - 5, SCENE_WIDTH * 0.08 + 5, SCENE_WIDTH * 0.08);
        sun.setStroke(Color.YELLOW);
        sun.setFill(Color.YELLOW);
        
        Line sunLine1 = new Line(sun.getCenterX(), sun.getCenterY(), sun.getCenterX() - sun.getRadius() - 5, sun.getCenterY() - sun.getRadius());
        sunLine1.setFill(Color.YELLOW);
        sunLine1.setStroke(Color.YELLOW);
        
        Line sunLine2 = new Line(sun.getCenterX(), sun.getCenterY(), sunLine1.getEndX(), sunLine1.getEndY() + sun.getRadius() * 2);
        sunLine2.setFill(Color.YELLOW);
        sunLine2.setStroke(Color.YELLOW);
        
        Line sunLine3 = new Line(sun.getCenterX(), sun.getCenterY() + sun.getRadius(), SCENE_WIDTH, sun.getCenterY() + sun.getRadius());
        sunLine3.setFill(Color.YELLOW);
        sunLine3.setStroke(Color.YELLOW);
        
        Pane root = new Pane();
        root.getChildren().addAll(grass, porch, house, roof, door, leftWindow, rightWindow, leftWindowVline, leftWindowHline, rightWindowVline, rightWindowHline, chimney, sun, sunLine1, sunLine2, sunLine3);
        
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        stage.setScene(scene);
        stage.setTitle("HouseWithWindowPanesLab");
        stage.show();
    }
    
}
