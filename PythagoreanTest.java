public class PythagoreanTest {
    public static void main(String[] args) {

        // Instatiates a Pythagorean class
        Pythagorean py = new Pythagorean();

        // Uses calculateHypotenuse method from the Pythagorean class and takes arguments
        double hypoteneuse = py.calculateHypotenuse(3, 3);

        System.out.println("The hypoteneuse length is: " + hypoteneuse);
    }
}