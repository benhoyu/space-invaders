/*	Hero Bullet extends Bullet 
 * 	Author: Alex Tan
 *  Version: 1.0
 *  Date: 03/12/2020
 */
 
import javafx.application.Application;
import javafx.util.Duration;
import java.util.ArrayList;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.Font;
import javafx.scene.control.Button;

import javafx.stage.Stage;

import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class HeroBullet extends Bullet{
	//fields
	
	//Constructor
	public HeroBullet{
		//Set up the shape of the bullet
		Circle circle = Circle();
		circle.setRadius(3);
		
	}



}