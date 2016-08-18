import java.util.*;

class rev
{
public static void main(String[] args)
{
int n=1221;
		int reverse=0;
		int temp=n;
		
		while(n>0)
		{
			reverse=reverse*10;
			reverse=reverse+n%10;
			n=n/10;
		}
		
		System.out.println("reversed number is" +reverse);
		
		
}
}