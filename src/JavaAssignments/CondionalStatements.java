package JavaAssignments;

public class CondionalStatements {

	public static void main(String[] args) {
		// greatest number among 3
				int num1 = 25;
				int num2 = 78;
				int num3 = 187;
				
				if(num1>num2 && num1>num3) {
					System.out.println("Gretest number is : " + num1);
				} 
				else if(num2>num3) {
					System.out.println("Greatest number is : " + num2);
				}
				else {
					System.out.println("Greatest number is : " + num3);
				}
				
				
			// Write a Java program to test a number is positive or negative.Test DataInput number: 35 -- positive numberInput number: -11 -- negative number
				int num = -1;
				if(num<0) {
					System.out.println("This is a negative number & provided number is : " + num);
				} 
				else if (num>=0) {
					System.out.println("This is a positive number & provided number is : " + num);
				}
				
			// 
				
				int temperture = 80;
				if(temperture<=30) {
					System.out.println("it's very cold outside");
				} 
				else if(temperture>30 && temperture<=40) {
					System.out.println("it's cold");
				}
				else if(temperture>40 && temperture<=60) {
					System.out.println("nice weather");
				}
				else {
					System.out.println("it's hot");
				}
				
				
				// vowerl or consonent
				char ch = 's';
				
				if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch =='u' || ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch =='U') {
					System.out.println("it's a vowel");
				}
				else {
					System.out.println("it's a consonant...");
				}
				
				// greatest value among 4
				int p = 900;
				int q = 1200;
				int r = 700;
				int s = 1400;
				if(p>q && p>r && p>s) {
					System.out.println("P is greatest");
				} else if(q>r && q>s){
					System.out.println("q is greatest");
				} else if(r>s) {
					System.out.println("r is greatest");
				}
				else {
					System.out.println("s is greatest");
				}
				
				
				

	}

}
