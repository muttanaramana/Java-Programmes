package Arrayacollections;

import java.util.Arrays;
import java.util.Scanner;

public class Converting_Arrays_To_strings {
	static  Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
			int count=scan.nextInt();
		    int[] days= new int[count];
		       
		         for(int i=0;i<count;i++)
		         {
		        	 days[i]=(int)(Math.random()*100+1);
		         }
		    	 System.out.println(Arrays.toString(days)); 

			}
}
