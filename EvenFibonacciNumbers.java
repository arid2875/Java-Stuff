
public class EvenFibonacciNumbers 
{   
    public static void main(String[] args) 
    {
        int number1 = 1;
        int number2 = 2;
        int sum = 0;
        int total = 0;

        while(number1 <= 4000000 && number2 <= 4000000)
        {            
            if(number1%2==0 && number1<=4000000)
            {
                total+=number1;
            }
            if(number2%2==0 && number1<=4000000)
            {
                total+=number2;
            }      
            sum = number1 + number2;            
            if(number1<number2)
            {
                number1 = sum;
                sum += number2;
                number2 = sum;
            }             
            else 
            {
                number2 = sum;
                sum += number1;
                number1 = sum;
            }            
        }
        System.out.println(total);
    }
}
