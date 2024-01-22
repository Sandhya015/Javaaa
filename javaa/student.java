import java.util.Scanner;
class student{
    String usn;
    String name;
    String branch;
    long phone;
    public void getdata(){
       Scanner in = new Scanner(System.in);
            System.out.println("USN : ");
           usn = in.nextLine();
            System.out.println(" Name : ");
            name = in.nextLine();
            System.out.println(" Branch: ");
            branch = in.nextLine();
            System.out.println("Phone :");
            phone = in.nextLong();
        }
    
    public void display(){
         
        
            
            System.out.println("*********************************");
            System.out.println("USN : " + usn);
            
            System.out.println(" Name : " + name);
             
            System.out.println(" Branch: " + branch);
             
            System.out.println("Phone :" + phone);
             System.out.println("*********************************");
           
        
    }
}
class Students
{
    
    public static void main(String args[]){
        student[] obj = new student[3];
         int count,i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the count of Students : ");
        count = in.nextInt();
        for(i=0;i<count;i++){
            obj[i] = new student();
        }
        for(i=0;i<count;i++){
        System.out.println(" Enter the  Student " + (i + 1 ) + " Details");
        obj[i].getdata();
        }
           System.out.println("Student Information Entered Are : ");
          for(i=0;i<count;i++){ 
              System.out.println("Student " + (i + 1 ) + " Details");
          obj[i].display();
        
    }
    }
    
}
