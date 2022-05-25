package basics;
import java.util.Scanner;

public class FibonacciApp {

	public static void main(String[] args) {
		/*
		 Sirul Fibonacci
		 f(0)=0;
		 f(1)=1;
		 f(2)=f(2-1)+f(2-2)=f(1)+f(0)=0+1=1;
		 f(3)=f(3-1)+f(3-2)=f(2)+f(1)=1+1=2;
		 ........
		 f(n)=f(n-1)+f(n-2)
		 */
		System.out.println("Introduceti un numar de la tastatura: ");
		Scanner cit=new Scanner(System.in);
		int n=cit.nextInt();
		System.out.println("Numarul introdus: "+n);
		System.out.println("Sirul Fibonacci este: ");
		for(int i=0;i<n;i++)
			System.out.print(Fib(i)+" ");
		
	}
	public static int Fib(int i) {
		if(i==0)
			return 0;
		else if(i==1)
			return 1;
		else 
			return (Fib(i-1)+Fib(i-2));
	}
}
