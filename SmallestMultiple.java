
public class SmallestMultiple {


    public static void main(String[] args) {
        boolean isDivisible = true;        
        int number = 1;
        int x = 1; 
        while(true)       
        {
            x = 1;
            isDivisible = true;
            while(number >= x && x <= 20 && isDivisible)
            {        
                if(number % x == 0)
                {
                    if(x == 20)
                    {
                        System.out.println(number);
                        System.exit(1);
                    }
                    else x++;
                }
                else isDivisible = false;
            }
            number++;
        }
    }

}


