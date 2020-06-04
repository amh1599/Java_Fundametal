package Test_Folder;

import java.util.Scanner;

public class KakaoQ1Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arr3 = new int[n];
		
		for(int i = 0; i< arr1.length; i++) {
			Scanner sc2 = new Scanner(System.in);
			arr1[i] = sc2.nextInt();
		}
		for(int i = 0; i< arr2.length; i++) {
			Scanner sc2 = new Scanner(System.in);
			arr2[i] = sc2.nextInt();
		}
		
		for(int i = 0; i< arr1.length; i++) {
			arr3[i] = arr1[i] | arr2[i];
		}
		
		for(int i = 0; i< arr3.length; i++) {
			String a2 = Integer.toBinaryString(arr3[i]);
			a2 = a2.replaceAll("1", "#");
			a2 = a2.replaceAll("0", " ");
			System.out.printf("{%s} ", a2 );
		}
		
		
	}
}
