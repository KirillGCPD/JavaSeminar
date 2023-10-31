package Ex3;
 /**
   * Реализовать класс Сотрудник (Employee) c полями:
   * 1. Имя
   * 2. Возраст
   * 3. Зарплата
   * 4. Наименование департамента
   *
   * Необходимо:
   * 1. Создать список из разных сотрудников (штук 20)
   * 2. Отсортировать список по возрастанию возраста, по убыванию зарплаты, и по наименованию отдела (в лексикографическом порядке) (вывести на консоль).
   * Подумать о том, какую сортирвку сделать по умолчанию (заложить в класс, интерфейс Comparable), а какие две сделать внешними (интерфейс Comparator).
   */
public class Employee {
    private String name;
    private int age;
    private double salary;
    private String department;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age<0) throw new IllegalArgumentException("Возраст не может быть отрицательным");
        this.age = age;
        
    }
    
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary<0) throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        this.salary = salary;
    }

    
    
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
       
        this.department = department;
    }
    
    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

}
