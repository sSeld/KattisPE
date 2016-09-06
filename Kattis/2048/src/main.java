
import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] numGrid = new int[4][4];
		int gameState = 0;
		int input;

		// Input game grid
		for(int row = 0; row < 4; row++)
		{
			for(int col = 0; col < 4; col++)
			{

				numGrid[row][col] = scan.nextInt();
			}
		}

		while(gameState != 2)
		{
			input = scan.nextInt();
			updateGrid(input, numGrid);
		}
	}

	public static void updateGrid(int direction, int[][] numGrid)
	{
		int counter = 0;
		if(direction == 0)
		{ //////////// LEFT ////////////

			// Check for zeros and move accordingly
			for(int row = 0; row <= 3; row++)
			{
				for(int col = 0; col < 3; col++)
				{
					if(counter >= 3)
					{
						counter = 0;
						break;
					}
					if(numGrid[row][col] == 0 && col == 0)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row][col+1];
						numGrid[row][col+1] = numGrid[row][col+2];
						numGrid[row][col+2] = numGrid[row][col+3];
						numGrid[row][col+3] = 0;
						counter++;
						col=0;
					}
					else if(numGrid[row][col] == 0 && col == 1)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row][col+1];
						numGrid[row][col+1] = numGrid[row][col+2];
						numGrid[row][col+2] = 0;
						counter++;
						col=0;
					}
					else if(numGrid[row][col] == 0 && col == 2)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row][col+1];
						numGrid[row][col+1] = 0;
						counter++;
						col=0;
					}
				}
			}
			// Check for doubles and add if found
			for(int row = 0; row <= 3; row++)
			{
				for(int col = 0; col < 3; col++)
				{
					if(numGrid[row][col] == numGrid[row][col+1])
					{
						numGrid[row][col] = numGrid[row][col] + numGrid[row][col+1];
						numGrid[row][col+1] = 0;
					}
				}
			}

			// Check for zeros and move accordingly
			for(int row = 0; row <= 3; row++)
			{
				for(int col = 0; col < 3; col++)
				{
					if(counter >= 3)
					{
						counter = 0;
						break;
					}
					if(numGrid[row][col] == 0 && col == 0)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row][col+1];
						numGrid[row][col+1] = numGrid[row][col+2];
						numGrid[row][col+2] = numGrid[row][col+3];
						numGrid[row][col+3] = 0;
						counter++;
						col=0;
					}
					else if(numGrid[row][col] == 0 && col == 1)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row][col+1];
						numGrid[row][col+1] = numGrid[row][col+2];
						numGrid[row][col+2] = 0;
						counter++;
						col=0;
					}
					else if(numGrid[row][col] == 0 && col == 2)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row][col+1];
						numGrid[row][col+1] = 0;
						counter++;
						col=0;
					}
				}
			}
		}
		else if(direction == 1)
		{ //////////// UP ////////////
			// Check for zeros and move accordingly
			for(int col = 0; col <= 3; col++)
			{
				for(int row = 0; row < 3; row++)
				{
					if(counter >= 3)
					{
						counter = 0;
						break;
					}
					if(numGrid[row][col] == 0 && row == 0)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row+1][col];
						numGrid[row+1][col] = numGrid[row+2][col];
						numGrid[row+2][col] = numGrid[row+3][col];
						numGrid[row+3][col] = 0;
						counter++;
						row=0;
					}
					else if(numGrid[row][col] == 0 && row == 1)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row+1][col];
						numGrid[row+1][col] = numGrid[row+2][col];
						numGrid[row+2][col] = 0;
						counter++;
						row=0;
					}
					else if(numGrid[row][col] == 0 && row == 2)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row+1][col];
						numGrid[row+1][col] = 0;
						counter++;
						row=0;
					}
				}
			}
			// Check for doubles and add if found
			for(int col = 0; col <= 3; col++)
			{
				for(int row = 0; row < 3; row++)
				{
					if(numGrid[row][col] == numGrid[row+1][col])
					{
						numGrid[row][col] = numGrid[row][col] + numGrid[row+1][col];
						numGrid[row+1][col] = 0;
					}
				}
			}
			// Check for zeros and move accordingly
			for(int col = 0; col <= 3; col++)
			{
				for(int row = 0; row < 3; row++)
				{
					if(counter >= 3)
					{
						counter = 0;
						break;
					}
					if(numGrid[row][col] == 0 && row == 0)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row+1][col];
						numGrid[row+1][col] = numGrid[row+2][col];
						numGrid[row+2][col] = numGrid[row+3][col];
						numGrid[row+3][col] = 0;
						counter++;
						row=0;
					}
					else if(numGrid[row][col] == 0 && row == 1)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row+1][col];
						numGrid[row+1][col] = numGrid[row+2][col];
						numGrid[row+2][col] = 0;
						counter++;
						row=0;
					}
					else if(numGrid[row][col] == 0 && row == 2)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row+1][col];
						numGrid[row+1][col] = 0;
						counter++;
						row=0;
					}
				}
			}

		}
		else if(direction == 2)
		{ //////////// RIGHT ////////////
			// Check for zeros and move accordingly
			for(int row = 0; row <= 3; row++)
			{
				for(int col = 3; col > 0; col--)
				{
					if(counter >= 3)
					{
						counter = 0;
						break;
					}
					if(numGrid[row][col] == 0 && col == 3)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row][col-1];
						numGrid[row][col-1] = numGrid[row][col-2];
						numGrid[row][col-2] = numGrid[row][col-3];
						numGrid[row][col-3] = 0;
						counter++;
						col=3;
					}
					else if(numGrid[row][col] == 0 && col == 2)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row][col-1];
						numGrid[row][col-1] = numGrid[row][col-2];
						numGrid[row][col-2] = 0;
						counter++;
						col=3;
					}
					else if(numGrid[row][col] == 0 && col == 1)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row][col-1];
						numGrid[row][col-1] = 0;
						counter++;
						col=3;
					}
				}
			}
			// Check for doubles and add if found
			for(int row = 0; row <= 3; row++)
			{
				for(int col = 3; col > 0; col--)
				{
					if(numGrid[row][col] == numGrid[row][col-1])
					{
						numGrid[row][col] = numGrid[row][col] + numGrid[row][col-1];
						numGrid[row][col-1] = 0;
					}
				}
			}

			// Check for zeros and move accordingly
			for(int row = 0; row <= 3; row++)
			{
				for(int col = 3; col > 0; col--)
				{
					if(counter >= 3)
					{
						counter = 0;
						break;
					}
					if(numGrid[row][col] == 0 && col == 3)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row][col-1];
						numGrid[row][col-1] = numGrid[row][col-2];
						numGrid[row][col-2] = numGrid[row][col-3];
						numGrid[row][col-3] = 0;
						counter++;
						col=3;
					}
					else if(numGrid[row][col] == 0 && col == 2)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row][col-1];
						numGrid[row][col-1] = numGrid[row][col-2];
						numGrid[row][col-2] = 0;
						counter++;
						col=3;
					}
					else if(numGrid[row][col] == 0 && col == 1)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row][col-1];
						numGrid[row][col-1] = 0;
						counter++;
						col=3;
					}
				}
			}
		}
		else if(direction == 3)
		{ //////////// DOWN ////////////

			// Check for zeros and move accordingly
			for(int col = 0; col <= 3; col++)
			{
				for(int row = 3; row > 0; row--)
				{
					if(counter >= 3)
					{
						counter = 0;
						break;
					}
					if(numGrid[row][col] == 0 && row == 3)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row-1][col];
						numGrid[row-1][col] = numGrid[row-2][col];
						numGrid[row-2][col] = numGrid[row-3][col];
						numGrid[row-3][col] = 0;
						counter++;
						row=3;
					}
					else if(numGrid[row][col] == 0 && row == 2)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row-1][col];
						numGrid[row-1][col] = numGrid[row-2][col];
						numGrid[row-2][col] = 0;
						counter++;
						row=3;
					}
					else if(numGrid[row][col] == 0 && row == 1)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row-1][col];
						numGrid[row-1][col] = 0;
						counter++;
						row=3;
					}
				}
			}
			// Check for doubles and add if found
			for(int col = 0; col <= 3; col++)
			{
				for(int row = 3; row > 0; row--)
				{
					if(numGrid[row][col] == numGrid[row-1][col])
					{
						numGrid[row][col] = numGrid[row][col] + numGrid[row-1][col];
						numGrid[row-1][col] = 0;
					}
				}
			}
			// Check for zeros and move accordingly
			for(int col = 0; col <= 3; col++)
			{
				for(int row = 3; row > 0; row--)
				{
					if(counter >= 3)
					{
						counter = 0;
						break;
					}
					if(numGrid[row][col] == 0 && row == 3)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row-1][col];
						numGrid[row-1][col] = numGrid[row-2][col];
						numGrid[row-2][col] = numGrid[row-3][col];
						numGrid[row-3][col] = 0;
						counter++;
						row=3;
					}
					else if(numGrid[row][col] == 0 && row == 2)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row-1][col];
						numGrid[row-1][col] = numGrid[row-2][col];
						numGrid[row-2][col] = 0;
						counter++;
						row=3;
					}
					else if(numGrid[row][col] == 0 && row == 1)
					{ // If next to a zero, swap positions
						numGrid[row][col] = numGrid[row-1][col];
						numGrid[row-1][col] = 0;
						counter++;
						row=3;
					}
				}
			}
		}
		printGrid(numGrid);
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



