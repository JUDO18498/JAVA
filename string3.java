import java.util.*;


class string3
{

public static void main(String args[])
{

	String str=args[0];

	
			
			for(int i=0;i<str.length();i++)

			{

				char ch=str.charAt(i);

				if(str.charAt(i)>97 && str.charAt(i)<123)

				{

				ch=(char)((ch-32));

				//System.out.println("Inside if else");

				}

				System.out.print(ch);

			}


          }

}