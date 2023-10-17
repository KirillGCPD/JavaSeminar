package Ex1;

import java.time.LocalDate;

public class DepositAccount extends Account{
    private LocalDate lastWithdraw;

    public DepositAccount(){
        lastWithdraw= LocalDate.now().minusYears(1);
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
