import java.util.Scanner;
public class exception  {
     static void check() throws ArithmeticException   
       {  
            System.out.println("Inside check function");
            throw new ArithmeticException("Using Throws Keyword");
        }
   public static void main(String args[])  {
     
      Scanner in = new Scanner(System.in);
      Main ob = new Main();
     try{  
            System.out.println("::Inside Try block 1 ::");
            System.out.println("Enter the value of a : ");
            int a = in.nextInt();
             System.out.println("Enter the value of b : ");
            int b = in.nextInt();
            int num=a/b;  
            System.out.println(num); 
            
      }  
      
      catch(ArithmeticException e){
          System.out.println("::Inside Catch block 1 ::");
         System.out.println("ArithmeticException::Number divided by zero");
      }  
       try{  
            System.out.println("::Inside Try  block 2::");
            System.out.println("Enter the value of a : ");
            int a = in.nextInt();
             System.out.println("Enter the value of b : ");
            int b = in.nextInt();
            if(b==0)
            throw new ArithmeticException("Using Throw "); 
       }
       catch(ArithmeticException e)
       {
            System.out.println("Exception caught in catch block : 2 ");
        }
         try
        {
             check();
         }
        catch(ArithmeticException e)
         {
             System.out.println("Caught with throws block" + e);
         }
      
     
       
      finally{
          System.out.println("::Inside Finally block::");
      }  
      System.out.println("Rest of the code continues...");  
   }   
}
