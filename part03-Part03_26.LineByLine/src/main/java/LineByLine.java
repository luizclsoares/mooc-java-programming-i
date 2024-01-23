
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[] strings = input.split(" ");
            
            for(String string : strings){
                System.out.println(string);
            }
        }

    }
}
