import java.util.Scanner;
class Player
{
   String name;
   int age;
   Player(String n,int a)
   {
      name=n;
      age=a;
   }
   void information()
     {
       System.out.println("the player name is: "+" "+name);
       System.out.println("the age of player is:"+" "+age);
     }
}

class Cricket_Player extends Player
{
	String team;
        int totalrun;
        int totalcenturies;
        Cricket_Player(String n,int a,String t,int r,int c)
        {   super(n,a);
            team=t;
            totalrun=r;
            totalcenturies=c; 
         }
         void disp()
         {
           information();
	   System.out.println("the player team is: "+" "+team);
           System.out.println("the totalrun of player is:"+" "+totalrun);
           System.out.println("the totalcenturies of player is:"+" "+""+totalcenturies);
         }
}
class Football_Player extends Player
{
	String team;
        int totalgoal;
        String type;
        Football_Player(String n,int a,String t,int r,String c)
        {   super(n,a);
            team=t;
            totalgoal=r;
            type=c; 
         }
         void disp()
         {
           information();
	   System.out.println("the player team is: "+" "+team);
           System.out.println("the total ofoal player is:"+" "+totalgoal);
           System.out.println("Type of player is:"+" "+""+type);
         }
}

class Hockey_Player extends Player
{
	String team;
        int totalgoal;
        String typeofplayer;
        Hockey_Player(String n,int a,String t,int r,String c)
        {   super(n,a);
            team=t;
            totalgoal=r;
            typeofplayer=c; 
         }
         void disp()
         {
           information();
	   System.out.println("the player team is: "+" "+team);
           System.out.println("the totalgoal of player is:"+" "+totalgoal);
           System.out.println("Type of player is:"+" "+""+typeofplayer);
         }
}

class Pranjal
{
   public static void main(String args[])
   {
   Cricket_Player g=new Cricket_Player("pranjal",20,"chennai",4999,54);
   Football_Player h=new Football_Player("pranjal",20,"Barcelona",450,"midfielder");
   Hockey_Player j=new Hockey_Player("pranjal",20,"india",345,"goalkeeper");
   Scanner s=new Scanner(System.in);
   int z=s.nextInt();
   System.out.println("enter the choice");
   switch(z)
     {
      case 1:
              g.disp();
              break;
      case 2:
              h.disp();
              break;
      case 3:
              j.disp();
              break;
      
     }
   }
}  

