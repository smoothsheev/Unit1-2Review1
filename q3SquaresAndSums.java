import java.util.Scanner;

class q3SquaresAndSums {
//global variables

static int sum, squares, answer;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
   
 System.out.println("Find the difference between the sum of the squares and the squares of the sum of all numbers less and inckuding your selected number!");
 System.out.println("");
 System.out.println("What is your selected number?");
 int max = sc.nextInt();
 
findSum(max);  //find sum of squares natural #s
findSquare(max);  //find squares of sum natural #s


answer = (squares - sum);
 System.out.println("The difference between the squares of the sum and the sum of the sqaures of all numbers up to "  + max + " is " + answer + ".");




}

    public static void findSum(int max) {
    int total = 0;
for (int i = 1; i <= max; i++) {  
total += i * i;
}
System.out.println("The sum of the squares of all natural #s up to " + max + " is " + total);
sum = total;
}

    public static void findSquare(int max) {
     int total = 0;
     for (int i = 1; i <= max; i++) {
     total += i;
    }
    total = total * total;
     System.out.println("The square of the sums of all natural #s up to " + max + " is " + total);
    squares = total; 
    }
   

}