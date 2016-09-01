import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class babelfish {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> hm = new HashMap<>();
		List<String> output = new ArrayList<String>();
		
		String inputDef;
		String[] defSplit;
		// Define dictionary
		
			while(scan.hasNextLine())
			{
				inputDef = scan.nextLine();
				defSplit = inputDef.split(" ");
				if(defSplit.length > 1)
				{
					// Place definition in hash map
					hm.put(defSplit[1], defSplit[0]);
				}
				else
				{
					if(!inputDef.equals(""))
					{
						if(hm.containsKey(inputDef))
							//output.add(hm.get(inputDef));
							System.out.println(hm.get(inputDef));
						else
						{
							//output.add("eh");
							System.out.println("eh");
						}
					}
					
					
				}
				
			}
	}
}
