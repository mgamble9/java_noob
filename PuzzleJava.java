import java.util.*;
// import java.util.Arrays;
// import java.util.Random;


public class PuzzleJava {

  // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32.
  // Print the sum of all numbers in the array. Also have the function return an
  // array that only includes numbers that are greater than 10 (e.g. when you pass
  // the array above, it should return an array with the values of 13,25,32)
  public ArrayList<Integer> greaterThan(int max, int[] inputArray) {
      int sum = 0;
      ArrayList<Integer> myArray = new ArrayList<Integer>();
      for (int value : inputArray) {
        sum += value;
        if (value > max) {
          myArray.add(value);
        }
      }
      System.out.println("Array Sum:" + sum);
      return myArray;
  }

  // Create an array with the following values: Nancy, Jinichi, Fujibayashi,
  // Momochi, Ishikawa. Shuffle the array and print the name of each person.
  // Have the method also return an array with names that are longer than 5
  // characters.
  public ArrayList<String> strGreaterThan(int max, String[] inputArray) {
    shuffleArray(inputArray);
    ArrayList<String> myArray = new ArrayList<String>();
    for (String value : inputArray) {
      System.out.println(value);
      if (value.length() > max) {
        myArray.add(value);
      }
    }
    return myArray;
  }

  public void shuffleArray(String[] myArray) {
    int index;
    String temp;
    Random random = new Random();
    for (int i = myArray.length - 1 ; i > 0; i--) {
      index = random.nextInt(i + 1);
      temp = myArray[index];
      myArray[index] = myArray[i];
      myArray[i] = temp;
    }
  }

  // Create an array that contains all 26 letters of the alphabet (this array
  // must have 26 values). Shuffle the array and display the last letter of the
  // array. Have it also display the first letter of the array. If the first
  // letter in the array is a vowel, have it display a message

  public void alphCheck(String[] inputArray) {
    shuffleArray(inputArray);
    System.out.println(inputArray[0]);
    System.out.println(inputArray[inputArray.length - 1]);
    if ("AEIOUaeiou".indexOf(inputArray[0]) != -1) {
      System.out.println(inputArray[0] + " is a vowel.");
    }
  }

  //Generate and return an array with 10 random numbers between 55-100
  public ArrayList<Integer> genTen() {
    ArrayList<Integer> resultArray = new ArrayList<Integer>();
    Random randomGenerator = new Random();
    for(int i = 0; i < 10; i++) {
      resultArray.add(randomGenerator.nextInt(101 - 55) + 55);
    }
    return resultArray;
  }

  // Generate and return an array with 10 random numbers between 55-100
  // and have it be sorted (showing the smallest number in the beginning).
  // Display all the numbers in the array. Next, display the minimum value in
  // the array as well as the maximum value.
  public ArrayList<Integer> genTenSort() {
    ArrayList<Integer> myArray = genTen();
    Collections.sort(myArray);
    System.out.println(myArray);
    System.out.println(myArray.get(0));
    System.out.println(myArray.get(myArray.size() -1));
    return myArray;
  }

  //Create a random string that is 5 characters long.
  public static String randomStringHelper() {
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
      "n","o","p","q","r","s","t","u","v","w","x","y","z"};
		ArrayList<String> listAlphabet = new ArrayList<String>(Arrays.asList(alphabet));

		Random randomGenerator = new Random();
		String randomString = "";

		for(int i = 0; i < 5; i++) {
			randomString = randomString.concat(listAlphabet.get(randomGenerator.nextInt(listAlphabet.size())));
		}

		return randomString;
	}

  //Generate an array with 10 random strings that are each 5 characters long
  public ArrayList<String> gen10RandString() {
    ArrayList<String> resultArray = new ArrayList<String>();

    for(int i = 0; i < 10; i++){
      resultArray.add(PuzzleJava.randomStringHelper());
    }

    return resultArray;
  }


}
