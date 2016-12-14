
public class LargestPalProduct {


    public static void main(String[] args) {
        int number1, number2, product, largest; 
        number1 = 100;
        number2 = 100;        
        String larg = "0";
        String prod = "0";

        while(number2 < 1000)
        {
            number1 =  100;
            while(number1 < 1000)
            {
            product = number1 * number2;
            prod = Integer.toString(product);
            switch(prod.length())
            {
                case 1:
                    larg = prod;
                    break;
                case 2:
                    if(prod.charAt(0)==prod.charAt(1) && Integer.valueOf(prod) > Integer.valueOf(larg))
                        larg = prod;
                    break;
                case 3:
                    if(prod.charAt(0) == prod.charAt(2) && Integer.valueOf(prod) > Integer.valueOf(larg))
                        larg = prod;
                    break;
                case 4:
                    if(prod.charAt(0) == prod.charAt(3) && prod.charAt(1) == prod.charAt(2) && Integer.valueOf(prod) > Integer.valueOf(larg))
                        larg = prod;
                    break;
                case 5:
                    if(prod.charAt(0) == prod.charAt(4) && prod.charAt(1) == prod.charAt(3) && Integer.valueOf(prod) > Integer.valueOf(larg))
                        larg = prod;
                    break;
                case 6:
                    if(prod.charAt(2) == prod.charAt(3) && prod.charAt(1) == prod.charAt(4) && prod.charAt(0) == prod.charAt(5) && Integer.valueOf(prod) > Integer.valueOf(larg))
                        larg = prod;
                    break;
            }            
            number1++;
            }
            number2++;
        }   
        System.out.println(larg);

    }

}
