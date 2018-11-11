import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MazeCreation {
	private int[][] array1 = new int[5][10];
	private int[][] array2 = new int[5][10];

	public int[][] array1() throws FileNotFoundException {
		File myFile = new File("./src/Maze1.txt");
		Scanner myFileScanner = new Scanner(myFile);
		for (int row = 0; row < array1.length; row++) {
			String line = myFileScanner.nextLine();
			Scanner myLineScanner = new Scanner(line);
			for (int column = 0; column < array1[row].length; column++) {
				array1[row][column] = myLineScanner.nextInt();
			}
			myLineScanner.close();
		}
		myFileScanner.close();
		return array1;
	}

	public int[][] array2() throws FileNotFoundException {
		File myFile = new File("./src/Maze2.txt");
		Scanner myFileScanner = new Scanner(myFile);
		for (int row = 0; row < array2.length; row++) {
			String line = myFileScanner.nextLine();
			Scanner myLineScanner = new Scanner(line);
			for (int column = 0; column < array2[row].length; column++) {
				array2[row][column] = myLineScanner.nextInt();
			}
			myLineScanner.close();
		}
		myFileScanner.close();
		return array2;
	}
}
