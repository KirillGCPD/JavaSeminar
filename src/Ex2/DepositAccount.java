package Ex2;

import java.time.LocalDate;

public class DepositAccount extends AbstractAccount{
    private LocalDate lastWithdraw;

     public DepositAccount(double money){
        super(money);
        lastWithdraw= LocalDate.now().minusYears(1);
    }

    public DepositAccount(){
        this(0); //Вызываем конструктор этого класса, который вызовет конструктор базового
    }

    @Override
    public boolean take(double money) {
        LocalDate plusMonth=lastWithdraw.plusMonths(1);
        if (plusMonth.isBefore(LocalDate.now())) {
            boolean result=super.take(money);
            if (result)
                lastWithdraw=LocalDate.now();
            return result;
        }
        else
        {
            System.out.println("Еще не прошел месяц с последнего снятия");
        }
        return false;
    }
}
