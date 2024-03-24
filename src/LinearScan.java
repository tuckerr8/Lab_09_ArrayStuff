import java.util.Random;
import java.util.Scanner;

public class LinearScan {
    public static void main(String[] args) {
        //Initialize values, int, randomizer, and scanner

        int[] dataPoints;
        dataPoints = new int[100];
        int low = 0;
        int high = 0;
        boolean found = false;
        Random Randomizer = new Random();
        Scanner in = new Scanner(System.in);

        //Prompt user to enter a number with getRangedInt
        int userGuess = SafeInput.getRangedInt(in, "Enter a number", 1,100);

        /*This loop goes through the array and prints out each number that is randomly selected.
        * It also tells the user if it found the number that they entered or that it was not found
        * in the random function */
        for(int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = Randomizer.nextInt(0,100)+1;
            System.out.print(dataPoints[i] + " | ");
        }
        //Found loop
        for(int i = 0; i < dataPoints.length; i++) {
            if (userGuess == dataPoints[i]) {
                System.out.println("\nYour guess of " + userGuess +" was found at location " + i );
                found = true;
                break;
            }
        }

        //Not found loop
        if(!found){
            System.out.println("\nYour Guess of " + userGuess + " was not found.");
        }
        for(int i = 0; i < dataPoints.length; i++){
            if(dataPoints[i] < low){
                low = dataPoints[i];
            }
            if(dataPoints[i] > high){
                high = dataPoints[i];
            }
        }
        //Display the low, the high and the average
        System.out.println("\nThe low in the list was " + low + " the high was " + high);
        System.out.println("\nThe average of the list is " + getAverage(dataPoints));
    }

   //Calculate the average loop
    public static double getAverage(int values[])
    {
        double avg = 0.0;
        double sum = 0.0;

        for(int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }
        avg = sum / values.length;
        return avg;

    }
}
