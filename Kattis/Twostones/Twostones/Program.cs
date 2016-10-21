using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Twostones
{
	class Program
	{
		static void Main(string[] args)
		{
			int input = int.Parse(Console.ReadLine());

			if(input % 2 == 1)
				Console.WriteLine("Alice");
			else
				Console.WriteLine("Bob");
		}
	}
}
