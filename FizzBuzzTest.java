public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz iD = new FizzBuzz();
        int inputA = 3;
        String outputC = iD.fizzBuzzResult(inputA);
        System.out.println("FizzBuzz of " + inputA + " is " + outputC);
        inputA = 5;
        outputC = iD.fizzBuzzResult(inputA);
        System.out.println("FizzBuzz of " + inputA + " is " + outputC);
        inputA = 4;
        outputC = iD.fizzBuzzResult(inputA);
        System.out.println("FizzBuzz of " + inputA + " is " + outputC);
        inputA = 15;
        outputC = iD.fizzBuzzResult(inputA);
        System.out.println("FizzBuzz of " + inputA + " is " + outputC);
    }
}
