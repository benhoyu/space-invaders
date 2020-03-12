/* Space Invaders Tester
*
*	date: 3/11/2020
*	version: 2.0
*	author: Benson Yu
*/

public class Tester extends Application {
	public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage) { 
    	primaryStage.setTitle("Space Invaders");
    	
    	Game game = new Game();
    	
    	primaryStage.setScene(game.getBody());
    	primaryStage.show();
    }

}