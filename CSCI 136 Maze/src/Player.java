
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Player {
	private int x;
	private int y;
	int columnX = 0;
	int rowY = 1;
	private ImageView playerImage;
	private Stage primaryStage;
	private Scene gameScreen;
	private int randNum;
	Blocks myBlock = new Blocks();
	Driver myDrive = new Driver();
	Winning myWinnings = new Winning();

	//Sets variables for player movement
	public void setMovement(int x, int y, ImageView playerImage, Stage primaryStage, Scene gameScreen) {
		this.playerImage = playerImage;
		this.x = x;
		this.y = y;
		this.primaryStage = primaryStage;
		this.gameScreen = gameScreen;
	}

	//Gets randNum from driver
	public int getRand(int randNum) {
		this.randNum = randNum;
		return randNum;
	}

	//Player game avatar image
	public String getPlayerImg() {
		return "file:src/Infernape.png";
	}

	//Listener for player movement
	public void playerMovement(Scene gameScreen) {
		gameScreen.setOnKeyPressed(this::listenUp);
	}

	//Action for player movement
	public void listenUp(KeyEvent event) {
		KeyCode myCode = event.getCode();

		if(randNum == 1) {
			
			if(columnX == 9 && rowY == 2) {
				primaryStage.setScene(myWinnings.win());
			}
			else {}
			
			if (myCode == KeyCode.LEFT) {
				if(columnX == 3 && rowY == 2 || columnX == 3 && rowY == 3 || columnX == 5 && rowY == 1 || columnX == 5 && rowY == 2 || columnX == 7 && rowY == 1 || columnX == 7 && rowY == 3 || columnX == 9 && rowY == 2) {
				}
				else {
					GridPane.setColumnIndex(playerImage, columnX-=1);
					}
				//x -= 5;
			} 

			else if (myCode == KeyCode.RIGHT) {
				if(columnX == 9 || columnX == 3 && rowY == 1 || columnX == 1 && rowY == 2 || columnX == 3 && rowY == 2 || columnX == 5 && rowY == 1 || columnX == 5 && rowY == 3 || columnX == 7 && rowY == 1 || columnX == 7 && rowY == 2) {
				}
				else {
					GridPane.setColumnIndex(playerImage, columnX+=1);
				}
				//x += 5;
			} 

			else if (myCode == KeyCode.DOWN) {
				if(rowY == 3 || columnX == 0 && rowY == 2|| columnX == 1 && rowY == 2 || columnX == 2 && rowY == 1 || columnX == 6 && rowY == 2) {
				}
				else {
					GridPane.setRowIndex(playerImage, rowY+=1);
				}
				//y += 5;
			} 

			else if (myCode == KeyCode.UP) {
				if(rowY == 1 || columnX == 4 && rowY == 3 || columnX == 6 && rowY == 2 || columnX == 8 && rowY == 3 || columnX == 9 && rowY == 2) {
				}
				else {
					GridPane.setRowIndex(playerImage, rowY-=1);
				}
				//y -= 5;
			}

		}

		else {
			
			if(columnX == 9 && rowY == 3) {
				primaryStage.setScene(myWinnings.win());
			}
			else {}
			
			if (myCode == KeyCode.LEFT) {
				if(columnX == 1 && rowY == 3 || columnX == 1 && rowY == 4 || columnX == 3 && rowY == 1 || columnX == 3 && rowY == 2 || columnX == 3 && rowY == 3 || columnX == 6 && rowY == 2 || columnX == 6 && rowY == 3 || columnX == 6 && rowY == 4 || columnX == 8 && rowY == 3) {
				}
				else {
					GridPane.setColumnIndex(playerImage, columnX-=1);
					}
				//x -= 5;
			} 

			else if (myCode == KeyCode.RIGHT) {
				if(columnX == 1 && rowY == 1 || columnX == 1 && rowY == 2 || columnX == 1 && rowY == 3 || columnX == 3 && rowY == 2 || columnX == 3 && rowY == 3 || columnX == 3 && rowY == 4 || columnX == 7 && rowY == 1 || columnX == 6 && rowY == 2 || columnX == 6 && rowY == 3 || columnX == 8 && rowY == 4 || columnX == 9 && rowY == 3) {
				}
				else {
					GridPane.setColumnIndex(playerImage, columnX+=1);
				}
				//x += 5;
			} 

			else if (myCode == KeyCode.DOWN) {
				if(rowY == 4 || columnX == 0 && rowY == 2 || columnX == 4 && rowY == 1 || columnX == 5 && rowY == 1 || columnX == 7 && rowY == 1 || columnX == 9 && rowY == 3) {
				}
				else {
					GridPane.setRowIndex(playerImage, rowY+=1);
				}
				//y += 5;
			} 

			else if (myCode == KeyCode.UP) {
				if(rowY == 1 || columnX == 2 && rowY == 4 || columnX == 7 && rowY == 4 || columnX == 8 && rowY == 3 || columnX == 9 && rowY == 3) {
				}
				else {
					GridPane.setRowIndex(playerImage, rowY-=1);
				}
				//y -= 5;
			}
		}

		//playerImage.setX(x);
		//playerImage.setY(y);
	}
}
