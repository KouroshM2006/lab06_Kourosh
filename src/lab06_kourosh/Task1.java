/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab06_kourosh;

//github link: https://github.com/KouroshM2006/lab06_Kourosh.git
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;

/**
 *
 * @author 2440557
 */
public class Task1 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Constants for the scene size
        final double SCENE_WIDTH = 520.0;
        final double SCENE_HEIGHT = 520.0;

        // Constants for each square's XY coordinates
        final int X1 = 10, Y1 = 10; // Square #1
        final int X2 = 60, Y2 = 60; // Square #1
        final int X3 = 110, Y3 = 110; // Square #3

        // Constants for each square's width and height
        final int WIDTH1 = 500, HEIGHT1 = 500; // Square #1
        final int WIDTH2 = 400, HEIGHT2 = 400; // Square #2
        final int WIDTH3 = 300, HEIGHT3 = 300; // Square #3

        // Constants for the circle's geometry
        final int CENTER_X = 260, CENTER_Y = 260, RADIUS = 150;
        // Create square #1 here. Set its stroke color to black
        Rectangle square1 = new Rectangle(X1, Y1, WIDTH1, HEIGHT1);
        square1.setStroke(Color.BLACK);
        // and set its fill color to null.
        square1.setFill(null);
        // Create square #2 here. Set its stroke color to black
        Rectangle square2 = new Rectangle(X2, Y2, WIDTH2, HEIGHT2);
        square2.setStroke(Color.BLACK);
        // and set its fill color to null.
        square2.setFill(null);
        // Create square #3 here. Set its stroke color to black
        Rectangle square3 = new Rectangle(X3, Y3, WIDTH3, HEIGHT3);
        square3.setStroke(Color.BLACK);
        // and set its fill color to null.
        square3.setFill(null);
        // Create the diagonal lines here.
        Line line1 = new Line(X1, Y1, X3, Y3);
        Line line2 = new Line(X1 + WIDTH1, Y1, X3 + WIDTH3, Y3);
        Line line3 = new Line(X1 + WIDTH1, Y1 + HEIGHT1, X3 + WIDTH3, Y3 + HEIGHT3);
        Line line4 = new Line(X1, Y1 + HEIGHT1, X3, Y3 + HEIGHT3);
        // Create the circle here.
        Circle circle = new Circle(CENTER_X, CENTER_Y, RADIUS);
        circle.setFill(Color.BLACK);
        // Add the nodes to a Pane here.
        Pane root = new Pane();
        root.getChildren().addAll(line1, line2, line3, line4, square1, square2, square3, circle);
        // Create a Scene with the Pane as the root node,
        Scene scene = new Scene(root);
        // and display it here.  
        stage.setScene(scene);
        stage.show();
    }

}
