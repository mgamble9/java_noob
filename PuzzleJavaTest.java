import java.util.ArrayList;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava iD = new PuzzleJava();

        int max = 10;
        int[] myArray = {3,5,1,2,7,9,8,13,25,32};
        System.out.println(iD.greaterThan(max, myArray));

        String[] strArray = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        System.out.println(iD.strGreaterThan(5, strArray));

        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l",
          "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        iD.alphCheck(alphabet);

        System.out.println(iD.genTen());

        System.out.println(iD.genTenSort());

        System.out.println(iD.randomStringHelper());

        System.out.println(iD.gen10RandString());

    }

}
