import java.util.Arrays;
import java.util.Scanner;

public class SecondOrder{
    
    public static void main(String[] args){

        //Scanner to read data
        var s = new Scanner(System.in);
        //Reading and storing data
        s.next();
        double s1 = s.nextDouble();
        s.next();
        double s2 = s.nextDouble();
        s.next();
        double c1 = s.nextDouble() * (-1);
        s.next();
        double c2 = s.nextDouble() * (-1);
        s.close();
        double roots[] = new double[2];

        //Find and store the roots
        roots = findRoot(c1, c2);
        double r1 = roots[0];
        double r2 = roots[1];
        //Display roots
        System.out.println("\nr1 = " + r1 + "\nr2 = " + r2);

        //Find and display p
        double p = (s2 - s1*r2)/(r1 - r2);
        System.out.println("p = " + p);

        //Find and display q
        double q = s1 - p;
        System.out.println("q = " + q);

        //Display the eqation
        System.out.println("S(n) = (" + p +")(" + r1 + ")^(n - 1) + (" + q + ")(" + r2 + ")^(n - 1)");

        //Displaying S(1) and S(2)
        System.out.printf("S(1) = %.1f \nS(2) = %.1f\n", s1, s2);
        //Calculate and display S(n)
        for(int i = 3; i <= 10; i++){
            double total = p * Math.pow(r1, i - 1) + q * Math.pow(r2, i - 1);
            System.out.println("S(" + i + ") = " + total); 
        }
    

    }



    /***************************************************************
     Finding the roots of the equation using the quadratic formula 
    ****************************************************************/

    public static double[] findRoot(double b, double c){
        double roots[] = new double[2];
        double root1, root2;
        double a = 1;
        
        
        double determinant = b * b - 4 * a * c;

        // two real and distinct roots
        root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        root2 = (-b - Math.sqrt(determinant)) / (2 * a);



      roots[0] = root1;
      roots[1] = root2;
      return roots;
            
    }

}