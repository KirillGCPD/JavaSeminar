package Ex2;

public interface Accountable {
    double getAmount(); //получение текущего баланса
    boolean put(double amount); // пополнить счет
    boolean take(double amount); // снять средства со счета
}
