import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] numGrid = new int[4][4];
		
		for(int r = 0; r < 4; r++)
		{
			for(int c = 0; c < 4; c++)
			{
				numGrid[r][c] = scan.nextInt();
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
