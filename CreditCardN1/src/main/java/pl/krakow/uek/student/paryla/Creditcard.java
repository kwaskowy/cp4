package pl.krakow.uek.student.paryla;

import java.math.BigDecimal;

public class Creditcard {
    String cardNumber;
    BigDecimal credit;
    BigDecimal balance;

    public Creditcard(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    public void assignCreditLimit(BigDecimal credit){
        if (this.credit != null){
            throw new CreditCardCantBeModifiedException();
        }
        this.credit = credit;
        this.balance = credit;

    }
    public BigDecimal getBalance(){
        return balance;
    }

    public void withdraw(BigDecimal amount) {
        if (cannotAfford(amount)){
            throw new NotEnoughFundsException();
        }
        this.balance = this.balance.subtract(amount);
    }

    private boolean cannotAfford(BigDecimal amount) {
        return this.balance.subtract(amount).compareTo(BigDecimal.ZERO) > 0;
    }
}
