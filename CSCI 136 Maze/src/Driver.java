//Maze Array made by Nick (Maze files also created by Nick)
//Player and Items added to pane by Shelby (Images also created/edited by Shelby)
import java.io.FileNotFoundException;
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Driver extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	GridPane myPane;
	ImageView playerImage;
	int[][] myArray;

	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {
		
		Blocks myBlock = new Blocks();
		Player myPlayer = new Player();
		Items myItem = new Items();
		
		
		Image myImage = new Image(myPlayer.getPlayerImg());
		playerImage = new ImageView(myImage);
		
		//Generates a maze by choosing a random number relating to 
		//one of two files that will be read in to form the maze
		MazeCreation myMaze = new MazeCreation();
		Random rand = new Random();
		int randNum = rand.nextInt(((2 - 1) + 1) + 1);
		myPlayer.getRand(randNum);
		if (randNum == 1) {
			myArray = myMaze.array1();
		} else {
			myArray = myMaze.array2();
		}
		
		//Placing the tree images based on the files
		myPane = new GridPane();
		/////////////////////////////////////////
		if (myArray[0][0] == 1) {
			myPane.add(myBlock.treeImage1, 0, 0);
		}
		if (myArray[0][1] == 1) {
			myPane.add(myBlock.treeImage2, 1, 0);
		}
		if (myArray[0][2] == 1) {
			myPane.add(myBlock.treeImage3, 2, 0);
		}
		if (myArray[0][3] == 1) {
			myPane.add(myBlock.treeImage4, 3, 0);
		}
		if (myArray[0][4] == 1) {
			myPane.add(myBlock.treeImage5, 4, 0);
		}
		if (myArray[0][5] == 1) {
			myPane.add(myBlock.treeImage6, 5, 0);
		}
		if (myArray[0][6] == 1) {
			myPane.add(myBlock.treeImage7, 6, 0);
		}
		if (myArray[0][7] == 1) {
			myPane.add(myBlock.treeImage8, 7, 0);
		}
		if (myArray[0][8] == 1) {
			myPane.add(myBlock.treeImage9, 8, 0);
		}
		if (myArray[0][9] == 1) {
			myPane.add(myBlock.treeImage10, 9, 0);
		}
		if (myArray[1][0] == 1) {
			myPane.add(myBlock.treeImage11, 0, 1);
		}
		if (myArray[1][1] == 1) {
			myPane.add(myBlock.treeImage12, 1, 1);
		}
		if (myArray[1][2] == 1) {
			myPane.add(myBlock.treeImage13, 2, 1);
		}
		if (myArray[1][3] == 1) {
			myPane.add(myBlock.treeImage14, 3, 1);
		}
		if (myArray[1][4] == 1) {
			myPane.add(myBlock.treeImage15, 4, 1);
		}
		if (myArray[1][5] == 1) {
			myPane.add(myBlock.treeImage16, 5, 1);
		}
		if (myArray[1][6] == 1) {
			myPane.add(myBlock.treeImage17, 6, 1);
		}
		if (myArray[1][7] == 1) {
			myPane.add(myBlock.treeImage18, 7, 1);
		}
		if (myArray[1][8] == 1) {
			myPane.add(myBlock.treeImage19, 8, 1);
		}
		if (myArray[1][9] == 1) {
			myPane.add(myBlock.treeImage20, 9, 1);
		}
		if (myArray[2][0] == 1) {
			myPane.add(myBlock.treeImage21, 0, 2);
		}
		if (myArray[2][1] == 1) {
			myPane.add(myBlock.treeImage22, 1, 2);
		}
		if (myArray[2][2] == 1) {
			myPane.add(myBlock.treeImage23, 2, 2);
		}
		if (myArray[2][3] == 1) {
			myPane.add(myBlock.treeImage24, 3, 2);
		}
		if (myArray[2][4] == 1) {
			myPane.add(myBlock.treeImage25, 4, 2);
		}
		if (myArray[2][5] == 1) {
			myPane.add(myBlock.treeImage26, 5, 2);
		}
		if (myArray[2][6] == 1) {
			myPane.add(myBlock.treeImage27, 6, 2);
		}
		if (myArray[2][7] == 1) {
			myPane.add(myBlock.treeImage28, 7, 2);
		}
		if (myArray[2][8] == 1) {
			myPane.add(myBlock.treeImage29, 8, 2);
		}
		if (myArray[2][9] == 1) {
			myPane.add(myBlock.treeImage30, 9, 2);
		}
		if (myArray[3][0] == 1) {
			myPane.add(myBlock.treeImage31, 0, 3);
		}
		if (myArray[3][1] == 1) {
			myPane.add(myBlock.treeImage32, 1, 3);
		}
		if (myArray[3][2] == 1) {
			myPane.add(myBlock.treeImage33, 2, 3);
		}
		if (myArray[3][3] == 1) {
			myPane.add(myBlock.treeImage34, 3, 3);
		}
		if (myArray[3][4] == 1) {
			myPane.add(myBlock.treeImage35, 4, 3);
		}
		if (myArray[3][5] == 1) {
			myPane.add(myBlock.treeImage36, 5, 3);
		}
		if (myArray[3][6] == 1) {
			myPane.add(myBlock.treeImage37, 6, 3);
		}
		if (myArray[3][7] == 1) {
			myPane.add(myBlock.treeImage38, 7, 3);
		}
		if (myArray[3][8] == 1) {
			myPane.add(myBlock.treeImage39, 8, 3);
		}
		if (myArray[3][9] == 1) {
			myPane.add(myBlock.treeImage40, 9, 3);
		}
		if (myArray[4][0] == 1) {
			myPane.add(myBlock.treeImage41, 0, 4);
		}
		if (myArray[4][1] == 1) {
			myPane.add(myBlock.treeImage42, 1, 4);
		}
		if (myArray[4][2] == 1) {
			myPane.add(myBlock.treeImage43, 2, 4);
		}
		if (myArray[4][3] == 1) {
			myPane.add(myBlock.treeImage44, 3, 4);
		}
		if (myArray[4][4] == 1) {
			myPane.add(myBlock.treeImage45, 4, 4);
		}
		if (myArray[4][5] == 1) {
			myPane.add(myBlock.treeImage46, 5, 4);
		}
		if (myArray[4][6] == 1) {
			myPane.add(myBlock.treeImage47, 6, 4);
		}
		if (myArray[4][7] == 1) {
			myPane.add(myBlock.treeImage48, 7, 4);
		}
		if (myArray[4][8] == 1) {
			myPane.add(myBlock.treeImage49, 8, 4);
		}
		if (myArray[4][9] == 1) {
			myPane.add(myBlock.treeImage50, 9, 4);
		}
		////////////////////////////////////////////
		
		if(randNum == 1) {
			myPane.add(myItem.fireImg4, 9, 2);
		}
		else {
			myPane.add(myItem.fireImg4, 9, 3);
		}
		
		int randCol1 = rand.nextInt(9);
		int randRow1 = rand.nextInt(5);
		int randCol2 = rand.nextInt(9);
		int randRow2 = rand.nextInt(5);
		int randCol3 = rand.nextInt(9);
		int randRow3 = rand.nextInt(5);
		
		myPane.add(myItem.fireImg1, randCol1, randRow1);
		myPane.add(myItem.fireImg2, randCol2, randRow2);
		myPane.add(myItem.fireImg3, randCol3, randRow3);
		
		myPane.add(playerImage, 0, 1);
		
		
		//The group of objects that will be added to the window
		Group root = new Group(myPane);
		Scene gameScreen = new Scene(root, Color.BISQUE);
		
		//Player Movement Code
		int x = 0;
		int y = 0;
		playerImage.setX(x);
		playerImage.setY(y);
		myPlayer.setMovement(x, y, playerImage, primaryStage, gameScreen);//Set Variables for the player's movement in "Player.java"
		myPlayer.playerMovement(gameScreen);//Implements movement from "Player.java"
		
		primaryStage.setTitle("Infernape Maze");//Title of window in the window's bar
		primaryStage.setScene(gameScreen);//Implements the "scene" (objects/background)
		primaryStage.show();//Shows the window (would probably not appear w/o it)

	}
}
