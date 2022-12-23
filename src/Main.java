import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static <Hobby> void main(String[] args) {
        Person p = new Person();
        Scanner sc = new Scanner(System.in);

        int age = p.getAge();
        String name = p.getName();
        String surname = p.getSurname();
        String sex = p.getSex();
        String patronymic = p.getPatronymic();

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

        //Вывод списком данных Person 1
        System.out.println(p.getName());
        System.out.println(p.getSex());
        System.out.println(p.getSurname());
        System.out.println("age: " + p.getAge());

        //Person p2 = new Person("Акопян", "Артём" , "Андроевич", 15);

        Hobby PersonHobby1 = new Hobby("Программирование", 1, "Учу ООП на Java");
        Hobby PersonHobby2 = new Hobby("Футбол", 10, "Спорт моё всё");

        ArrayList<Hobby> PersonHobbies = new ArrayList<Hobby>();
        p.addHobby(PersonHobby1);
        System.out.println("\n" + p.toString());

        p.addHobby(PersonHobby2);
        p.removeHobby(PersonHobby2);

        System.out.println("\n" + p.toString());
    }

}
}