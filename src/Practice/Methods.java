package Practice;

public class Methods {

	public static void main(String[] args) {
		Methods m = new Methods();
		m.getData();
		
		System.out.println();
		m.getData1();
		System.out.println();
		
		
		System.out.println(m.getData2());
		
		int sum = m.getData2();
		System.out.println(sum);
		if(sum<120) {
			System.out.println("test fail");
		}
		
		
		int sum1 = m.getData3(10, 30);
		System.out.println(sum1);
		
		int sum2 = m.getData3(454, 30);
		System.out.println(sum2);
		
		
		
		
		
		
		
		
		
		

	}
	
	
	// no input , no return
	public void getData() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.print(i + "  ");
			}
		}
	}
	
	
	
	public void getData1() {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				
				System.out.print(i + " ");
			}
		}
	}
	
	// no input but some return
	
	public int getData2() {
		
		int i = 50;
		int j = 60;
		int sum = i+j;
		return sum;
	}
	
	// input & return
	public int getData3(int i , int j) {
		int sum = i+j;
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	

}
