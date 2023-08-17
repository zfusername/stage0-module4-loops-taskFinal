package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){


        // Print the multiplication table of the entered number
        for (int i = 1; i <= 10; i++) {
            System.out.println((numberTableToPrint * i));
        }
    }
}
