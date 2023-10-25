package Ex2;

public class FixedAmountAccount extends AbstractAccount{


    public FixedAmountAccount(double moeny)
    {
        super(moeny);
    }

    @Override
    public boolean put(double money) {
        return true; //Не меняют баланс
    }

    @Override
    public boolean take(double money) {
        return true; //Не меняют баланс
    }
    
}
