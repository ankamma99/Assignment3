import java.util.*;
public class Primenum {
	
	public static void main(String args[])
	{
		
		int n,a;
		int b=0;
		System.out.println("enter the number");
		Scanner in=new Scanner(System.in);
		
		n=in.nextInt();
		a=1;
		
		while(a<=n)
		{
			int x=0;
			 for(b=a;b>=1;b--)
			 {
				 if(a%b==0)
				 {
					 x=x+1;
					 
				 }
			 }
			 
			 if(x==2)
			 {
				 System.out.println(""+a);
			 }
			 a++;
		}
		
		
	}

}
