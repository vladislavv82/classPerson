import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person("Артём","Акопян", "Андроевич", "мужской" ,15);

        //Работник 1
        Employee p1 = new Employee("Василий","Пупкин","Александрович","мужской",30 , "Кондитер", "приготовление пироженных", "Золотой колос", 10);
        p1.dutyList.add("заготовка для теста");
        p1.dutyList.add("посыпка для булочек");

        System.out.println("\n" + p1.toString());

        p.make();
        p1.make();
        //upcast
        p1.upcastDemonstration();

        //Новый работник 3
        Employee p3 = new Employee (p1);
        System.out.println("\n" + p1.equals(p3));

        p3.setName("Иван");
        p3.setSurname("Иванович");
        System.out.println("\n" + p3.getName() + " " + p3.getSurname() + " " + p3.getPatronymic());
        System.out.println("\n" + p1.equals(p3));

        //вызов скрытых строк
        p1.hiddenLines();

        //Вывод списком данных Person 1
        System.out.println("Имя:" + p.getName());
        System.out.println("Фамилия:" + p.getSurname());
        System.out.println("Отчество:" + p.getPatronymic());
        System.out.println("Пол:" + p.getSex());
        System.out.println("Возраст" + p.getAge());

        Hobby PersonHobby1 = new Hobby("Программирование", 1, "Разбираю ООП на Java");
        Hobby PersonHobby2 = new Hobby("Футбол", 10, "Спорт моё всё");

        ArrayList<Hobby> PersonHobbies = new ArrayList<Hobby>();
        p.addHobby(PersonHobby1);
        p.addHobby(PersonHobby2);
        System.out.println("\nДобавляем хобби " + p.toString());

        p.removeHobby(PersonHobby1);
        p.removeHobby(PersonHobby2);
        System.out.println("\nПосле удаление хобби " + p.toString());

        //Копия Человека
        Person CopyPers = new Person(p);
        System.out.println("\nКопия " + p.toString());
        //Проверяем равность с копией
        System.out.println("\nПроверка на равность: " + p.equals(p));

        //Создадим второго пользователя
        Person p2 = new Person();
        System.out.println("Введите Фамилию");
        p.setSurname(sc.nextLine());
        System.out.println("Введите имя");
        p.setName(sc.nextLine());
        System.out.println("Введите Отчество");
        p.setPatronymic(sc.nextLine());
        System.out.println("Введите пол");
        p.setSex(sc.nextLine());
        System.out.println("Введите возраст");
        p.setAge(sc.nextInt());

        //Вывод списком данных Person 2
        System.out.println("Имя: " + p.getName());
        System.out.println("Фамилия: " + p.getSurname());
        System.out.println("Отчество: " + p.getPatronymic());
        System.out.println("Пол: " + p.getSex());
        System.out.println("Возраст" + p.getAge());

        //А теперь проверим нашего введенного пользователя с Person 1
        System.out.println("\nРавен Person 1:" + p.equals(p2));

    }

}