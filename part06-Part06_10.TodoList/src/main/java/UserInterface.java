
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
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scannner) {
        this.todoList = todoList;
        this.scanner = scannner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if(command.equals("stop")){
                break;
            }else if(command.equals("add")){
                System.out.println("To add:");
                String task = scanner.nextLine();
                
                this.todoList.add(task);
            }else if(command.equals("list")){
                this.todoList.print();
            }else if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int number = Integer.valueOf(scanner.nextLine());
                
                this.todoList.remove(number);
            }
        }
    }
}
