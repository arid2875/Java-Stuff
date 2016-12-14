
public class Triangular500
{
    public static int triangular(int rows)
        {
            int total  = 0;
            while(rows > 0)
                {
                    total += rows;
                    rows--;
                }
            return total;
        }

    public static int divisors(int number)
        {
            int divisor = 1;
            int count = 0;
            while(divisor <= number)
                {
                    if(number % divisor == 0)
                        count++;
                    divisor++;
                }
            return count;
        }
    public static void main(String[] args)
        {
            int num = 1;
            int mostDivisors = 0;
            do
                {
                    int divisors = divisors(triangular(num));
                    System.out.println("Triangular Total:\t" + triangular(num));
                    if(divisors > mostDivisors)
                        {
                            mostDivisors = divisors;
                            System.out.println("Number of Divisors:\t\t\t" + mostDivisors);
                        }
                    num++;
                }
            while(mostDivisors <=500);
        }

}
