
public class TenThousndFirstPrime {


    public static void main(String[] args) {
        int number = 2;
        int[] array = new int[10001];
        int x = 0;        
        boolean isPrime = true;       

        while(x<=10000)
        {
            isPrime = true;
            for(int i = 2; i < number; i++)
            {
                if(number%i==0 && i!=number)
                {                    
                    isPrime = false;
                }               
            }
            if(isPrime)
            {
                array[x] = number;  
                number++;
                x++;
            }
            else 
            {
                number++;
            }
        }
        System.out.println(array[10000]);
    }
}
