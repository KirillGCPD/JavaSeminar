package Ex1;

public class Homework {

    /**
     * Проверка работы системы классов
     * Во всех случаях в качестве контейнера используется базовый класс Account
     */
    public static void main(String[] args) {
        System.out.println("Тест работы банка");
        System.out.println("Обычный счет, пополнен на 100");
        Account simpleAccount=new Account();
        simpleAccount.put(100);
        simpleAccount.take(110); //Сняли больше чем есть
        simpleAccount.take(70);
        System.out.printf("%.2f\n",simpleAccount.getAmount());

        System.out.println("\nКредитный счет открыт на 200");
        Account creditAccount=new CreditAccount(200);
        System.out.println("Снятие: 110");
        creditAccount.take(110); //Снятие с комиссией
        System.out.printf("%.2f\n",creditAccount.getAmount());

        System.out.println("\nДепозитный счет пополнен на 300");
        Account depostAccount=new DepositAccount();
        depostAccount.put(300);
        System.out.println("Снятие: 100");
        depostAccount.take(100);
        System.out.printf("%.2f\n",depostAccount.getAmount());
        System.out.println("Снятие: 50");
        depostAccount.take(50);
        System.out.printf("%.2f\n",depostAccount.getAmount());

       
    }
    /*
     * 1. Создать класс "Счет в банке" - Account.
     * У этого класса должно быть поле с текущим балансом на счете.
     * У этого класса должно быть 3 метода:
     * - (put) Пополнить счет - принимат положительное число, увеличивает текущий баланс
     * - (take) Вывести средства - принимат положительное число, уменьшает текущий баланс
     * - (getAmount) Показать баланс - ничего не принимает, возвращает текущий баланс (getter)
     *
     * 2. Создать несколько наследников.
     * - Кредитный счет (CreditAccount)
     * Особенность: на каждое снятие нужно наложить комиссию в размере 1% от суммы снятия.
     * То есть, если снимаем 100 у.е., то снять нужно 101.
     * - Депозитный счет (DepositAccount) *
     * Особенность: нельзя снимать средства чаще, чем раз в месяц.
     * То есть, нужно завести поле с датой последнего снятия, и использовать его.
     * (Для дат лучше использовать LocalDate, пример в классе Dates в проекте урока)
     */

}