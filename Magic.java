
import java.util.Scanner;

class Magic {
 public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
      int a = (int) (Math.random()*20) + 1;

  
        System.out.println("Ask a question: ");
        sc.nextLine();
        if (a == 1) {
            System.out.println("As I see it, yes.");
        } else if (a == 2) {        
            System.out.println("Ask again later.");
        } else if (a == 3) {
            System.out.println("Better not tell you now.");
        } else if (a == 4) {
            System.out.println("Cannot predict now.");
        } else if (a == 5) {
            System.out.println("Concentrate and ask again.");
        } else if (a == 6) {
            System.out.println("Don’t count on it.");
        } else if (a == 7) {
            System.out.println("It is certain.");
        } else if (a == 8) {
            System.out.println("It is decidedly so.");
        } else if (a == 9) {
            System.out.println("Most likely.");
        } else if (a == 10) {
            System.out.println("My reply is no.");
        } else if (a == 11) {
            System.out.println("My sources say no.");
        } else if (a == 12) {
            System.out.println("Outlook not so good.");
        } else if (a == 13) {
            System.out.println("Outlook good.");
        } else if (a == 14) {
            System.out.println("Reply hazy, try again.");
        } else if (a == 15) {
            System.out.println("Signs point to yes.");
        } else if (a == 16) {
            System.out.println("Very doubtful.");
        } else if (a == 17) {
            System.out.println("Without a doubt.");
        } else if (a == 18) {
            System.out.println("Yes.");
        } else if (a == 19) {
            System.out.println("Yes – definitely.");
        } else if (a == 20) {
            System.out.println("You may rely on it.");
        }
    
    }
}
