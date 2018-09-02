
import java.util.Arrays;
import java.util.Scanner;


public class main
{
    private static final int LEFT = 0;
    private static final int UP = 1;
    private static final int RIGHT = 2;
    private static final int DOWN = 3;


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[][] numGrid = new int[4][4];
        boolean continueGame = true;
        int input;

        // Input game grid
        for (int row = 0; row < 4; row++)
        {
            for (int col = 0; col < 4; col++)
            {
                numGrid[row][col] = scan.nextInt();
            }
        }

        //while (continueGame)
        //{
            input = scan.nextInt();
            updateGrid(input, numGrid);
        //}
    }

    private static void updateGrid(int direction, int[][] numGrid)
    {
        switch (direction)
        {
            case LEFT:
                for (int i = 0; i < numGrid.length; i++)
                    numGrid[i] = calculateRow(numGrid[i]);
                break;
            case UP:
                for (int i = 0; i < numGrid.length; i++)
                    numGrid = putColumn(numGrid, calculateRow(getColumn(numGrid, i)), i);
                break;
            case RIGHT:
                for (int i = 0; i < numGrid.length; i++)
                    numGrid[i] = reverse(calculateRow(reverse(numGrid[i])));
                break;
            case DOWN:
                for (int i = 0; i < numGrid.length; i++)
                    numGrid = putColumn(numGrid, reverse(calculateRow(reverse(getColumn(numGrid, i)))), i);
                break;
        }
        printGrid(numGrid);
    }

    private static int[] calculateRow(int[] row)
    {
        int[] returnRow = new int[4];

        int[] rowFiltered = Arrays.stream(row)
                .filter(i -> i != 0)
                .toArray();

        for (int pos = 0; pos < rowFiltered.length; pos++)
        {
            if ((rowFiltered.length - (pos + 1)) > 0)
            {
                // Can check next position
                if (rowFiltered[pos] == rowFiltered[pos + 1])
                {
                    rowFiltered[pos] = rowFiltered[pos] + rowFiltered[pos + 1];
                    rowFiltered[pos + 1] = 0;
                }
            }
            else
            {
                break;
            }

        }

        rowFiltered = Arrays.stream(rowFiltered)
                .filter(i -> i != 0)
                .toArray();

        //apply zeros
        for (int i = 0; i < returnRow.length; i++)
        {
            returnRow[i] = i < rowFiltered.length ? rowFiltered[i] : 0;
        }
        return returnRow;
    }

    private static int[] reverse(int[] row)
    {
        for (int i = 0; i < row.length / 2; i++)
        {
            int holder = row[i];
            row[i] = row[row.length - i - 1];
            row[row.length - i - 1] = holder;
        }
        return row;
    }

    private static int[] getColumn(int[][] numGrid, int col)
    {
        int[] returnColumn = new int[4];
        for (int i = 0; i < numGrid.length; i++)
        {
            returnColumn[i] = numGrid[i][col];
        }
        return returnColumn;
    }

    private static int[][] putColumn(int[][] grid, int[] columnArray, int col){
        for (int i = 0; i < columnArray.length; i++)
        {
            grid[i][col] = columnArray[i];
        }
        return grid;
    }

    private static void printGrid(int[][] numGrid)
    {
        for (int r = 0; r < 4; r++)
        {
            for (int c = 0; c < 4; c++)
            {
                System.out.print(numGrid[r][c] + " ");
            }
            System.out.print("\n");
        }
    }
}



