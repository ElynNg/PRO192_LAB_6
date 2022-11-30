package LAB_6;

import java.util.Arrays;

public class kthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {74, 85, 102, 99, 101, 56, 84};
		int k = 3;
		System.out.println(kthLargest(a, k));
	}
	
	public static int kthLargest(int a[], int k) {
		Arrays.sort(a);
		return a[a.length-1-k];
	}

}
