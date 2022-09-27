import java.util.Arrays;
import java.util.Scanner;

public class SecondOrder{
    
    public static void main(String[] args){

        //Scanner to read data
        var s = new Scanner(System.in);
        //since we know we're only reading in four numbers
        double nums[] = new double[4];

        for(int i = 0; i < 4; i++){
            String input = s.nextLine();
            nums[i] = Double.parseDouble(input.substring(input.length() -1));
        }
        s.close();

        System.out.println(Arrays.toString(nums));

        double s1 = nums[0];
        double s2 = nums[1];
        //Our formula is t^2 - c1t - c2 = 0 so we multiply by -1
        double c1 = nums[2]*(-1);
        double c2  = nums[3]*(-1);
        double roots[] = new double[2];
        double r1;
        double r2;

        //Find the roots
        roots = findRoot(c1, c2);
        r1 = roots[0];
        r2 = roots[1];
        System.out.println("Roots: " + r1 + " " + r2);
    

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