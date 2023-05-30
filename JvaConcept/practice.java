
public class practice {

	public static void main(String[] args) {
		

		String st = "java testng selenium";
		String [] words = st.split(" ");
		String rev =  "";
		for(int i=words[0].length()-1;i>=0;i--) {
			rev = rev + words[0].charAt(i);
		}
		
		//rev = rev + " " + words[2];
		rev = rev + " " + words[1]+" " + words[2];
		
		System.out.println(rev);

	}

}
