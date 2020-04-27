import java.io.*;
import java.util.*;
/** Java program to read a file containing names and grades
 *  and outputting the name of the person with the highest grade
 *  along with his/her grade, as well as the average of the total grades
 *  and the amount of grades processed.
 * 
 *  @author Martin Calero
 */
public class Grade {
    public static void main(String[] args) throws FileNotFoundException {

        // Create file path
        File inFile = new File("Input.txt");
        Scanner scFile = new Scanner(inFile);

        // Insert variables
        int grade;
        String highestname = "name";
        String lowestname = "name";
        double average = 0;
        String line;
        int max = 0;
        int min = 100;
        int sum = 0;
        int counter = 0;
        
        // Insert while loop
        while(scFile.hasNext()){
            line = scFile.nextLine();
            grade = Integer.parseInt(line.substring(line.indexOf(" ")+ 1));
            sum+=grade;
            counter++;
            average = sum/counter;

            // If conditions for the highest/lowest grades
            if(grade > max){
                max = grade;
                highestname = line.substring(0,line.indexOf(" "));
            }
            if(grade < min){
                min = grade;
                lowestname = line.substring(0,line.indexOf(" "));
            }

        }
        
        System.out.println("The maximum grade is "+max+"% and it belongs to "+highestname);
        System.out.println("The minimum grade is "+min+"% and it belongs to "+lowestname);
        System.out.println("The average is "+average+"%");
        System.out.println(counter+" grades were processed");

    }
}
