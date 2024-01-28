
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String name = scan.nextLine();
        
        Team team = new Team(name);
        
        
        try(Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String[] parts = scanner.nextLine().split(",");
                
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                
                team.playGame(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints);
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        team.matchStatistics();
    }

}
