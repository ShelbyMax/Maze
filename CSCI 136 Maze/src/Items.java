import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Items {
	
	private Image fire = new Image(getFireImg());
	
	public ImageView fireImg1 = new ImageView(fire);
	public ImageView fireImg2 = new ImageView(fire);
	public ImageView fireImg3 = new ImageView(fire);
	public ImageView fireImg4 = new ImageView(fire);
	
	public String getFireImg() {
		return "file:src/FirePower.png";
	}

}
