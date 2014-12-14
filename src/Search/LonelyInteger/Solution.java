/*
Problem Statement

There are N integers in an array A. All but one integer occur in pairs. Your task is to find out the number that occurs only once.

Input Format

The first line of the input contains an integer N indicating number of integers.
The next line contains N space separated integers that form the array A.

Constraints

1 <= N < 100
N % 2 = 1 ( N is an odd number )
0 <= A[i] <= 100, ∀ i ∈ [1, N]

Output Format

Output S, the number that occurs only once.

Sample Input:1

1
1

Sample Output:1

1

Sample Input:2

3
1 1 2

Sample Output:2

2

Sample Input:3

5
0 0 1 2 1

Sample Output:3

2

Explanation

In the first input, we see only 1 element and that element is the answer (1).
In the second input, we see 3 elements, 1 is repeated twice. The element that occurs only once is 2.
In the third input, we see 5 elements, 1 and 0 are repeated twice. And the element that occurs only once is 2.
*/

package Search.LonelyInteger;


import java.util.*;


public class Solution {

public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
    try{
        int n = in .nextInt();
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            int number = in.nextInt();
            if(hash.contains(number))
                hash.remove(number);
            else
                hash.add(number);
        }
        Iterator<Integer> iter = hash.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
	}
        
        finally{
        	in.close();
        }
    }
}
