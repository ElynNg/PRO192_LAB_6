package LAB_6;

import java.util.Scanner;

public class range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a[] = {8,3,5,7,2,4};
		
		System.out.println(range(a));
	}
	
	public static int range(int[] a) {
		int min = 100;
		int max = 0;
		if (a.length == 1) {
			return 1;
		}
		else {
			for (int i = 0; i < a.length-1 ; i++) {
				if (a[i] > max) {
					max = a[i];
				}
				if (a[i] < min) {
					min = a[i];
				}
			}
			return (max - min + 1);
		}
	}

}
