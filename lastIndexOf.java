package LAB_6;

import java.util.Scanner;

public class lastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = input.nextInt();
		}
		int num = input.nextInt();
		System.out.println(lastIndexOf(a , num));
	}
	
	public static int lastIndexOf(int[] a, int num) {
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == num) {
				return i+1;
			}
			
		}
		return -1;
	}

}
