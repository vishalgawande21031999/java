
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("enter number of companies");
int n = in.nextInt();
int []price=new int[10];
char[]name=new char[10];

for(int i=0;i<n;i++)
{
    System.out.println("enter company name and price");
    name[i]=in.nextLine();
    price[i]=in.nextInt();
} int max=price[0];
	for(int i=0;i<n;i++)
	{
	   
	    if(price[i]>max)
	    {max=price[i];
	       
	        System.out.println(name[i],max);
	    }
       else
       i++;
	}
	    
	}
}
