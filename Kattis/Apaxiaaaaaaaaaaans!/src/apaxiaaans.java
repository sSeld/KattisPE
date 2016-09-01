import java.util.Scanner;

public class apaxiaaans {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String output = "";
		
		for(int i = 0; i < input.length(); i++)
		{
			//System.out.print(input.charAt(i));
			if(i == 0)
			{
				output += input.charAt(i);
			}
			else if(input.charAt(i) == input.charAt(i-1))
			{
				//System.out.print(input.charAt(i));
			}
			else
			{
				output += input.charAt(i);
			}
		}
		
		System.out.println(output);
	}

}
