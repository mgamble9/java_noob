import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {

    //Print 1-255
    public void printInt1to255() {
        int[] myArray = new int[255];
        for (int i = 1; i<myArray.length+1; i++) {
          System.out.println(i);
        }
    }

    //Print odd numbers between 1-255
    public void printAllOddInt1to255() {
        int[] myArray = new int[255];
        for (int i = 1; i<myArray.length+1; i += 2) {
          System.out.println(i);
        }
    }

    // Print Sum
    public void printSum() {
      int sum = 0;
      for (int i = 0; i<=255; i++) {
        sum += i;
        System.out.println("New number: " + i + " Sum: " + sum);
      }
    }

    // Array with Odd Numbers
    public ArrayList<Integer> arrayWithOdds() {
      ArrayList<Integer> myArray = new ArrayList<Integer>();
      for (int i = 1; i <= 255; i += 2) {
        myArray.add(i);
      }
      return myArray;
    }

    //Iterating through an array
    public void arrayIterate(int[] myArray) {
      for (int value : myArray) {
        System.out.println(value);
      }
    }

    // Find Max
    public int maxValueArray(int[] myArray) {
      int maxValue = myArray[0];
      for (int value : myArray) {
        if (value > maxValue) {
          maxValue = value;
        }
      }
      return maxValue;
    }

    //Get Average
    public void printAvgOfArray(int[] myArray) {
      double avgValue;
      double sum = 0;
      for (int value : myArray) {
        sum += value;
      }
      avgValue = sum/myArray.length;
      System.out.println("Average value of array is: " + avgValue);
    }

    //Greater then Y
    public Integer printGreaterThanY(int[] myArray, int y) {
      int count = 0;
      for (int value : myArray) {
        if (value > y) {
          count ++;
        }
      }
      return count;
      // System.out.println("Number of array values greater than " + y + " is " + count);
    }

    //Square the values
    public void squareValues(int[] givenArray){
      int length = givenArray.length;
      for (int i = 0; i < length; i++){
          givenArray[i] *= givenArray[i];
          // System.out.println(givenArray[i]);
      }
      System.out.println(Arrays.toString(givenArray));
    }

    //Eliminate Negative Numbers
    public void eliminateNegatives(int[] array) {
      ArrayList<Integer> myArray = new ArrayList<Integer>();
      int length = array.length;
      for(int i = 0; i < length; i++) {
          if(array[i] < 0) {
              myArray.add(0);
          } else {
              myArray.add(array[i]);
          }
      }
      System.out.println(myArray);
    }

    //Max, Min, and Average
    public void maxMinAvg(int[] givenArray) {
      int length = givenArray.length;
      int min = givenArray[0];
      int max = givenArray[0];
      double sum = 0;

      for(int i = 0; i < length; i++){
          if(givenArray[i] > max){
              max = givenArray[i];
          }
          if (givenArray[i] < min){
              min = givenArray[i];
          }
          sum += givenArray[i];
      }

      double avg = sum / length;
      System.out.println("Max is: " + max);
      System.out.println("Min is: " + min);
      System.out.println("Average is: " + avg);
      }

    //Shifting the Values in the Array
    public void arrayShift(int[] givenArray){
      int length = givenArray.length - 1;

      for(int i = 0; i < length; i++){
          givenArray[i] = givenArray[i + 1];
      }

      givenArray[length] = 0;

      System.out.println(Arrays.toString(givenArray));
  }

}
