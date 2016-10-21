using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Trik
{
	class Program
	{
		static void Main(string[] args)
		{
			string moves = Console.ReadLine();
			int[] cups = { 1, 0, 0 };
			int temp;
			foreach(char move in moves)
			{
				switch (move)
				{
					case 'A':
						temp = cups[0];
						cups[0] = cups[1];
						cups[1] = temp;
						break;
					case 'B':
						temp = cups[1];
						cups[1] = cups[2];
						cups[2] = temp;
						break;
					case 'C':
						temp = cups[0];
						cups[0] = cups[2];
						cups[2] = temp;
						break;
					default:
						break;
				}
			}

			for(int i = 0; i<3; i++)
			{
				if(cups[i] == 1)
					Console.WriteLine(i + 1);
			}
		}
	}
}
