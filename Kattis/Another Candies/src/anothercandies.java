import java.math.BigInteger;
import java.util.Scanner;

public class anothercandies {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		int children;
		//BigInteger length;
		String[] output = new String[cases];

		for(int i = 0; i < cases; i++)
		{
			System.out.println("");
			children = scan.nextInt();
			BigInteger[] candies = new BigInteger[children];
			BigInteger sum = BigInteger.valueOf(0);
			for(int k = 0; k < children; k++)
			{
				candies[k] = scan.nextBigInteger();
				sum = sum.add(candies[k]);
			}
			BigInteger length = BigInteger.valueOf(children);
			BigInteger ifRemain = sum.remainder(length);
			if(ifRemain.equals(BigInteger.ZERO))
				output[i] = "YES";
			else
				output[i] = "NO";
		}
		for(int p = 0; p < cases; p++)
			System.out.println(output[p]);
	}

}
