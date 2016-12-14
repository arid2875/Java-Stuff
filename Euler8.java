import java.io.*;
import java.util.*;
public class Euler8 {
	static int [] ints = new int[1000];
	public static void main(String[] args){ 		
		File numbersFile = new File("D:\\Drive\\Aaron\\Programming Projects\\Project Euler\\Euler8.txt");
		Scanner scanner;
		try {
			scanner = new Scanner(numbersFile);
		
		
		int i = 0;
		while(scanner.hasNext()){
			String next = scanner.next();
			next.trim();
			for(int j = 0; j < next.length(); j++){			
				int number = Character.getNumericValue((next.charAt(j)));						
				ints[i] = number;
				i++;
			}
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(getHigest());			
					
				
				
			
		}
	
	public static int getHigest(){
		
		int highest = 0;
		for(int i = 0; i < 987; i++){
			
			int current = product(getTenNumbers(i));
			if(current > highest){
				highest = current;
			}
		}
		return highest;
	}
	
	public static int[] getTenNumbers(int start){
		int[] tenInts = new int[13];
		for(int i = 0; i < 13; i++){
			tenInts[i] = ints[start+i];
		}
		return tenInts;
	}
	
	
	
	
	
	public static int product(int [] tenInts){
		int total = 1;
		for(int i = 0; i <13; i++){
				total *= tenInts[i];				
			}
		return total;
		}
		
	

}
