
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luiz
 */
public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        if(this.isEmpty()){
            return null;
        }
        
        Person person = this.persons.get(0);
        
        for(Person p : this.persons){
            if(p.getHeight() < person.getHeight()){
                person = p;
            }
        }
        
        return person;
    }
    
    public Person take(){
        if(this.isEmpty()){
            return null;
        }
        
        Person person = this.shortest();
        
        this.persons.remove(person);
        
        return person;
    }
}
