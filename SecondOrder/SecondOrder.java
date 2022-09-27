import java.util.Scanner;

public class SecondOrder{
    public static void main(String[] args){

        //Scanner to read data
        var s = new Scanner(System.in);
        //since we know we're only reading in four numbers
        double nums[] = new double[4];

        for(int i = 0; i < 4; i++){
            nums[i] = s.nextDouble();
        }
        s.close();

    }
}