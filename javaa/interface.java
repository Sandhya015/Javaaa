import java.util.Scanner;
interface Resume{
   public void biodata();
  }
  
abstract class staff 
{
    abstract void getdata(); 
}

abstract class candidate {
   
    abstract void getdata(); 
}

class Teacher extends staff implements Resume{
    String name;
    String degree;
    String university;
    String location;
    String branch;
    String achievements;
    int experience;
    long phone;
    public void getdata(){
        Scanner obj = new Scanner(System.in);
        System.out.println(" Enter the Teacher Name : ");
        this.name = obj.next();
        System.out.println(" Enter the Teacher Qualification : ");
        this.degree = obj.next();
        System.out.println(" Enter the Teacher Educational University : ");
        this.university = obj.next();
        System.out.println(" Enter the Teacher Location : ");
        this.location = obj.next();
        System.out.println(" Enter the Teacher Branch : ");
        this.branch = obj.next();
        System.out.println(" Enter the Teacher Achievements: ");
        this.achievements = obj.next();
        System.out.println(" Enter the Teacher Work Experience : ");
        this.experience = obj.nextInt();
        System.out.println(" Enter the Teacher Contact Number : ");
        this.phone = obj.nextLong();
    }

    public void biodata(){
        System.out.println("######### TEACHER RESUME ##########");
        System.out.println("Name: "+ name);
        System.out.println("Qualification: "+ degree);
        System.out.println("University: "+ university);
        System.out.println("Location: "+ location);
        System.out.println("Branch: "+ branch);
        System.out.println("Achievements: "+ achievements);
        System.out.println("Experience: "+ experience);
        System.out.println("Contact: "+ phone);
        System.out.println("######### RESUME ENDS ##########");
        System.out.println();
        System.out.println();
    }
}

class Student extends candidate implements Resume{
    String name;
    String usn;
    String result;
    String discipline;
    long phone;
    public void getdata(){
        Scanner obj = new Scanner(System.in);
        System.out.println(" Enter the Student Name : ");
        name = obj.nextLine();
        System.out.println(" Enter the Student USN : ");
        usn = obj.next();
        System.out.println(" Enter the Student Result : ");
        result = obj.next();
        System.out.println(" Enter the Student Descipline : ");
        this.discipline = obj.next();
        System.out.println(" Enter the Student Contact Number : ");
        this.phone = obj.nextLong();
    }

    public void biodata(){
    System.out.println("\n######### STUDENT RESUME ##########\n");
        System.out.println("\nName: "+ name);
        System.out.println("\nUSN: "+ usn);
        System.out.println("\nResult: "+ result);
        System.out.println("\nDiscipline: "+ discipline);
        System.out.println("\nContact Number: "+ phone);
        System.out.println("\n######### RESUME ENDS ##########\n");
    }
}


 class Mmain {
    public static void main(String[] args) {
        System.out.println("\n Interface\n ");
        //creating objects
        Student s = new Student();
        s.getdata();
        s.biodata();
        Teacher t = new Teacher();
        t.getdata();
        t.biodata();
        
    }
}
