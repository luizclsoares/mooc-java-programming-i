
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ageOfTheOldest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            
            if(age > ageOfTheOldest){
                ageOfTheOldest = age;
            }
        }
        
        System.out.println("Age of the oldest: " + ageOfTheOldest);
    }
}
