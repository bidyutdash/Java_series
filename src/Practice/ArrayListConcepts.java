package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListConcepts {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars.size());
		System.out.println(cars);
		System.out.println(cars.get(1));
		cars.set(0, "Infinity");
		System.out.println(cars);
		cars.remove(0);
		System.out.println(cars);
		cars.add(0, "Volvo");
		System.out.println(cars);
		System.out.println(cars.contains("BMW"));
		System.out.println(cars.indexOf("Ford"));
		System.out.println(cars.isEmpty());

		for (String e : cars) {
			if (e.equals("Mazda")) {
				System.out.println(e);
			}
		}

		Collections.sort(cars);
		System.out.println(cars);

		// numbers
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(33);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(34);
		myNumbers.add(8);
		myNumbers.add(12);
		
		System.out.println(myNumbers);
		Collections.sort(myNumbers);
		System.out.println(myNumbers);
		for(int i=0;i<myNumbers.size();i++) {
			System.out.println(myNumbers.get(i));
		}
		
		myNumbers.add(6, 55);
		System.out.println(myNumbers);
		
		
		Iterator< Integer> it = myNumbers.iterator();
		while(it.hasNext()) {
			int element = it.next();
			System.out.println(element);
		}
		
		Iterator<String> st = cars.iterator();
		while(st.hasNext()) {
			String ele = st.next();
			System.out.println(ele);
		}
		
		
		
		
		
		
		
		

	}

}
