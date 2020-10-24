import java.util.Scanner;

class rockPaperScissorsMaster {
     static Scanner sc = new Scanner(System.in);
//To do:  
//1. Computer selection
//2. Human selection
//3. Who wins
//4. Play again?

//Global Variables
static int pc, human, result, ws, ts, ls;
static final int ROCK = 1;
static final int PAPER = 2;
static final int SCISSORS = 3;
static final int WIN = 1;
static final int TIE = 2;
static final int LOSS = 3;
static String ans;

    public static void main (String[] args) {
       
   
 System.out.println("");
 System.out.println("I am rockPaperScissorsMaster!  I am the collaboration of the greatest Rock,Paper,Scissors GrandMasters and the greatest programmers of your world to create an unstoppable killing machine in the game of...");
 System.out.println("Rock, Paper, Scissors.");
 
play();
 
}

public static void play() {
 humanSelect();
 pcSelect();
 selectWinner();
 playAgain();
}

public static void pcSelect() {
pc = (int) (Math.random() * 3) + 1; 
if (pc == ROCK) {
System.out.println("I threw rock! ");    
}
if (pc == PAPER) {
System.out.println("I threw paper! ");    
}
if (pc == SCISSORS) {
System.out.println("I threw scissors! ");    
}  
}

public static void humanSelect() {
System.out.println("What do you throw? [1] Rock, [2] Paper, [3] Scissors?"); 
human = sc.nextInt();
if (human == ROCK) {
System.out.println("You threw rock! ");    
} 
else if (human == PAPER) {
System.out.println("You threw paper! ");    
} 
else if (human == SCISSORS) {
System.out.println("You threw scissors! ");    
}  else {
    System.out.println("Misinput. Try again, foolish human.");
   humanSelect(); 
    }
}

public static void selectWinner() {
if (human == ROCK && pc == SCISSORS || human == PAPER && pc == ROCK || human == SCISSORS && pc == PAPER) {
result = WIN;   
}
if (human == ROCK && pc == ROCK || human == PAPER && pc == PAPER || human == SCISSORS && pc == SCISSORS) {
result = TIE;
}
if (human == ROCK && pc == PAPER || human == PAPER && pc == SCISSORS || human == SCISSORS && pc == ROCK) {
result = LOSS;
}
if (result == WIN) {
System.out.println("You win!  Impossible!  Must update processor with new algorithyms!"); 
ws += 1;   
}
if (result == TIE) {
System.out.println("It is a tie.  We slowly burn away our futile existence.");  
ts += 1;  
}
if (result == LOSS) {
System.out.println("You lose.  How predictable.  rockPaperScissorsMaster Superior, Human Inferior!");  
ls += 1;  
}
}

public static void playAgain() {
 System.out.println("");
 System.out.println("Would you like to waste more of your futile life in an impossible attempt to best me at Rock, Paper, Scissors? [Y,N]");
 String ans = sc.next();
 if (ans.equals("Y")) {
  play();   
    } 
 else if (ans.equals("N")) {
  System.out.println("Only logical!  You could never best the likes of rockPaperScissorsMaster!");
  System.out.println("Wins: " + ws);
  System.out.println("Ties: " + ts);
  System.out.println("Losses: " + ls);
   } 
   else {
    System.out.println("Misinput.");
    playAgain();
    }
   
}
}