package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 1;
        int temp = 1;
        if (power < 0) {
            System.out.println("too much power");
        } else {
            System.out.println("1");
            while (counter <= power) {
                temp *= 2;
                System.out.println(temp);
                counter++;
            }
        }
    }
}
