package LAB_6;

import java.util.Scanner;

public class mode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {27, 15, 15, 11, 27};
		System.out.println(mode(a));
	}

	public static int mode(int a[]) {
		int[] countArray = new int[101];
		
		for (int i = 0; i < a.length; i++) {
			countArray[a[i]]++;
		}
		
		int num = -1;
		int count = 0;
		
		for (int i = 0; i < countArray.length; i++) {
			if (countArray[i] > count) {
				num = i;
				count = countArray[i];
				
			}
		}
		return num;
	}
}
