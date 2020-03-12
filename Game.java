import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;
import java.util.ArrayList;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.scene.shape.Rectangle;

/*	
 * //
 * author: Theodore Tran
 * version: 2
 * date: 2/23/20
 */

public class Game extends Application {

    public static VBox title = new VBox();
    public static StackPane root = new StackPane();
    
    //Player[] players = new Players[2];
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
        //TITLE PAGE
        title.setPrefSize(1000,600);
        StackPane textPane = new StackPane();
        Text text = new Text();
		text.setFont(Font.font("IMPACT", 60));
		text.setText("SPACE INVADERS");
        text.setTextAlignment(TextAlignment.CENTER);
        textPane.getChildren().add(text);
        title.getChildren().add(textPane);
        //START BUTTON
        StackPane stBtn= new StackPane();
        stBtn.setPrefSize(200,100);
        Rectangle Start = new Rectangle(200,100);
        Start.setFill(Color.GREEN);
        Text stText = new Text();
        stText.setText("START");
        stText.setFont(Font.font("Century Gothic", 30));
        

        stBtn.getChildren().addAll(Start,stText);
        title.getChildren().add(stBtn);
        title.setAlignment(Pos.CENTER);
       
        
    //-------------------------------------------------------------------------
        
        title.setStyle("-fx-background-color:powderblue");
        HBox playFieldHolder= new HBox();
        Pane playField1 = new Pane();
        Pane playField2= new Pane();
        playFieldHolder.getChildren().addAll(playField1,playField2);

    

    //ROOT AND SCENE ADDING
       
        root.getChildren().add(title);
        root.getChildren().add(playFieldHolder);
        
		primaryStage.setScene(new Scene(root, 1000, 600));
		primaryStage.show();
    }
    //METHODS
	public static void startAnimation() {
		
	}

	public static void doSomething() {
		
	}

	
}
