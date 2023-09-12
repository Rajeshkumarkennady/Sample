package Programs;

public class Armstrong {

	public static void main(String[] args) 
	{
		int num=153,temp1 = num,temp2 = num;
		int count=0;
		int sum=0;
		while(num>0)	//count the digit
		{
			num=num%10;
			count++;
		}
		while(temp1>0)	//take last digit
		{
			int last=temp1%10;
			int prod=1,n=count;	//find the last ^ count
			while(n>0)
			{
				prod=prod*last;
				n--;
			}
			sum=sum+prod;	//add the prod into sum
			temp1=temp1/10;	//remove last digit
		}
		if(sum==temp2) {
			System.out.println("armstrong");
		}
			
		else {
			System.out.println("Not armstrong");
		}
	}
}
