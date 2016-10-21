using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bijele
{
	class Program
	{
		static void Main(string[] args)
		{
			int[] shouldContain = { 1, 1, 2, 2, 2, 8 };
			string[] piecesS = Console.ReadLine().Split();
			int[] piecesI = new int[6];
			for(int i = 0; i < 6; i++)
			{
				piecesI[i] = int.Parse(piecesS[i]);
				if (piecesI[i] > shouldContain[i])
					piecesI[i] = -(piecesI[i] - shouldContain[i]);
				else if (piecesI[i] < shouldContain[i])
					piecesI[i] = shouldContain[i] - piecesI[i];
				else
					piecesI[i] = 0;

				Console.Write(piecesI[i] + " ");

			}
		}
	}
}
