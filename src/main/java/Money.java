public class Money implements Expression{

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multiplier) {
        return new Money(this.amount * multiplier, currency);
    };

    String currency() {
        return currency;
    };

    Expression plus(Money addend){
        return new Sum(this, addend);
    }

    public Money reduce(String to){
        return this;
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return this.amount == money.amount && this.currency().equals(money.currency());
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
