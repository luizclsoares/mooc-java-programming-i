
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if(this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }else if(this.elements.size() == 1){
            return "The collection " + this.name + " has 1 element:\n" + this.elements.get(0);
        }
        
        String str = "";
        
        for(String element : elements){
            str += element + "\n";
        }
        
        return "The collection " + name + " has " + this.elements.size() + " elements:\n" + str;
    }
}
