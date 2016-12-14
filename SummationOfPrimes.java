import java.util.ArrayList;
import java.math.*;

public class SummationOfPrimes 
{    
    private static boolean isPrime(int num) 
    {
        if(num==2)
        { //for case num=2, function returns true. detailed explanation underneath
            return(true);
        }
        for(int i=2;i<=(int)Math.sqrt(num)+1;i++)
        { 
          if(num%i==0)
          { 
            return(false);
          }
        }
        return(true); //if all cases don't divide num, it is prime.
      }      
    
    public static void main(String[] args) 
    {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        long total = 0;
        for(int j = 2; j<2000000; j++)
        {
            if(isPrime(j))
            {
                primes.add(j);
            }
        }
        for(int n = 0; n < primes.size(); n++)
        {
            total += primes.get(n);            
        }
        System.out.println(total);
    }
}
