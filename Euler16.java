import java.math.BigInteger;


public class Euler16 {

	public static void main(String[] args) {
		BigInteger bigInt = new BigInteger("2");		
		BigInteger result = bigInt.pow(1000);
		int total = 0;
		
		for(int i = 0; i < result.toString().length(); i++){
			total += Character.getNumericValue(result.toString().charAt(i));
		}
		System.out.println(total);
	}

}
