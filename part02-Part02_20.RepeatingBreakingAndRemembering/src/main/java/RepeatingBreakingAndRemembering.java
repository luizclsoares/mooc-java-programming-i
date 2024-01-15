
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;
        
        System.out.println("Give numbers:");
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == -1){
                break;
            }
            
            if(number % 2 == 0){
                even++;
            }else{
                odd++;
            }
            
            sum += number;
            numbers++;
        }
        
        double average = (double) sum / numbers;
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
