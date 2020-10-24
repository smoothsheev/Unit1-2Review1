import java.util.Scanner;

class q1Modulus {
//global variables

    public static void main (String[] args) {
int total = 0;
int max = 1000;  //limit for largest term
    for (int i = 0; i < max; i++){
    if (i % 5 == 0 || i % 3 == 0){
    total += i;
    System.out.println(total);
    }
}
System.out.print("Answer: " + total);
}
}
