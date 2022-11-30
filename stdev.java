package LAB_6;

import java.lang.reflect.Array;

public class stdev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[] = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
		System.out.println(stdev(a));
	}
	
	public static double stdev(double[] a) {
		double sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		double average = sum / a.length;
		double numerator = 0;
		
		for (int i = 0; i < a.length; i++) {
			numerator += Math.pow(a[i] - average, 2);
		}
		
		return Math.sqrt(numerator / (a.length-1));
	}

}
