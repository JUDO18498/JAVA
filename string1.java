import java.util.*;

import java.util.Scanner;


class string1
{

public static void main(String args[])
{

Scanner sc=new Scanner(System.in);

String s="Hello My Name is Vijay Chauhan";

System.out.println("Enter 1st word to be searched: ");

String f1=sc.next();

System.out.println("Enter 2nd word to be searched:");

String se1=sc.next();


System.out.println("First Occurrence of "+f1+" is"+s.indexOf(f1));

System.out.println("Last Occurrence of "+f1+" is"+s.lastIndexOf(f1));


System.out.println("First Occurrence of "+se1+" is"+s.indexOf(se1));

System.out.println("Last Occurrence of "+se1+" is"+s.lastIndexOf(se1));


}

}