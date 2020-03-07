import java.util.Scanner;

public class CounterOfNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 0;
        for (; number!=0 ; number /= 10 ){
            counter++;
        }
        System.out.println(counter);
    }
}
