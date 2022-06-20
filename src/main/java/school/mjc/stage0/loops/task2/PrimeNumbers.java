package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        int temp;
        boolean isPrime;
        while (counter <= printToInclusive) {
            isPrime = true;
            temp = 2;
            while (temp < counter) {
                if (counter % temp == 0) {
                    isPrime = false;
                    break;
                }
                temp++;
            }
            if(isPrime) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
