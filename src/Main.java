import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person("Акопян", "Артём" , "Андроевич", 15);

        //Вывод списком данных Person 1
        System.out.println(p.getName());
        System.out.println(p.getSex());
        System.out.println(p.getSurname());
        System.out.println("age: " + p.getAge());

        Hobby PersonHobby1 = new Hobby("Программирование", 1, "Разбираю ООП на Java");
        Hobby PersonHobby2 = new Hobby("Футбол", 10, "Спорт моё всё");

        ArrayList<Hobby> PersonHobbies = new ArrayList<Hobby>();
        p.addHobby(PersonHobby1);
        p.addHobby(PersonHobby2);
        System.out.println("\nДобавляем хобби" + p.toString());

        p.removeHobby(PersonHobby1);
        p.removeHobby(PersonHobby2);
        System.out.println("\nПосле удаление хобби" + p.toString());

        //Копия
        Person CopyPers = new Person(p);
        System.out.println("\nКопия" + p.toString());
        //Проверяем равность с копией
        System.out.println("\nПроверка на равность:" + p.equals(p));

        //Создадим второго пользователя
        Person p2 = new Person();

        System.out.println("Введите Фамилию");
        p.setSurname("surname: " + sc.nextLine());

        System.out.println("Введите имя");
        p.setName("name: " + sc.nextLine());

        System.out.println("Введите Отчество");
        p.setPatronymic("patronymic: " + sc.nextLine());

        System.out.println("Введите пол");
        p.setSex("sex: " + sc.nextLine());

        System.out.println("Введите возраст");
        p.setAge(sc.nextInt());

        //Вывод списком данных Person 2
        System.out.println(p.getName());
        System.out.println(p.getSex());
        System.out.println(p.getSurname());
        System.out.println("age: " + p.getAge());

        //А теперь проверим нашего введенного пользователя с Person 1
        System.out.println("\nay they equal: " + p.equals(p2));

    }

}