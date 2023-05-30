package Practice;

import java.util.Arrays;

public class Array_1 {

	public static void main(String[] args) {
		int[] aa = new int[10];
		aa[0] = 1;
		aa[1] = 2;
		aa[2] = 3;

		String[] st = new String[5];
		st[0] = "hello";
		st[1] = "World";

		int[] a = { 10, 2, 8, 3, 5, 9, 7, 1, 6, 4 };
		System.out.println(a.length);
		System.out.println(a[4]);
		System.out.println(Arrays.toString(a));
		System.out.println("-------------------------------");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 5) {
				System.out.println(a[i]);
			}
		}

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Arrays.asList(a);

		
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + "  ");
		}
		
		System.out.println();
		System.out.println("-------------------------------");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 !=0) {
				System.out.print(a[i] + "   ");
			}
		}
		
		
		System.out.println();
		System.out.println("-------------------------------");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 ==0) {
				System.out.print(a[i] + "   ");
			}
		}
		
		
		
		System.out.println();
		System.out.println("-------------------------------");
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]%2 ==0) {
				System.out.print(a[i] + "   ");
			}
		}
		
		System.out.println();
		System.out.println("-------------------------------");
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]%2 !=0) {
				System.out.print(a[i] + "   ");
			}
		}
		
		System.out.println();
		System.out.println("-------------------------------");
		Object []obj = {"Java",30,"selenium",23,'A',true,22.33};
		for(int i=0;i<obj.length;i++) {
			if(obj[i].equals(23)) {
				System.out.println(obj[i]);
				break;
			}
		}
		
		
		System.out.println();
		System.out.println("-------------------------------");
		Object [] ob = {"Java",30,"selenium",23,'A',true,22.33};
		System.out.println(Arrays.toString(ob));
		
		for(int i=0;i<ob.length;i++) {
			//System.out.print(ob[i] + "   ");
			if(ob[i].equals("A")) {
				System.out.println("A is present-------!");
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
