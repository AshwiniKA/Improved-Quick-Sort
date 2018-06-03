package uncc.ads.groupproject;

import java.io.IOException;
import java.math.BigInteger;

public class Quicksort {

	

	private static long compare_counter;
	private static long assign_counter;
	
	public static void doQuickSort(Integer [] array, int low, int high,int m) {
		
		
		
			int threshold=high-low;
			if( threshold <= m) {
				insertionSort(array,low,high);
				return;
			}
			else if(low<high) { 
				
					int pivot=partition(array,low,high); assign_counter++;
					doQuickSort(array, low, pivot-1,m);
					doQuickSort(array, pivot+1,high,m);
					
			}
		
		//compare_counter++;
		
	}

	public static int partition(Integer [] array,int low,int high) {
		
		int pivot= array[low]; //assign_counter++;
		int i=low;
		
		for(int j=i+1;j<=high;j++) {
			
			if(array[j]<=pivot) { compare_counter++;
				i++;
				
				int temp=array[i]; //assign_counter++;
				array[i]=array[j];
				array[j]=temp;
			}
		}
		
		int temp=array[i];	//assign_counter++;
		array[i]=pivot;
		array[low]=temp;
		
		return i;
	}
	
	
	public static void insertionSort(Integer[] array,int low, int high) {

        for(int i=low;i<high;i++)
        {
            
        	int temp = array[i]; assign_counter++;
        	int j=i-1;
            while(j>=0 && temp < array[j])
            {
            	compare_counter++;
                array[j+1]=array[j]; assign_counter++;
                j=j-1;
            }
            compare_counter++;
            array[j+1]=temp; 
            assign_counter++;
        }
    }
	
	public static long getCompare_counter() {
		return compare_counter;
	}

	public static long getAssign_counter() {
		return assign_counter;
	}
	
	public static void setCompare_counter(long compare_counter) {
		Quicksort.compare_counter = compare_counter;
	}

	public static void setAssign_counter(long assign_counter) {
		Quicksort.assign_counter = assign_counter;
	}
	
}
