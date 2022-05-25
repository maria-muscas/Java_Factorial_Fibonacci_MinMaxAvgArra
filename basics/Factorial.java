package basics;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		/*
		 Write a function that computes the factorial value
		Definition: n! = n*(n-1)! , where 0! = 1
		1! = 1
		2! = 2 * 1! = 2 * 1
		3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
		4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
		 */
		Scanner console=new Scanner(System.in);
		System.out.println("Give a number: ");
		int x=console.nextInt();
		System.out.println("The factorial value of the "+x+" number is: "+Fact(x));
		

	}
	public static int Fact(int n) {//n=3
		if(n==0 || n==1)
			return 1;
		else 
			return (n*Fact(n-1));//3*Fact(2) - >2*Fact(1)->2*1=2
			
	}

}
