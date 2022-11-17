package reversestr.java;
import java.util.Scanner;

public class reversestr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.print("Please Enter string to reverse :");
		str = sc.nextLine();
	
	
		String reverse="";
	 
		String str1;
		for(int i =str.length()-1;i>=0;i--) //25
		{
			reverse = reverse+str.charAt(i);
		}
		System.out.println("Reversed string is "+"\t"+reverse);
	
	    
	         
}

}
