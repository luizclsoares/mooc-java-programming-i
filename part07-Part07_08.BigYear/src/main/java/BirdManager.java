
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
public class BirdManager {
    private ArrayList<Bird> birds;

    public BirdManager() {
        this.birds = new ArrayList<>();
    }
    
    public void add(Bird bird){
        this.birds.add(bird);
    }
    
    public void print(){
        for(Bird bird : this.birds){
            System.out.println(bird);
        }
    }
    
    public void observation(String name){
        for(Bird bird : this.birds){
            if(bird.getName().equals(name)){
                bird.addObservation();
                
                return;
            }
        }
        
        System.out.println("Not a bird!");
    }
    
    public void one(String name){
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }
}
