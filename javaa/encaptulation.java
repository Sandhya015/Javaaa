public class encaptulation {
   
    private String name;
    private int age;

    
    public encaptulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String newName) {
        this.name = newName;
    }

    
    public int getAge() {
        return age;
    }

   
    public void setAge(int newAge) {
        if (newAge > 0) {
            this.age = newAge;
        } else {
            System.out.println("Invalid age. Age must be greater than 0.");
        }
    }


   
    public void displayStudentInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student Age: " + getAge());
    }

    public static void main(String[] args) {
        
        encaptulation student1 = new encaptulation("sandhya", 20);

        
        student1.displayStudentInfo();

        
        student1.setAge(-5); 
        student1.setAge(21); 

        
        student1.displayStudentInfo();
    }
}
