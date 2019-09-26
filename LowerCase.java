
public class LowerCase {
	
	public static String toLowerCase(String str) {
//		String word = "";
		for(int i = 0; i < str.length(); i++) {
			char var = str.charAt(i);
			if(Character.isUpperCase(var))
				str.replace(var, Character.toLowerCase(var));
		
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		String word = "faljfdafDFDFASDFdsafFDS";
		System.out.println(toLowerCase(word));
	} 
}
