import java.util.Scanner;
class quadratic
{

    public static void main(String args[])
    {
        double a,b,c,disc,root1,root2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of 3 Coefficients a, b and c of a Quadratic Equation");
        System.out.println("Enter the value of a");
        a = in.nextFloat();
        if(a==0)
        {
            System.out.println("It is not a Quadratic Equation");
            System.exit(0);
        }
        System.out.println("Enter the value of b");
        b = in.nextFloat();
        System.out.println("Enter the value of c");
        c = in.nextFloat();
        disc = b * b - 4 * a * c;
        if(disc == 0)
            System.out.println("Equal Roots are " + (- b / (2*a)));
        else if( disc > 0)
        {
            System.out.println(" Real and Distinct roots are ");
            root1 = ((-b + Math.sqrt(disc)) / (2 * a)) ;
            root2 = ((-b - Math.sqrt(disc)) / (2 * a)) ;
            System.out.println(" Root 1 : " + root1);
            System.out.println(" Root 2 : " + root2);
        }
        else {
            System.out.println(" Complex roots are ");

            root1 = (-b ) / (2 * a) ;
            root2 = (Math.sqrt(disc * -1 )) / (2 * a) ;
            System.out.println(" Root 1  : " + root1 + "  + i " + root2 );
            System.out.println(" Root 2 : " + root1 + " - i " + root2 );

        }


    }
}
