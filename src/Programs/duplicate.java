package Programs;

public class duplicate {
	
	public static void main(String[] args) 
	{
		String[] str= {"a","b","c","a","b","c","a","e"};
		boolean[] flag=new boolean[str.length];
		for(int i=0;i<str.length;i++)
		{
			int count=1;
			if(flag[i]==false)
			{
				for(int j=i+1;j<str.length;j++)
				{
					if(str[i]==str[j])
					{
						count++;
						flag[j]=true;
					}
				}
				if(count%2!=0)
				{
					System.out.println(str[i]+" appearded in "+count);
				}
			}
		}
		
	
	}
}
