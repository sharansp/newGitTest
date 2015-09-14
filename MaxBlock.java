package amiti;

public class MaxBlock {

	static void maxBlock(String s)
	{
		int i=0;
		int maxCount=1;
		int count=1;
		String s1 = null,s2 = null ;
		while(i<s.length()-1)
		{
			
			s1 = s.substring(i,i+1);
			s2 = s.substring(i+1,i+2);
			
			if(s1.equals(s2))
			{
				count++;
			}
			else
			{
				if(maxCount<count)
				{
					maxCount=count;
				}
				count=1;
			}
		i++;
		}
		System.out.println("Block length " + maxCount );
	}
	

	static void maxBlockUsingFor(String s)
	{
		int count=1;
		int maxCount=1;
		String s1 = null,s2 = null ;
		for (int i = 0; i < s.length()-1; i++) {
		
			s1 = s.substring(i,i+1);
			s2 = s.substring(i+1,i+2);
			
			if(s1.equals(s2))
			{
				count++;
			}
			else
			{
				if(maxCount<count)
				{
					maxCount=count;
					
				}
				count=1;
			}
		
		}
		System.out.println(" Occured " + maxCount +" times");
	}

	public static void main(String[] args) {
		maxBlock("abbccc");
		maxBlock("abbcccssssss");
		maxBlock("abbcccddddddddllllllllkkk");
		maxBlockUsingFor("sharansharannnnnnss");
	}
	
}
