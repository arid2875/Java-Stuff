//Done
public class MultiplesOf3And5
{   
    public static void main(String[] args) 
    {        
        int sum = 0;
        for(int num=0; num<1000; num++)
        {
            if (num%3==0 || num%5==0)
            {
               sum+=num;
            }
        }
        System.out.println(sum);
    }

}
