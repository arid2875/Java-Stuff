
public class Euler14 {

	public static void main(String[] args) {
		int mostSteps = 0;		
		int number = 0;
		for(int i = 2; i < 1000000; i++){
			int steps = count(i);
			if(steps > mostSteps){
				mostSteps = steps;				
				number = i;
			}			
		}
		System.out.println("The Number: " + number + " produced " + mostSteps + " steps.");
				
	}	

	public static int getNext(int number){

		return (number%2==0) ? number/2 : 3 * number + 1;		
	}

	public static int count(long number){
		int steps = 0;
		long next = number;
		boolean a = true;
		while(a){
			steps++;
			if(next <= 1)
				a = false;
			else if(next % 2 == 0)
				next = next/2;
			else 
				next = 3 * next + 1;				
		}
		
		return steps;
	}




}
