import java.util.Scanner;

public class funhouse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String widthHeight = scan.nextLine();
		String[] splitInput = widthHeight.split(" ");
		int width = Integer.parseInt(splitInput[0]);
		int height = Integer.parseInt(splitInput[1]);
		
		
		char[][] house = new char[width][height];
		

	}

}
