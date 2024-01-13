
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());
        
        int absoluteValue = Math.abs(number);
        System.out.println(absoluteValue);
    }
}
