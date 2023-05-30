
public class StringConcept extends abstrac{

	public static void main(String[] args) {
		
		String s = "java";
		String s1 = "java";
		System.out.println(s==s1);
		
		String s2 = new String("java");
		System.out.println(s==s2);
		
		
		String s3 = new String("java");
		System.out.println(s2==s3);
		
		System.out.println(s2.equals(s3));
		
		
		int i = 10;
		String st = String.valueOf(i);
		System.out.println(st+ 10);
		
		

	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		
	}
	

}
