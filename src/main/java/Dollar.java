public class Dollar extends Money{

    private String currency;
    public Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    @Override
    String currency() {
        return currency;
    }

    public Money times(int multiplier){
        return new Dollar(this.amount * multiplier);
    }
}

