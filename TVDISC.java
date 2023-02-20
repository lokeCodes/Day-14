/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--> 0){
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int res1 = a-c;
		int res2 = b-d;
		if(res1<res2){
		    System.out.println("First");
		}else if(res1==res2){
		    System.out.println("Any");
		}else{
		    System.out.println("Second");
		}
		}
		
	}
}
