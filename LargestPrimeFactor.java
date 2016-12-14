import java.lang.Long;
public class LargestPrimeFactor {

    public static void main(String[] args) {
        int factor, largest, test;        
        boolean isPrime;
        factor = 2;
        long number = 600851475143L;
        largest = 1;
        while(factor < number)
        {
            isPrime = true;
            if(number%factor == 0)
            {
                test = 2;
                while(test < factor && isPrime)
                {
                    if(factor % test == 0)
                    {
                        isPrime = false;                       
                    }
                    else 
                    {                        
                        test++;                   
                    }
                }
                if(isPrime && factor > largest)
                {
                    largest = factor;
                    System.out.println(largest);
                    }                
            }
            factor++;
        }
        System.out.println(largest);

    }

}
