
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luiz
 */
public class UserInterface {
    private Scanner scanner;
    private BirdManager manager;

    public UserInterface(Scanner scanner, BirdManager manager) {
        this.scanner = scanner;
        this.manager = manager;
    }
    
    public void start(){
        while(true){
            System.out.println("?");
            String command = scanner.nextLine();
            
            if(command.equals("Quit")){
                break;
            }else if(command.equals("Add")){
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scanner.nextLine();
                
                this.manager.add(new Bird(name,latinName));
            }else if(command.equals("Observation")){
                System.out.println("Bird?");
                String name = scanner.nextLine();    
                
                this.manager.observation(name);
            }else if(command.equals("All")){
                this.manager.print();
            }else if(command.equals("One")){
                System.out.println("Bird?");
                String name = scanner.nextLine();
                
                this.manager.one(name);
            }
        }
    }
}
