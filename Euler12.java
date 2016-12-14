import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;


public class Euler12 {
	static String file = "D:\\Drive\\Aaron\\Programming Projects\\Project Euler\\Euler12.txt";
	static BigInteger[] bigIntArray = new BigInteger[100];
	static Scanner in;
	static BigInteger bigInt;
	public static void main(String[] args) {
		readFile(file);
		BigInteger total = BigInteger.ZERO;
		for(int i = 0; i<100; i++){
			total = total.add(bigIntArray[i]);
		}
		System.out.println(total);
	}
	
	public static void readFile(String fileName){
		
		File file = new File(fileName);
		try{
			in = new Scanner(file);
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		for(int i = 0; i <100; i++){
			bigInt = new BigInteger(in.nextLine().trim());
			bigIntArray[i] = bigInt;
		}
	}

}
