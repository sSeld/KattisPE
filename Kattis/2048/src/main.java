import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;
import java.util.Scanner;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] numGrid = new int[4][4];
		int gameState = 0;
		int input;
		
		for(int row = 0; row < 4; row++)
		{
			for(int col = 0; col < 4; col++)
			{

				numGrid[row][col] = scan.nextInt();
			}
		}
		printGrid(numGrid);

		while(gameState != 2)
		{
			input = scan.nextInt();
			updateGrid(input);
		}
	}

	public static void updateGrid(int direction)
	{
		if(direction == 0)
		{
			System.out.print("Left");
		}
		else if(direction == 1)
		{
			System.out.print("Up");
		}
		else if(direction == 2)
		{
			System.out.print("Right");
		}
		else if(direction == 3)
		{
			System.out.print("Down");
		}
	}

	public static void printGrid(int[][] numGrid)
	{
		for(int r = 0; r < 4; r++)
		{
			for(int c = 0; c < 4; c++)
			{
				System.out.print(numGrid[r][c] + " ");
			}
			System.out.print("\n");
		}
	}

}



