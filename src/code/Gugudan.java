package code;

import java.util.Scanner;

public class Gugudan {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("2 numbers for a * b times table : ");
		String inputValue = scanner.nextLine();
		
		String[]  splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for(int i = 2; i <= first; i++)
		{
			for(int j = 1; j <= second; j++)
			{
				System.out.println(i + " * " + j + " = " + i * j);
			}
			
		}
		
		
	}

}
