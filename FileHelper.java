package uncc.ads.groupproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileHelper {

	// Generate an input file containing 10000 Natural Numbers each less than the given max-limit 
	public void generateInput(int maxLimit,String fileName) throws IOException {
		
		int size= 10000;
		File inputFile =new File("C:\\Users\\Public\\Documents\\"+fileName);
		
		if(!inputFile.exists()) {
			inputFile.createNewFile();
		}

		BufferedWriter buffw= new BufferedWriter(new FileWriter(inputFile));
		
		for(int i=0;i<size;i++) {
			Integer element= getRandomNumber(maxLimit);
			buffw.write(element.toString());
			buffw.write(",");
		}
		buffw.close();
		
	}
	
	//create a File to store the sorted array elements
	public void generateOutput(Integer[] inputs, String fileName) throws IOException {
		File inputFile =new File("C:\\Users\\Public\\Documents\\"+fileName);
		
		if(!inputFile.exists()) {
			inputFile.createNewFile();
		}

		BufferedWriter buffw= new BufferedWriter(new FileWriter(inputFile));
		
		for(int i=0;i<inputs.length-1;i++) {
			buffw.write(inputs[i].toString());
			buffw.write(",");
		}
		buffw.write(inputs[inputs.length-1].toString());
		
		/*buffw.write("\n\n\n Key Comparisions Made:"+Quicksort.getCompare_counter());
		buffw.write("\n\n\n Key Assignments Made:"+Quicksort.getAssign_counter());
		*/
		buffw.close();
		

	}
	
	//read the given file and return an arraylist of integers to sort.
	public List<Integer> loadInput(String fileName) throws IOException {
		
		List<Integer> inputList =new ArrayList<Integer>(); 
		File inputFile =new File("C:\\Users\\Public\\Documents\\"+fileName);
		
		if(!inputFile.exists()) {
			throw new IOException("File Not found");
		}
		
		FileReader fr = new FileReader(inputFile);
		
		BufferedReader buffr = new BufferedReader(fr);
		String line= null;
		int i=0;
		while((line=buffr.readLine())!=null) {
			if(line.length()>0) {
				for(String eleString:line.split(",")) {
					inputList.add(Integer.parseInt(eleString));
				}
			}
		}
		
		buffr.close();
		
		return inputList;
		
	}
	public int getRandomNumber(int max) {
			
			Random r = new Random();
			return r.nextInt(max);
		}
}
