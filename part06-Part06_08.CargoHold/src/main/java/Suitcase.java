
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        if(this.totalWeight() + item.getWeight() <= this.maximumWeight){
            this.items.add(item);
        }
    }
    
    public void printItems(){
        for(Item item : this.items){
            System.out.println(item);
        }
    }
    
    public int totalWeight(){
        int sum = 0;
        
        for(Item item : this.items){
            sum += item.getWeight();
        }
        
        return sum;
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        
        Item item = this.items.get(0);
        
        for(Item i : this.items){
            if(i.getWeight() > item.getWeight()){
                item = i;
            }
        }
        
        return item;
    }

    @Override
    public String toString() {
        if(this.items.isEmpty()){
            return "no items (0 kg)";
        }else if(this.items.size() == 1){
            return "1 item (" + this.totalWeight() + " kg)";
        }
        
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
