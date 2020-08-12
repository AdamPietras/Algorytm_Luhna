public class App {

    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();

        System.out.println("Test");

        System.out.println("Result for incorrect number: ");
        String testInt1 = "92480";
        System.out.println(algorithm.luhnAlgorithm(testInt1));

        System.out.println("\n");

        System.out.println("Result for correct number: ");
        String testInt2 = "2874387091";
        System.out.println(algorithm.luhnAlgorithm(testInt2));


        System.out.println("Result for correct number: ");
        String testInt3 = "553100651774657";
        System.out.println(algorithm.luhnAlgorithm(testInt2));


    }
}
