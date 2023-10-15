/*
 * Name: Shivam Raj
 * Reg No: 2341018062
 * PS LINK: https://cses.fi/problemset/task/1068
 */
import java.util.Scanner;
import java.util.ArrayList;


public class Q1068 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        if ( n<= 0) {
            System.out.println( " Enter a Positive Integer");
        } else {
            ArrayList<Integer>  sequence = new ArrayList<>();
            sequence.add(n);
          
            while (n != 1) {
                if(n %2 == 0){
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }
                sequence.add(n);
            }
            
          for (int i = 0; i < sequence.size(); i++) {
                System.out.print(sequence.get(i));
                if (i < sequence.size() - 1) {
                    System.out.print(" ");
                }
            }      
        }
    }
}
