
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        String longestName = "";
        int sum = 0;
           
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            
            ages.add(age);
            names.add(name);
        }
        
        for(String name : names){
            if(name.length() > longestName.length()){
                longestName = name;
            }
        }
        
        System.out.println("Longest name: " + longestName);
    
        for(int age : ages){
            sum += age;
        }
        
        double average = (double) sum / ages.size();
        
        System.out.println("Average of the birth years: " + average);
    }
}
