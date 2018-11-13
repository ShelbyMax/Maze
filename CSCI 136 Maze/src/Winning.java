//Winning.java by Shelby
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Winning {
	public Scene win(){

		Text myText = new Text("You won!");
		myText.setScaleX(3); myText.setScaleY(3);
		myText.setX(120); myText.setY(180);
		myText.setFill(Color.DARKRED);
		
		Group root = new Group(myText);
		Scene win = new Scene(root, 350, 350, Color.BISQUE);
		return win; //Returns code for the driver to set the scene
	}

}
