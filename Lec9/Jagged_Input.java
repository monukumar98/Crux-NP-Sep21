package Lec9;

import java.util.Scanner;

public class Jagged_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][];
		System.out.println(arr[0]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("col size ??");
			int c = sc.nextInt();
			arr[i] = new int[c];
		}
		// input 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
				
			}
			
		}
		Display(arr);
		
	}

	
	public static void Display(int [][]arr) {
		for (int i = 0; i < arr.length; i++) {
			 for (int j = 0; j <arr[i].length; j++) {
				 System.out.print(arr[i][j]+" ");
				
			}
			 System.out.println();
			
		}
		
	}
}
