package LAB_6;

import java.util.Scanner;
import java.util.Arrays;

public class median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[11];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}
		
		System.out.println(median(a));
	}

	public static int median(int a[]) {
		Arrays.sort(a);
		return a[a.length/2];
	}
}
