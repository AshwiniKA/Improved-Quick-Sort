package uncc.ads.groupproject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
*
*
*
 * */
public class Executor {

	public static void main(String[] args) {
		
	

		FileHelper fh=new FileHelper();
		
		List <Integer> inputList=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		try {
			
			
			System.out.println("Enter the value of K:");
			Integer k= sc.nextInt();
			System.out.println("Enter the start value of M- range:");
			Integer m_start= sc.nextInt();
			System.out.println("Enter the end value of M- range:");
			Integer m_end= sc.nextInt();
			
			DecimalFormat df=new DecimalFormat("#,###");
					
			fh.generateInput(k,"input1000.txt");
			
			inputList=fh.loadInput("input1000.txt");
			
			
			
			long Start= System.currentTimeMillis();
			Integer[] inputs=null;
			for(int j=m_start;j<=m_end;j++)
			{
				
				Quicksort.setAssign_counter(0);
				Quicksort.setCompare_counter(0);
				
				inputs= inputList.toArray(new Integer[inputList.size()]);
				
				Quicksort.doQuickSort(inputs,0,inputs.length-1,j);
	
				System.out.println("\nIteration for m:"+ j);
				
				System.out.println("The key comparisions made:"+df.format(Quicksort.getCompare_counter()));
				
				System.out.println("The key assignments made:"+df.format(Quicksort.getAssign_counter()));
				
			}
			
			//Final Sorted Array:
			fh.generateOutput(inputs, "output1000.txt");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	
	}

}