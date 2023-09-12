package Programs;

public class Array {
	public static void main(String[] args) 
	{
		String[] arr= {"a","b","c","a","b","c","a","e"};
		
		boolean[] flag=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int count =1;
			if(flag[i]==false)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						flag[j]=true;
					}
				}
				if(count%2!=0)
				{
					System.out.println(arr[i]+" appeared in "+count);
				}
			}
		}
		
	}
}