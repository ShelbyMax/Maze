import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Player {
	private int x;
	private int y;
	private ImageView playerImage;
	private Stage primaryStage;
	private Scene gameScreen;
	
	public void setMovement(int x, int y, ImageView playerImage, Stage primaryStage, Scene gameScreen) {
		this.playerImage = playerImage;
		this.x = x;
		this.y = y;
		this.primaryStage = primaryStage;
		this.gameScreen = gameScreen;
	}

	public String getPlayerImg() {
		return "file:src/Infernape.png";
	}

	public void playerMovement(Scene gameScreen) {
		gameScreen.setOnKeyPressed(this::listenUp);

	}

	public void listenUp(KeyEvent event) {
		KeyCode myCode = event.getCode();

		if (myCode == KeyCode.LEFT) {
			x -= 5;
		} else if (myCode == KeyCode.RIGHT) {
			x += 5;
		} else if (myCode == KeyCode.DOWN) {
			y += 5;
		} else if (myCode == KeyCode.UP) {
			y -= 5;
		}
		playerImage.setX(x);
		playerImage.setY(y);
	}

}
