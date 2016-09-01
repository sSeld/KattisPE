import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		String words;
		String[] sounds;
		String foxSays = "";
		String currentLine;
		List<String> sounds1 = new ArrayList<String>();
		String[] soundS;
		for(int i = 0; i < cases; i++)
		{
			words = scan.nextLine();
			sounds = words.split(" ");
			for(int j = 0; j < sounds.length; j++)
			{
				sounds1.add(sounds[j]);
			}
			System.out.println(sounds1);
			while(true)
			{
				currentLine = scan.nextLine();
				if(currentLine.contains("fox"))
				{
					System.out.println(sounds1.toString());
					break;
				}
				soundS = currentLine.split(" ");
				if(sounds1.contains(soundS[2]))
				{
					sounds1.remove(soundS[2]);
				}
			}
//			for(int k =0; k < sounds1.size(); k++)
//			{
//				System.out.print(sounds1[k]);
//			}
			
		}
	}
}
