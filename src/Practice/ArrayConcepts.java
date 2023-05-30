package Practice;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		int [] a = new int [4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		System.out.println(a[2]);
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			if(a[i]==20) {
				System.out.println("this special number.");
			}
		}
		
		System.out.println(Arrays.toString(a));
		
		
		
		
		int [] aa = {11,22,33,44,55,66};
		System.out.println(Arrays.toString(aa));
		for(int i=0;i<aa.length;i++) {
			if(aa[i]==22) {
				System.out.println("Number 22 is present.......");
			}
		}
		
	
		

	}

}
