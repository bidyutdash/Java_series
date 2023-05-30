package JavaAssignments;

public class Loops {

	public static void main(String[] args) {
		
		int i = 1;
		while(i<=10) {
			System.out.print(i);
		    i++;
		}
		System.out.println();
		
		char j = 'a';
		while(j<='z') {
			System.out.print(j);
			j++;
		}
		
		System.out.println();
		
		char b = 'a';
		while(b<='z') {
			System.out.print((int)b + " ");
			b++;
		}
		
		System.out.println();
		
		char c = 'A';
		while(c<='Z') {
			System.out.print((byte)c + " ");
			c++;
		}
		
		System.out.println();
		
		char d = 'b';
		while(d=='b') {
			System.out.print((byte)d + " ***");
			d++;
			break;
		}
		
		System.out.println();
		
		for(int k=0;k<=10;k++) {
			System.out.println("hello world");
			k++;
		}
		
		System.out.println();
		
		for(int l=0;l<=10;l++) {
			System.out.print(l + " ");
			l = l+1;
		}
		
		System.out.println(); 
		
		for(int r = 0;r<=10;r++) {
			System.out.print(r + " ");
			if(r==5) {
				break;
			}
			
		}
		
		System.out.println(); 
		
		for(int h = 0;h<=10;h++) {
			if(h==3) {
				System.out.println("***** "+h);
			}
		}
		
		for(byte t =1;t<=129;t++) {
			System.out.print(t+ " ");
		}
		
		
		
		
		
		
		

	}

}
