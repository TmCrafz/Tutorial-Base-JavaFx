package org.tmcrafz.tutorialfxbase;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class BaseGame extends Application {
	
	private final int m_width = 800;
	private final int m_height = 600;
	
	public static void main(String[] args) 
    {
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Base Game");
		Group root = new Group();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		
		Canvas canvas = new Canvas(m_width, m_height);
		root.getChildren().add( canvas );
		
		GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
		
		Game game = new Game(scene, graphicsContext, m_width, m_height);
		game.startGame();
		
		primaryStage.show();	
			
	}
}
