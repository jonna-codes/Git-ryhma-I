// Versionhallinta Git excercise
// Group I
// An app to check which of the given numbers is bigger.

public class App {
    public static void main(String[] args) throws Exception {
        // Calls the method with numbers.
        checkBigger(9, 5);
    }

    public static void checkBigger(int number1, int number2) {
        // Takes the numbers and compares them. Then prints the answer
        // depending which number is bigger or if they are equal.

        if (number1 > number2) {
            System.out.println("Number " + number1 + " is bigger than number " + number2 + ".");
        }
        else if (number1 < number2) {
            System.out.println("Number " + number2 + " is bigger than number " + number1 + ".");
        }
        else {
            System.out.println("Number " + number1 + " and number " + number2 + " are equal.");
        }
    }
}