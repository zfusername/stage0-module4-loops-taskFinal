package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int result = 1;

        // Find the power of the number
        for (int i = 1; i <= power; i++) {
            result *= numberToPrint;
        }

        // Print the result
        System.out.println(result);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
