package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer> ();
		num.add(1);
		num.add(2);
		System.out.println(num);
		
		ArrayList<Integer> num1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(num1);
		
		List<Integer> num2 = Arrays.asList(99,23,89,22,66,5,23,64,23,44,68);
		System.out.println(num2);
		Collections.sort(num2);
		System.out.println(num2);
		
		for(int i=num2.size()-1;i>=0;i--) {
			System.out.print(num2.get(i) + "  ");
		}
		
		System.out.println();
		for(int i=num2.size()-1;i>=0;i--) {
			if(num2.contains(23)) {
				System.out.println("passed");
				break;
			}
		}
		
		System.out.println();
		for(int i=num2.size()-1;i>=0;i--) {
			if(num2.get(i)%2 !=0) {
				System.out.print(num2.get(i) + "  ");
			}
		}
		
		
		System.out.println();
		for(int i=num2.size()-1;i>=0;i--) {
			if(num2.get(i)%2 ==0) {
				System.out.print(num2.get(i) + "  ");
			}
		}
		
		
		
	}

}
