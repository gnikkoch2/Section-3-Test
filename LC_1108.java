import java.util.Scanner;

public class LC_1108 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Input: address = ");
		String address = defangIPaddr2(console.next());
		
		System.out.println("Output: " + address);
	}
	
	public static String defangIPaddr(String address) {
		address = address.replace(".", "[.]");
		return address;
	}
	
	public static String defangIPaddr2(String address) {
		String local = "";
		for(int i = 0; i < address.length(); i++) {
			if(address.charAt(i) == '.')
				local += "[.]";
			else
				local += address.charAt(i);
		}
		return local;
	}
}
