package Programs;

import java.util.Scanner;

public class strongNumber {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=scan.nextInt();
		int temp1=num;
		int sum=0;
		while(num!=0)
		{
			int last=num%10;
			int fact=1;
			while(last>1)
			{
				fact=fact*last;
				last--;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==temp1)
		{
			System.out.println(temp1+" is Strong Number");
		}
		else
		{
			System.out.println(temp1+" is not Strong Number");
		}	
	}
}