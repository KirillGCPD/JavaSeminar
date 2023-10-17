package Ex1;

/**
 * Базовый класс счета, реализуюзий базовую логику работы с банковским счетом
 */
public class Account {
    private double currentAmount;

    /**
     * Положить на счет сумму
     * @param money неотрицательная сумма денег
     * @return true если успещно
     */
    public boolean put(double money)
    {
        if (money<0){
            System.out.println("Нельзя внести отрицательное количество средств");
            return false;
        }
        else {
            currentAmount+=money;
            return true;
        }
    }

    /**
     * Снять деньги со счета
     * @param money неотрицательное количество денег
     * @return true если успешно
     */
    public boolean take(double money)
    {
        if (money<0){
            System.out.println("Нельзя вывести отрицательное количество средств");
            return false;
        }
        if (currentAmount<money)
        {
            System.out.println("Недостаточно средтсв на счете");
            return false;
        }
        currentAmount-=money;
        return true;
    }
    public double getAmount()
    {
        return currentAmount;
    }
}
