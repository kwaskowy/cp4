import org.junit.jupiter.api.Test;
import pl.krakow.uek.student.paryla.CreditCardCantBeModifiedException;
import pl.krakow.uek.student.paryla.Creditcard;
import pl.krakow.uek.student.paryla.NotEnoughFundsException;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {

    @Test
    void itDenyToChangeAlreadyAssignedCredit(){
        Creditcard card = thereIsExampleCreditCard();
        card.assignCreditLimit(BigDecimal.valueOf(1000) );
        assertThrows(
                CreditCardCantBeModifiedException.class,
                () -> card.assignCreditLimit(BigDecimal.valueOf(2000) ));
    }

    private static Creditcard thereIsExampleCreditCard() {
        Creditcard card = new Creditcard("123-456789");
        return card;
    }


    @Test
    void denyWithdrawBeyondCardBalance(){
        Creditcard card = thereIsExampleCreditCard();
        card.assignCreditLimit(BigDecimal.valueOf(1000) );

        card.withdraw(BigDecimal.valueOf(900));

        assertThrows(
                NotEnoughFundsException.class,
                () -> card.withdraw(BigDecimal.valueOf(200))
        );


    }

}
