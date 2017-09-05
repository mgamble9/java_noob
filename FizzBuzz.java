public class FizzBuzz {
    public String fizzBuzzResult(int legA) {
        String c;
        if (legA % 3 == 0) {
          c = "Fizz";
          if (legA % 5 == 0) {
            c = "FizzBuzz";
          }
        }
        else if (legA % 5 == 0) {
          c = "Buzz";
        }
        else {
          c = String.valueOf(legA);
        }
        return c;
    }
}
