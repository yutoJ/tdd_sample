public class Franc extends Money{

    private String currency;
    public Franc(int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }

    @Override
    String currency() {
        return currency;
    }

    public Money times(int multiplier){
        return new Franc(this.amount * multiplier);
    }



}

