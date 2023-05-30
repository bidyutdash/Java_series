package Practice;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i = 1;		
		
		while(i<=5) {
			System.out.println("Hello");
			i++;
		}
		
		// Ques:2
		int datacount = 1;
		
		while(datacount <= 6) {
			if(datacount % 2 ==2) {
				System.out.println("First");      
			} 
			else if (datacount % 3 ==0) {
				System.out.println("Second");
			}
			else {
				System.out.println("Third");
			}	
			datacount++;
	}
		
		// Printing the numbers from 1 to 10:
		int a = 1;
		while(a<=10) {
			System.out.print(a);
			a++;
		}
		System.out.println();
		// Summing the numbers from 1 to 100:
		int b = 1;
		int sum = 0;
		while(b<=100) {
			sum = sum + b;
			b++;
		}
		System.out.println(sum);
		
		// Printing the first 10 even numbers:
		int c = 2;
		int count = 0;
		while(count<10) {
			System.out.println(c);
			c = c+2;
			count++;
		}
		
		System.out.println("*******");
		// Printing the first 10 even numbers:
		int f = 1;
		int count1 = 0;
		while(count1<10) {
			System.out.println(f + " ");
			f = f+2;
			count1++;
		}
		
		System.out.println("*******");
		// Printing the numbers in reverse order from 10 to 1:
		int d = 10;
		while(d>=1) {
			System.out.print(d + " ");
			d--;
		}
		System.out.println();
		
		// print odd numbers reverse order
		int e = 9;
		while(e>=1) {
			System.out.print(e + " ");
			e = e -1;
			e--;
		}
		
		System.out.println();
		
		// print even numbers reverse order
		
		
		
		
	}

}
