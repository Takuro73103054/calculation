package calculation;

import java.util.Scanner;

import test002.Calculation_lib;

public class Calculation_main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			System.out.print("Input Number m > ");
			int m = Integer.parseInt(scan.next());
			
			System.out.print("Input Number n > ");
			int n = Integer.parseInt(scan.next());
		// TODO Auto-generated method stub
			Calculation_lib clib = new Calculation_lib(m,n);
			System.out.println("m + n ="+clib.getPlus());
			
			Calculation_lib clib1 = new Calculation_lib(m,n);
			System.out.println("m - n ="+clib1.getMinus());
			
			Calculation_lib clib2 = new Calculation_lib(m,n);
			System.out.println("m * n ="+clib2.getTime());
	
			Calculation_lib clib3 = new Calculation_lib(m,n);
			System.out.println("m / n ="+clib3.getDivide());
			
			Calculation_lib clib4 = new Calculation_lib(m,n);
			System.out.println("m % n ="+clib4.getMod());
	}

}
