import java.util.Arrays;
import java.util.Scanner;

public class SecondOrder{
    
    public static void main(String[] args){

        //Scanner to read data
        var s = new Scanner(System.in);
        //since we know we're only reading in four numbers
        //double nums[] = new double[4];

        s.next();
        double s1 = s.nextDouble();
        s.next();
        double s2 = s.nextDouble();
        s.next();
        double c1 = s.nextDouble() * (-1);
        s.next();
        double c2 = s.nextDouble() * (-1);
        s.close();

        /* for(int i = 0; i < 4; i++){
            String input = s.nextLine();
            nums[i] = Double.parseDouble(input.substring(input.length() -1));
        }
        s.close(); */

        //double s1 = nums[0];
        //double s2 = nums[1];
        //Our formula is t^2 - c1t - c2 = 0 so we multiply by -1
        //double c1 = nums[2]*(-1);
        //double c2  = nums[3]*(-1);
        double roots[] = new double[2];

        //Find the roots
        roots = findRoot(c1, c2);
        double r1 = roots[0];
        double r2 = roots[1];
        System.out.println("\nr1 = " + r1 + "\nr2 = " + r2);

        //Finding p
        double p = (s2 - s1*r2)/(r1 - r2);
        System.out.println("p = " + p);

        //Finding q
        double q = s1 - p;
        System.out.println("q = " + q);

        //Display the eqation
        System.out.println("S(n) = (" + p +")(" + r1 + ")^(n - 1) + (" + q + ")(" + r2 + ")^(n - 1)");

        System.out.printf("S(1) = %.1f \nS(2) = %.1f\n", s1, s2);
        //Calculating S(n)
        for(int i = 3; i <= 10; i++){
            double total = p * Math.pow(r1, i - 1) + q * Math.pow(r2, i -1);
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

        // check if determinant is greater than 0
        if (determinant > 0) {

        // two real and distinct roots
        root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        root2 = (-b - Math.sqrt(determinant)) / (2 * a);
      }

      // check if determinant is equal to 0
      else if (determinant == 0) {

        // two real and equal roots
        // determinant is equal to 0
        // so -b + 0 == -b
        root1 = root2 = -b / (2 * a);
      }

      // if determinant is less than zero
      else {
        // roots are complex number and distinct
      double real = -b / (2 * a);
      double imaginary = Math.sqrt(-determinant) / (2 * a);
      return roots;
      }


      roots[0] = root1;
      roots[1] = root2;
      return roots;
            
    }

}