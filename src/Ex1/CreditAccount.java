package Ex1;

/**
 * Class for accounts with commission and non-positive balance
 */
public class CreditAccount extends Account{

    private double commission;
    private double availableCredit; //Будет использоваться в будющем для определения задолженности по кредиту

    /**
     * Creates new Credit account with commission
     * @param commission take commission by percent
     * @param availableCredit you can't withdraw more than available
     */
    public CreditAccount(double commission, double availableCredit)
    {
        this.commission=commission;
        this.availableCredit=availableCredit;
        put(availableCredit); //Put available amount on account
    }

    /**
     * By default, commission will be 1 percent
     */
    public CreditAccount(double availableCredit)
    {
        this(1,availableCredit);
    }
    @Override
    public boolean take(double money) {
        double commissionAmount=money*commission/100;
        boolean result= super.take(money+commissionAmount);
        if (result) {
           System.out.printf("Удержана комиссия: %.2f\n",commissionAmount);
        }
        else {
            System.out.printf("Снятие не удалось\n");
        }
        return result;
    }
}
