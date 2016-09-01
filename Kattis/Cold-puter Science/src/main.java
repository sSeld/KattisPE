import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] inputList = new int[input];
		int counter = 0;
		for(int i = 0; i < input; i++)
		{
			inputList[i] = scan.nextInt();
			if(inputList[i] < 0)
			{
				counter++;
			}
		}
		System.out.println(counter);
		
	}

}
