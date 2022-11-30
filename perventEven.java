package LAB_6;

import java.util.Scanner;

public class perventEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double a[] = new double[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextDouble();
		}
		
		System.out.println(percentEven(a));
	}
	
	public static double percentEven(double a[]) {
		int count = 0;
		if (a.length < 1) {
			return 0.0;
		}
		else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 0) {
					count++;
				}
			}
			return (double)(count*100)/a.length;
		}
	}

}
