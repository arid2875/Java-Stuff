import java.math.*;
public class SpecialPythagoreanTriplet {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;        
        double c = 1;
        boolean isPythagTriplet;

        while(a+b+c<=1000)
        {   
            isPythagTriplet = false;
            c = Math.pow((Math.pow(a, 2) + Math.pow(b, 2)), .5);
            if(c%1 == 0)
            {  
              isPythagTriplet = true;
            }
            if(a+b+c == 1000 && isPythagTriplet == true)
            {            
                System.out.println(a*b*c);
                System.exit(-1);
            }
            
            else
            {
                while(a+b+c<=1000)
                {   
                    isPythagTriplet = false;
                    c = Math.pow((Math.pow(a, 2) + Math.pow(b, 2)), .5);
                    {  
                        isPythagTriplet = true;
                      }
                      if(a+b+c == 1000 && isPythagTriplet == true)
                      {            
                          System.out.println(a + "\n" + b + "\n" + c + "\n" + a*b*c);
                          System.exit(-1);
                      }
                    else b++;                        
                } 
                a++;
                b = 1;
            }

        }
    }
}
