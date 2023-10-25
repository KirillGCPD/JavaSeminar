package Ex2;

public class Homework {

  /**
   * Модифицируем пример, описанный в предыдущем домашнем задании (со счетами).
   * {@link ru.gb.lesson1.Homework}
   *
   * 1. Класс Account превратить в интерфейс с методами:
   * # double getAmount() - получение текущего баланса
   * # void put(double amount) - пополнить счет
   * # void take(double amount) - снять средства со счета
   *
   * 2. Создать базовый абстрактный класс AbstractAccount, в котором будет общая часть:
   * # поле с балансом
   * # конструктор, который принимает начальное значение баланса
   * # реализация всех методов
   *
   * 3. Добавить еще один класс FixedAmountAccount с особенностью: методы put, take НЕ изменяют баланс.
   *
   * 4.* Класс AbstractAccount можно реализовать хитрее. Пример ниже.
   */
  public static void main(String[] args) {
    System.out.println("Тест работы банка");
  

    System.out.println("\nКредитный счет открыт на 200");
    AbstractAccount creditAccount=new CreditAccount(200);
    System.out.println("Снятие: 110");
    creditAccount.take(110); //Снятие с комиссией
    System.out.printf("Кредитный счет: %.2f\n",creditAccount.getAmount());

    System.out.println("\nДепозитный счет пополнен на 300");
    Accountable depostAccount=new DepositAccount(300);
    System.out.println("Снятие: 100");
    depostAccount.take(100);
    System.out.printf("Депозитный счет: %.2f\n",depostAccount.getAmount());
    System.out.println("Снятие: 50");
    depostAccount.take(50);
    System.out.printf("Депозитный счет: %.2f\n",depostAccount.getAmount());
    System.out.println("\nФиксированый счет пополнен на 300");
    Accountable fixedAccount=new FixedAmountAccount(300);
   
    System.out.println("Снятие: 100");
    fixedAccount.take(100);
    System.out.printf("Фиксированый счет: %.2f\n",fixedAccount.getAmount());
    System.out.println("Снятие: 50");
    fixedAccount.take(50);
    System.out.printf("Фиксированый счет: %.2f\n",fixedAccount.getAmount());
   
  }
  

  

}