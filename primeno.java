package week1.day1;

public class primeno {
	
	public static void main (String args[])
	{
		int primeNum=53,i;
		boolean prime=false;
		for(i=2;i<=13/2;++i) 
		{
			if(primeNum%i==0)
				
			{
				prime=true;break;
				
			}
		}
		if(!prime)
			
			System.out.println(primeNum+ " is a prime number");
		else
			System.out.println(primeNum+"is not a prime number");
			
			
	}

}
