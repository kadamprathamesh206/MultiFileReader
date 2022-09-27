package in.sts.stsproject.multifilereader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiFileReader {
	public static void main(String[] args) throws IOException {

	        BufferReader  bufferRead=null;
		ArrayList<String>txtFiles=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the drive name");
		String drive=scanner.nextLine();
		String     path=""+drive+":\\";
		try {
			File file=new File(path);
			File[]listOfFiles=file.listFiles();

			for(File file1:listOfFiles) {
				if(file1.getName().endsWith(".txt")==true) {
					txtFiles.add(path+file1.getName());
				}

			}
			System.out.println(txtFiles);
			for(String files:txtFiles) {
				int count=0;
				String line;

				FileReader fileRead=new FileReader(file);
				BufferedReader bufferRead=new BufferedReader(fileRead);


				while((line=bufferRead.readLine())!=null) {
					String []words=line.split(" ");                         //words object for storing the words in the string 
					count=count+words.length;                               //count object for storing the to total no of count
					System.out.println(count);

				}


				count=0;

			} 


		}

		catch(FileNotFoundException fileNotFoundException) {
			System.out.println("File not found Exception");
		}finally{
			if(bufferRead!=null){
				bufferRead.close();


	}
}

