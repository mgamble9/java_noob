public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean iD = new Pythagorean();
        int inputA = 2;
        int inputB = 3;
        double outputC = iD.calculateHypotenuse(inputA, inputB);
        System.out.println("Hypotenuse = " + outputC);
    }
}
