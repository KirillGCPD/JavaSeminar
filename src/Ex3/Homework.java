package Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Homework {

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
  
  public static void main(String[] args) {
      List<Employee> workers=new ArrayList<Employee>();
      Random randomizer=new Random();
      workers.add(new Employee("Антонов Сергей", randomizer.nextInt(50)+17, 1200, "Бухгалтерия"));
      workers.add(new Employee("Инванов Александр", randomizer.nextInt(50)+17, 1800, "Бухгалтерия"));
      workers.add(new Employee("Гришин Василий", randomizer.nextInt(50)+17, 1600, "Бухгалтерия"));
      workers.add(new Employee("Скоркина Анастасия", randomizer.nextInt(50)+17, 3200, "Менеджемент"));
      workers.add(new Employee("Шайхутдинов Артем", randomizer.nextInt(50)+17, 2500, "Менеджемент"));
      workers.add(new Employee("Клепикова Елена", randomizer.nextInt(50)+17, 3200, "Менеджемент"));
      workers.add(new Employee("Васильев Антон", randomizer.nextInt(50)+17, 900, "Склад"));
      workers.add(new Employee("Гончаров Роман", randomizer.nextInt(50)+17, 1100, "Склад"));
      workers.add(new Employee("Чупров Антон", randomizer.nextInt(50)+17, 3500, "IT-отдел"));
      workers.add(new Employee("Минченко Дмитрий", randomizer.nextInt(50)+17, 10200, "Совет директоров"));     
      workers.add(new Employee("Марченко Денис", randomizer.nextInt(50)+17, 1000, "Склад"));
      workers.add(new Employee("Анисимов Артем", randomizer.nextInt(50)+17, 850, "Склад"));
      workers.add(new Employee("Калуцкая Светлана", randomizer.nextInt(50)+17, 800, "Склад"));
      workers.add(new Employee("Бергман Иван", randomizer.nextInt(50)+17, 4200, "IT-отдел"));
      workers.add(new Employee("Мерц Денис", randomizer.nextInt(50)+17, 3200, "IT-отдел"));

      workers.add(new Employee("Тыдыков Александр", randomizer.nextInt(50)+17, 15200, "Совет директоров"));
      workers.add(new Employee("Бебенов Антон", randomizer.nextInt(50)+17, 1300, "Механик"));

      workers.add(new Employee("Хворова Евгения", randomizer.nextInt(50)+17, 1500, "Механик"));
      workers.add(new Employee("Лесковский Александр", randomizer.nextInt(50)+17, 1400, "Снабжение"));
      workers.add(new Employee("Лесковский Евгений", randomizer.nextInt(50)+17, 1600, "Снабжение"));
      for (Employee employee : workers) {
        System.out.println(employee);
      }
      System.out.println("\nСортировка по департаменту");;
      workers.sort(null);
      for (Employee employee : workers) {
        System.out.println(employee);
      }
      System.out.println("\nСортировка по имени");;
      workers.sort((x,y)->x.getName().compareTo(y.getName()));
      for (Employee employee : workers) {
        System.out.println(employee);
      }

      System.out.println("\nСортировка по возрасту");;
      workers.sort((x,y)->Integer.compare(x.getAge(), y.getAge()));
      for (Employee employee : workers) {
        System.out.println(employee);
      }

       System.out.println("\nСортировка по зарплате");;
      workers.sort(new SalaryComparator());
      for (Employee employee : workers) {
        System.out.println(employee);
      }
  }
}