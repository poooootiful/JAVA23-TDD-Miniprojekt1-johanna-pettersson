import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Menu();
    }

    public static void menu () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Counts and adds prime numbers together");
        System.out.println("Need two inputs between 0 and 1000");
        System.out.println("Make sure input 1 is lower then input 2");
        System.out.println("Input 1");
        int start = scanner.nextInt();
        System.out.println("Input 2");
        int end = scanner.nextInt();

        if (start<0 || end>1000 || start>=end ) {
            System.out.println("Invalid input");
            return;
        }
        int primeCount = countPrimesInRange (start,end);
        int primeSum = sumPrimesInRange(start,end);

        printCount(primeCount);
        printSum(primeSum);

    }
    public static int countPrimesInRange (int start, int end){
        int count = 0;
        for (int i = start; i<=end; i++) {
            if (Prime.isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    public static int sumPrimesInRange (int start, int end) {
        int sum = 0;
        for (int i = start; i<=end; i++){
            if (Prime.isPrime(i)) {
                sum +=i;
            }
        }
        return sum;
    }

    public static void printCount(int count) {
        System.out.println(count);
    }
    public static void  printSum (int sum) {
        System.out.println(sum);
    }
}
