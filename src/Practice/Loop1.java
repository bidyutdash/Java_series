package Practice;

public class Loop1 {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
		
		// do while loop
		int x=1, i=2;
		do
		{
		x = x*i;//1*2+1*3+1*4+1*5=2*3*4*5
		}
		while(++i<=5);
		System.out.println(x);
		
		int y=1, z=2;
		do {
			y = y*z; //1*2 + 1*3 + 1*4 =24
		} 
		while (z++<=3);
		System.out.println(y);
		
		// 
		int c=1;
		int d=5;
		do{
		d=d*2;// 10/20//40/60/80
		System.out.println(d);
		c++;
		}
		while(c<=5); 
		
		
		
		
		
		}
	}	

