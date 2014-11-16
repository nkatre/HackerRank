package warmup;

import java.util.Scanner;

public class isFibo {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	for(int i=0;i<n;i++){
		double data=input.nextDouble();
		double a=0,b=1,c=0;
		while(c<data){
			c=a+b;
			a=b;
			b=c;
		}
		if(c==data){
			System.out.println("Fib");
		}
		else
			System.out.println("Not Fib");
		System.out.println(data*data*5);
	}
	
}
}
