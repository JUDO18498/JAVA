import java.util.Scanner;
class Telephone
{
  float duration;
  Telephone(float b)
          {
            duration=b;
          }
    void trunk()
      { 
          System.out.println(" the duration of call is"+" "+duration);
      }
}

class Ordinary extends Telephone
{
   double cost;
   Ordinary(double a,float b)
   {
     super(b);
     cost=a;
   }
     void trunk()
     {double g=(duration*cost);
      System.out.println(" the duration of call is"+" "+duration);
      System.out.println("the cost of call per minute is"+" "+cost);
      System.out.println(" the total cost of calling is"+" "+g);
     }
}

class Urgent extends Telephone
{
   double cost;
   Urgent(double c,float b)
   {
     super(b);
     cost=c;
   }
     void trunk()
     {double g=(duration*cost);
      System.out.println(" the duration of call is"+" "+duration);
      System.out.println("the cost of call per minute is"+" "+cost);
      System.out.println(" the total cost of calling is"+" "+g);
     }
}      

class Lightning extends Telephone
{
   double cost;
   Lightning(double d,float b)
   {
     super(b);
     cost=d;
   }
     void trunk()
     { double g=(duration*cost);
      System.out.println(" the duration of call is"+" "+duration);
      System.out.println("the cost of call per minute is"+" "+cost);
      System.out.println(" the total cost of calling is"+" "+g);
     }
}

public class Call
{
   public static void main(String args[])
      {    
           Ordinary obj1=new Ordinary(2,3.5F);
           Urgent obj2=new Urgent(5,3.6F);
           Lightning obj3=new Lightning(8,3.7F);
          Scanner s=new Scanner(System.in);
          System.out.println(" enter the choice of calling");
           String x=s.next();
          switch(x)
            {
              case "urgent":
                           obj1.trunk();
                           break;
              
              case "ordinary":
                           obj2.trunk();
                           break;
 
              case "lightning":
                           obj3.trunk();
                           break;
              default:
                       System.out.println("Wrong Option");
             }
        }
}








