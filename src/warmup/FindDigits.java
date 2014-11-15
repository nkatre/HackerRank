// https://www.hackerrank.com/challenges/find-digits
package warmup;


import java.util.*;


public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        for(int i=0;i<n;i++){
            int number = in.nextInt();
            int number1 = number;
            int counter=0;
            while(number!=0){
                int digit = number%10;
                if(digit==0){
                    number=number/10;
                    continue;
                }
   
                else if(number1%digit==0){

                    counter++;
                }
                number=number/10;
            }
            System.out.println(counter);
            counter=0;
            if(i!=n-1)
            in.nextLine();
            
            
        }
    }
}
/*
Sample Input:
	11
	123456789
	114108089
	110110015
	121
	33
	44
	55
	66
	77
	88
	106108048
Sample Output:
	3
	3
	6
	2
	2
	2
	2
	2
	2
	2
	5
*/