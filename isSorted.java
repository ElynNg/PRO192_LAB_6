package LAB_6;

public class isSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[] = {16.1,12.3, 22.2, 14.4};
		System.out.println(isSorted(a));	}
	
	public static boolean isSorted(double a[]) {
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] > a[i+1]) {
				return false;
			}
		}
		return true;
	}

}
