import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int[] inputs = new int[3];
		Scanner scan = new Scanner(System.in);

		for(int i = 0; i < 3; i++)
		{
			inputs[i] = scan.nextInt();
			//System.out.print(" ");
			//System.out.println(inputs[i]);
		}
		
		if(inputs[0] + inputs[1] == inputs[2])
		{
			System.out.println(inputs[0] + "+" + inputs[1] + "=" + inputs[2] );
		}
		else if(inputs[0] - inputs[1] == inputs[2])
		{
			System.out.println(inputs[0] + "-" + inputs[1] + "=" + inputs[2] );
		}
		else if(inputs[0] * inputs[1] == inputs[2])
		{
			System.out.println(inputs[0] + "*" + inputs[1] + "=" + inputs[2] );
		}
		else if(inputs[0] / inputs[1] == inputs[2])
		{
			System.out.println(inputs[0] + "/" + inputs[1] + "=" + inputs[2] );
		}
		else if(inputs[0] == inputs[1] + inputs[2])
		{
			System.out.println(inputs[0] + "=" + inputs[1] + "+" + inputs[2] );
		}
		else if(inputs[0] == inputs[1] - inputs[2])
		{
			System.out.println(inputs[0] + "=" + inputs[1] + "-" + inputs[2] );
		}
		else if(inputs[0] == inputs[1] * inputs[2])
		{
			System.out.println(inputs[0] + "=" + inputs[1] + "*" + inputs[2] );
		}
		else if(inputs[0] == inputs[1] / inputs[2])
		{
			System.out.println(inputs[0] + "=" + inputs[1] + "/" + inputs[2] );
		}
		
	}
	

}
