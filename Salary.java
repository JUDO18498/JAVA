class Worker
{       
	String Name;
	int empno;
        Worker(int n,String m)
	{
          Name=m;
          empno=n;
	}
         void show()
          {
            System.out.println("the name of employee is"+""+Name);
            System.out.println("emplyeeno of employee is"+""+empno);
          }
	
}

class DailyWorker extends Worker
{       int rate;
        DailyWorker(int n,String m,int r)
         {  
            super(n,m);
            rate=r;
            
         }



      void Compay(int hours)
	{    
            show();
            System.out.println("Salary is:"+" "+""+rate*hours);
	 }
           
           
}
class SalaryWorker extends Worker
{
        int rate;
        SalaryWorker(int n,String m,int r)
         { 
            super(n,m);
            rate=r;
            
         }

         int hours=40;

       void Compay()
	{    
            show();
            System.out.println("Salary is:"+" "+""+rate*hours);
	 }
             
}

public class Salary
{
     public static void main(String args[])
	{
          SalaryWorker q=new SalaryWorker(1555,"pranjal",20);
          DailyWorker t=new DailyWorker(20000,"pranjal",15);
           t.Compay(10);
           q.Compay();
	}
}
