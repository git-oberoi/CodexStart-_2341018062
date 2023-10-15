/*
 * Name: Shivam Raj
 * Reg No: 2341018062
 * PS LINK: https://cses.fi/problemset/task/1069/
 */
import java.util.Scanner;

public class Q1_1069{ 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    String DNAseq = sc.nextLine();
    sc.close();

    char[] sequenceArray = DNAseq.toCharArray();
    char maxChar = '\0';
    int currentCount = 0;
    int maxCount = 0;
    
    if( sequenceArray.length > 0) {
        maxChar = sequenceArray[0];
        currentCount = 1;
        maxCount= 1;

    for (int i = 1; i < sequenceArray.length; i++){
        if(sequenceArray[i] == sequenceArray[i - 1]) {
            currentCount++;
        } else {
        if (currentCount> maxCount) {
            maxChar = sequenceArray[i - 1];
            maxCount = currentCount;
        }
        currentCount = 1;
         }    
        }
      if (currentCount> maxCount){
        maxChar = sequenceArray[sequenceArray.length - 1];
        maxCount = currentCount;
      }   
    }
        System.out.println(maxCount);
    }
}
