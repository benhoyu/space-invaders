/*	Bullet Abstract class 
 *
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

public abstract class Bullet{
	//fields
	Pane body = new Pane();
	int bulletSpd = 0;
	
	//Default constructor
	public Bullet(){}
	
	//getters or setters 
	public Pane getBody(){return body;}
	public int getBulletSpd(){return bulletSpd;}
	
	public abstract void doSomething();
	
}
 	