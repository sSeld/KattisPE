using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Kattis
{
	class Program
	{
		static void Main(string[] args)
		{
			string[] gridNums = Console.ReadLine().Split(' ');
			int rows = int.Parse(gridNums[0]);
			int cols = int.Parse(gridNums[1]);
			char[,] grid = new char[rows, cols];
			int bottom;
			string temp;
			//read in grid
			for (int i = 0; i < rows; i++)
			{
				temp = Console.ReadLine();
				for (int j = 0; j < cols; j++)
				{
					grid[i, j] = temp[j];
				}
				//Console.Write(Environment.NewLine);
			}


			//do logic
			for (int c = 0; c < cols; c++)
			{
				bottom = rows -1;	
				for (int r = rows -1; r >= 0; r--)
				{
					if(grid[r, c] == 'a' && bottom > 0)
					{
						grid[r, c] = '.';
						grid[bottom, c] = 'a';
						bottom -= 1;
					}
					if(grid[r, c] == '#' && r > 0)
					{
						bottom = r - 1;
					}
				}
			}

			//Console.WriteLine();
			//Console.WriteLine();

			//print grid
			for (int i = 0; i < rows; i++)
			{
				for (int j = 0; j < cols; j++)
				{
					Console.Write(grid[i, j]);
				}
				Console.Write("\n");
			}
		}
	}
}
