package LAB_6;

import java.util.Scanner;

public class countInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {14,1,22,17,36,7,-43,5};
		Scanner input = new Scanner(System.in);
		int min = input.nextInt();
		int max = input.nextInt();
		System.out.println(countInRange(a, min , max));
	}
	
	public static int countInRange(int[] a, int min, int max) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= min && a[i] <= max) {
				count++;
			}
		}
		return count;
	}

}
