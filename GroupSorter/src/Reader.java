import java.util.*;
import java.io.*;

public class Reader
	{
		
		public static void main(String[] args) throws IOException
			{
			makeLine();
			}

		private static void makeLine() throws IOException
			{
			Scanner file = new Scanner(new File("roster.txt"));
			while(file.hasNextLine())
				{
					String line = file.nextLine();
					String [] items = line.split(" ");
				}
			}

	}
