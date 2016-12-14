import java.util.Scanner;
import java.io.*;
public class Euler11 {
	static Scanner in;
	static String fileName = "D:\\Drive\\Aaron\\Programming Projects\\Project Euler\\Euler11.txt";
	static int[] intArray = new int[400];
	static int[][] twoDimInt = new int[20][20];
	public static void main(String[] args) {

		readFile(fileName);
		create2dArray(intArray);		
		int biggest = 0;
		int number = 0;
		for(int i = 0; i<20; i++){
			number = getHighest(getRow(i));
			if (number > biggest){
				biggest = number;
			}
			number = getHighest(getColumn(i));
			if (number > biggest){
				biggest = number;
			}			
		}
		System.out.println("Largest Row/Column: " + biggest);
		for(int i = 0; i < 20; i++){


			number = getHighest(getRightDiagonal(0,i));
			if(number>biggest){
				biggest = number;
			}	

			number = getHighest(getRightDiagonal(i,0));
			if(number>biggest){
				biggest = number;
			}

			number = getHighest(getLeftDiagonal(0,i));
			if(number>biggest){
				biggest = number;
			}
			number = getHighest(getLeftDiagonal2(i,19));
			if(number>biggest){
				biggest = number;
			}
		}



		System.out.println(biggest);
	}

	public static void readFile(String fileName){		
		File file = new File(fileName);
		try {
			in = new Scanner(file);
		} 
		catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		int next;
		for(int i=0; i<400; i++){
			next = in.nextInt();
			intArray[i] = next;
		}		
	}
	public static void create2dArray(int[] intArray){
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 20; j++){
				twoDimInt[i][j] = intArray[i*20+j];
			}
		}
	}

	public static int getHighest(int[] array){
		int total;
		int highest = 0;
		for(int i = 0; i < array.length-4; i++){
			total = 1;
			for(int j = 0; j < 4; j++){
				total *= array[i+j];
			}
			if(total > highest){
				highest = total;
			}
		}
		return highest;
	}

	public static int[] getRow(int rowNumber){
		int[] rowArray = new int[20];
		for(int i = 0; i < 20; i++){
			rowArray[i] = twoDimInt[rowNumber][i];
		}
		return rowArray;
	}

	public static int[] getColumn(int columnNumber){
		int[] columnArray = new int[20];
		for(int i = 0; i < 20; i++){
			columnArray[i] = twoDimInt[i][columnNumber];
		}
		return columnArray;
	}

	public static int[] getRightDiagonal(int startRow, int startColumn){
		int size = 21-(startRow+1)*(startColumn+1);
		if(size < 4){
			int[] emptyArray = {0,0,0,0};
			return emptyArray;
		}
		else{
			int[] diagonalArray = new int[size];

			for(int i = 0; i <size; i++){
				diagonalArray[i] = twoDimInt[startRow+i][startColumn+i]; 
			}
			return diagonalArray;
		}
	}
	public static int[] getLeftDiagonal(int startRow, int startColumn){
		int size = (startRow+1)*(startColumn+1);
		if(size < 4){
			int[] emptyArray = {0,0,0,0}; 
			return emptyArray;
		}		
		else{
			int[] diagonalArray = new int[size];

			for(int i = 0; i <size; i++){				
				diagonalArray[i] = twoDimInt[startRow+i][startColumn-i];				
			}
			return diagonalArray;
		}
	}
	public static int [] getLeftDiagonal2(int startRow, int startColumn){
		int size = 20-startRow;
		if(size < 4){ 
			int[] emptyArray = {0,0,0,0}; 
			return emptyArray;
		}
		else{


			int [] diagonalArray = new int[size];

			for(int i = 0; i < size; i++){
				diagonalArray[i] = twoDimInt[startRow+i][startColumn-i];
			}
			return diagonalArray;
		}
	}
	

}
