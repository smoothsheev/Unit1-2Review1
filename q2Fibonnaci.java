import java.util.Scanner;

class q2Fibonnaci {
//global variables

    public static void main (String[] args) {
        
int term1 = 1;
int term2 = 2;
int total = 2; //answer
int max = 4000000;  //limit for largest term


while (term1 <= max && term2 <= max) {
term1 += term2;
if (term1 % 2 == 0) {
total += term1;
}
term2 += term1; 
if (term2 % 2 == 0) {
    total += term2;
} 
}
System.out.println("Answer: " + total);
}
}
