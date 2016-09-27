import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadArrayFromFile {
	String fileName;
	Scanner theScanner = null;
	ArrayList<String> CopyFile = new ArrayList<>();

	public ReadArrayFromFile(String A) {
		fileName = A;
		try {
			theScanner = new Scanner(new FileInputStream(fileName));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (theScanner.hasNextLine()) {
			String nextLine = theScanner.next();
			for (int i = 0; i < CopyFile.size(); i++) {
				CopyFile.add(i, nextLine);
			}
		}
		theScanner.close();
		
	}
	
	public ArrayList<String> returnString()
{
	return CopyFile;
		
}
	
}
