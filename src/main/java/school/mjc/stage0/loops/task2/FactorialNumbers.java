package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 1;
        int factorial = 1;
        System.out.println(1);
        while (counter <= printToInclusive) {
            factorial *= counter;
            System.out.println(factorial);
            counter++;
        }
    }
}
