package LAB_6;

import java.util.Scanner;

public class minGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}
		System.out.println(minGap(a));
	}

	public static int minGap(int a[]) {
		int min = 100;
		if (a.length == 1 || a.length == 0) {
			min = 0;
		}
		else {
			for (int i = 0; i < a.length-1; i++) {
				if (a[i+1] - a[i] < min) {
					min = a[i+1] - a[i];
				}
			}
		}
		return min;
	}
}
