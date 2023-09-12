package Programs;

import java.util.Scanner;

public class reverseString1 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String sc=scan.next();
		String str=sc,nstr = "";
		char ch;
		System.out.println("Original string: "+str);
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println("Reverse String: "+nstr);
	
	

}
}