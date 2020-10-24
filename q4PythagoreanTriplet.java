import java.util.Scanner;

class q4PythagoreanTriplet {
//global variables


static int righta, rightb, rightc;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
   
 System.out.println("");
 System.out.println("");
 System.out.println("");
 
for (int c = 1000; c > 333; c--) {
for (int a = 666; a > 0; a--) {
for (int b = 666; b > 0; b--) {
if (c * c == (a * a) + (b * b) && a + b + c == 1000) {
righta = a;
rightb = b;
rightc = c;   
} 
}  
}    
}

 System.out.println("a = " + righta);
 System.out.println("b = " + rightb);
 System.out.println("c = " + rightc);
 System.out.println("Answer: " + righta * rightb * rightc);
}
}
