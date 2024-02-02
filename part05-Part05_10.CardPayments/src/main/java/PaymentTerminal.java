
public class PaymentTerminal {

    private double money;  
    private int affordableMeals; 
    private int heartyMeals;  

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if(payment >= 2.50){
            this.money += 2.50;
            this.affordableMeals++;
            
            return payment - 2.50;
        }

        return payment;
    }

    public double eatHeartily(double payment) {
        if(payment >= 4.30){
            this.money += 4.30;
            this.heartyMeals++;
            
            return payment - 4.30;
        }

        return payment;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        if(card.balance() >= 2.50){
            this.affordableMeals++;
        }
        
        return card.takeMoney(2.50);
    }

    public boolean eatHeartily(PaymentCard card) {
        if(card.balance() >= 4.30){
            this.heartyMeals++;
        }
        
        return card.takeMoney(4.30);
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum > 0){
            this.money += sum;
            card.addMoney(sum);
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
