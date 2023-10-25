package Ex2;
/*
 *    * 2. Создать базовый абстрактный класс AbstractAccount, в котором будет общая часть:
   * # поле с балансом
   * # конструктор, который принимает начальное значение баланса
   * # реализация всех методов
 */
public abstract class AbstractAccount implements Accountable {

    private double currentAmount;

    public AbstractAccount(double currentAmount) {
        if (currentAmount>=0) {
            this.currentAmount=currentAmount;
        }
        else{
            currentAmount=0;
        }
    }

    public AbstractAccount() {
        this(0);
    }
    
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
