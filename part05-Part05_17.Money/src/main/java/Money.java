
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int euros = this.euros + addition.euros();
        int cents = this.cents + addition.cents();

        if (cents > 99) {
            cents = cents - 100;
            euros = euros + 1;
        }

        return new Money(euros, cents);
    }
    
    public boolean lessThan(Money compared) {
        return (100 * euros + cents) < (100 * compared.euros() + compared.cents());
    }  
    
    public Money minus(Money decreaser) {
        int euros = this.euros - decreaser.euros();
        int cents = this.cents - decreaser.cents();
        
        if (cents < 0) {
            cents = cents + 100;
            euros = euros - 1;
        }
                
        if (euros < 0) {
            euros = 0;
            cents = 0;

        }

        return new Money(euros, cents);
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
