import java.math.*;
public class SumSquareDifference {

    public static void main(String[] args) {
               
        int sumSquares = 0;
        int squareSums = 0; 
        int sum = 0;
        int answer;

        for(int x = 1; x <= 100; x++)
        {            
            sumSquares += Math.pow(x,2);
            sum += x;
        }
        squareSums = (int) Math.pow(sum,2);
        answer = squareSums - sumSquares;
        System.out.println(answer);
    }

}
