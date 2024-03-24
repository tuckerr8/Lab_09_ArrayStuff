import java.util.Random;
import java.util.Scanner;

public class ArrayMethodsEC {
    public static void main(String[] args) {
        //Initialize values, int, randomizer, and scanner
        int[] dataPoints;
        dataPoints = new int[100];
        Random Randomizer = new Random();
        Scanner in = new Scanner(System.in);

        //Main for loop for the randomizer
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = Randomizer.nextInt(0, 100) + 1;
        }

        //Print the min, max, occurrence, and sum
        System.out.println("\nThe min of the data points is " + min(dataPoints));
        System.out.println("\nThe max of the data points is " + max(dataPoints));
        System.out.println("\nThe occurrence of the number 17 in the data points is "
                + occurrenceScan(dataPoints, 19));
        System.out.println("\nThe sum of the data points is " + sum(dataPoints));
        System.out.println("\nData points has the number 17 in it " +
                contains(dataPoints,19));

    }

    //Loop for finding the min
    public static int min(int values[]){
        int min = values[0];

        for(int i = 0; i < values.length; i++){
            if(values[i] < min){
                min = values[i];
            }
        }
        return min;
    }

    //Loop for finding the max
    public static int max(int values[]){
        int max = values[0];

        for(int i = 0; i < values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
        }
        return max;
    }

    //Loop for the occurrence
    public static int occurrenceScan(int values[], int target){
        int counter = 0;

        for(int i = 0; i < values.length; i++){
            if(values[i] == target){
                counter += 1;
            }
        }
        return counter;
    }

    //Loop for the sum
    public static int sum(int values[]){
        int sum = 0;

        for(int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }
        return sum;
    }

    //Loop for finding the containing values
    public static boolean contains(int values[], int target){
        boolean contains = false;

        for(int i = 0; i < values.length; i++){
            if(values[i] == target){
                contains = true;
                break;
            }
        }
        return contains;
    }
}
