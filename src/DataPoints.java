import java.util.Random;

public class DataPoints {
    public static void main(String[] args) {
        //Initialize values, int, and Randomizer
        int[] dataPoints;
        int sum = 0;
        dataPoints = new int[100];
        Random Randomizer = new Random();

        /*Loop that randomizes several numbers and prints them.
        When finished, the sum of all the randomized numbers are added and displayed.
         */
        for(int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = Randomizer.nextInt(0,100)+1;
            System.out.print(dataPoints[i] + " | ");
        }
        for (int i = 0; i < dataPoints.length; i++){
            sum = sum + dataPoints[i];
        }
        System.out.println("\nThe sum of all the numbers is "+ sum);
    }
}