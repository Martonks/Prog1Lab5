import java.util.*;
/** Java program to demonstrate how to find the Greatest 
 *  Common Divisor or GCD between two numbers
 * 
 *  @author Martin Calero
 */
public class GCD{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        while(number1 != number2){
            if(number1>number2){
                number1=number1-number2;
            } else {
                number2=number2-number1;
            }
        }

        System.out.println("GCD of given numbers is:" + number2);
    }
}