/* package codechef; // don't place package name! */

// https://www.codechef.com/problems/TYRE
// Question Link^^^

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
		while(t-- > 0){
		    int x = 2*(s.nextInt());
		    int y = 4*(s.nextInt());
		    int res = x+y;
		    System.out.println(res);
		}
	}
}
