import java.util.Arrays;
import java.util.Scanner;

public class SecondOrder{
    public static void main(String[] args){

        //Scanner to read data
        var s = new Scanner(System.in);
        //since we know we're only reading in four numbers
        int nums[] = new int[4];

        for(int i = 0; i < 4; i++){
            String input = s.nextLine();
            nums[i] = Integer.parseInt(input.substring(input.length() -1));
        }

        System.out.println(Arrays.toString(nums));
/* 
        for(int i = 0; i < 4; i++){
            nums[i] = s.nextInt();
        }
        s.close();

        int s1 = nums[0];
        int s2 = nums[1];
        int c1 = nums[2];
        int c2  = nums[3];

        System.out.println("Scanned numbers" + nums);*/

    }
}