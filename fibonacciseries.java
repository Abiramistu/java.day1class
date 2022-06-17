package week1.day1;

public class fibonacciseries 
{
	public static void main(String args[]) 
	{
	int f=0,f1=1,f2,i,count=8;
	System.out.println(f+""+f1);
	
	for(i=2;i<count;++i)
		
	{
		f2=f+f1;
		System.out.println(" "+f2);
		f=f1;
		f1=f2;
	}

}
}