public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros(){
        return euros;
    }

    public int cents(){
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money m){
    	int totalEuros = this.euros + m.euros;
    	int totalcents = this.euros + m.euros;
    	return new Money(totalEuros, totalcents);
    }
    
    public boolean less(Money m){
    	if(this.euros<m.euros)
    		return true;
    	if(this.euros==m.euros && this.cents<m.cents)
    		return true;
    	return false;
    }
    
    public Money minus(Money m){
    	int totalEuros = this.euros - m.euros;
    	int totalcents = this.euros - m.euros;
    	return new Money(totalEuros, totalcents);
    }
    
}