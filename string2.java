import java.util.*;

import java.util.Scanner;


class string2
{

public static void main(String args[])
{

StringBuffer st=new StringBuffer("hello");


	for(int i=0;i<st.length();i++)

	{
		
char ch=st.charAt(i);
		
if(st.charAt(i)>97 && st.charAt(i)<123)

		{

		ch=(char)((ch-32));

		//System.out.println("Inside if else");

		}

		System.out.println(ch);

		
	}

               
}

}