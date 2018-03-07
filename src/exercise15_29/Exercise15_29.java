// Excellent use of comments. If you use the /** comment header, your comments will 
// become part of the javadoc for the application. We will look more at this after break

/*
 *  Program:    Exercise 15.29
 *  Date:       2/19/18
 *  Developer:  Garrett Wolfe
 *  Purpose:    Display a car that moves and have the ability to speed it up or slow it down.
 */
package exercise15_29;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;

public class Exercise15_29 extends Application{
    @Override
    public void start(Stage primaryStage) {
        CarPane pane = new CarPane();
        pane.setOnMousePressed(e -> pane.pause());
        pane.setOnMouseReleased(e -> pane.play());
        pane.setOnKeyPressed(e -> {
        if (e.getCode() == KeyCode.UP) {
            pane.increaseSpeed();
        }
        else if (e.getCode() == KeyCode.DOWN) {
            pane.decreaseSpeed();
        }
        });
        Scene scene = new Scene(pane, 600, 100);
        primaryStage.setTitle("Car");
        primaryStage.setScene(scene); 
        primaryStage.show(); 
        pane.requestFocus();
    }
    public static void main(String[] args) {
	launch(args);
    }
}
