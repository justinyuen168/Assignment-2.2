
import java.util.Scanner;

class grade {
 public static void main( String[] args){
       double p = 0;
     Scanner sc = new Scanner(System.in);
     System.out.println(" Grade Calculator ");
     System.out.println(" ");
     System.out.println(" What was your mark? ");
     double m = sc.nextDouble();
     System.out.println(" What was it out of? ");
     double f = sc.nextDouble();
     System.out.println( "you got " + m/f + "%");
      if (m > f || m == 0 || m < 0) {
            System.out.println("Silly human, that's not possible. Quit joking around.");
        } else {
            p = 100 * (m / f);
            if (p >= 86) {
                System.out.println("That's an A. Great work!");
            } else if (p >= 73) {
                System.out.println("That's a B. Good job.");                
            } else if (p >= 67) {
                System.out.println("That's a C+. Not bad.");
            } else if (p >= 60) {
                System.out.println("That's a C ... you passed, but you can do better!");
            } else if (p >= 50) {
                System.out.println("That's a C- ... study harder!");                
            } else {
                System.out.println("That's an F. You failed, but don't give up.");
            }
    }
}}