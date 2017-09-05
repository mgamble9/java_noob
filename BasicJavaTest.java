import java.util.ArrayList;

public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava iD = new BasicJava();
        iD.printInt1to255();
        iD.printAllOddInt1to255();
        iD.printSum();

        ArrayList<Integer> y = new ArrayList<Integer>();
        // int[] y;
        y = iD.arrayWithOdds();
        System.out.println(y);

        int[] myArray = {4, 8, 8, 5, 9};
        iD.arrayIterate(myArray);

        int[] myArray2 = {-3, -2, -4, -1, -4};
        System.out.println("Max value in array is: " + iD.maxValueArray(myArray2));

        iD.printAvgOfArray(myArray2);

        int z = 5;
        System.out.println("Number of array values greater than " + z +
         " is " + iD.printGreaterThanY(myArray2,z));

        iD.squareValues(myArray);

        iD.eliminateNegatives(myArray);

        iD.maxMinAvg(myArray2);

        iD.arrayShift(myArray);

    }
}
