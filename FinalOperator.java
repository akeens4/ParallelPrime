/**
 * FinalOperator
 */
import java.util.Scanner;
public class FinalOperator {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the first Value");
        int fst = inp.nextInt(); 
        System.out.print("Enter the second Value");
        int snd = inp.nextInt();         
        
        System.out.print("Enter the second Value");
        char oper = inp.next().charAt(0);

        if(oper == '+') {
            System.out.print("Addition: " + (fst + snd));
        }else if(oper == '/') {
            System.out.print("Division: " + (fst / snd));
        }else if(oper == '-') {
            System.out.print("Subtraction: " + (fst - snd));
        }else if(oper == '%') {
            System.out.print("Modulus: " + fst + snd);
        }else{
            System.out.print("Power: " + (fst ^ snd));
        }

    }
}