
public class pract {
	
	
	public static String reverseString(String st) {
		
		if(st==null) {
			System.out.println("plz pass the right value, you are passing null value");
			throw new RuntimeException("NULL_VALUES");
		} 
		
		
		if (st.length()==0) {
			return "you are passing blank value";
		} 
		
		if (st.length()==1) {
			return st;
		}
		
		String reverse = "";
		for(int i=st.length()-1;i>=0;i--) {
			reverse = reverse + st.charAt(i);
		}
		return reverse;
	}
	

	public static void main(String[] args) {
		//System.out.println(reverseString("selenium"));
		//System.out.println(reverseString(null));
		
		System.out.println(getReverse(null));

	}
	
	
	
	
	public static String getReverse(String st) {
		if (st==null) {
			throw new RuntimeException("NULL");
		}
		
		if(st.length()==1) {
			return st;
		}
		if (st.length()==0) {
			return "Plz dont pass blank values";
		}
		
		
		String rev = "";
		for(int i=st.length()-1;i>=0;i--) {
			rev = rev + st.charAt(i);
		}
		return rev;
	}
	
	
	
	
	
	

}
