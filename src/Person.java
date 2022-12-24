import java.util.ArrayList;
class Person {
    private String name;
    private String surname;
    private String patronymic;

    private int age;
    private String sex;
    private ArrayList<Hobby> hobbies;

    //Конструктор по умолчанию
    Person() {
        this.name = "";
        this.surname = "";
        this.sex = "";
        this.patronymic = "";
        this.age = 1;
        hobbies = new ArrayList<Hobby>();
    }

    //Конструктор с параметрами
    public Person(String name, String surname, String patronymic, String sex, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.sex = sex;
        this.age = age;
        hobbies = new ArrayList<Hobby>();
    }

    // Конструкотр копирования
    Person (Person copy) {
        this.surname = copy.surname;
        this.sex = copy.sex;
        this.name = copy.name;
        this.age = copy.age;
        this.hobbies = copy.hobbies;
    }

    //Get
    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }
  //Set

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

//Добавление ии удаление хобби

    public void addHobby(Hobby hobby) {
        this.hobbies.add(hobby);
    }

    public void removeHobby(Hobby hobby) {
        this.hobbies.remove(hobby);
    }


    @Override
    public String toString() {
        return this.name + " " + this.surname + " " + this.patronymic + ", возраст: " + this.age + "\nСписок хобби:" + this.hobbies;
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) {
            return true;
        }

        if (p == null || getClass() != p.getClass()) {
            return false;
        }

        Person person = (Person) p;
        return name.equals(person.name) &&
                surname.equals(person.surname) &&
                patronymic.equals(person.patronymic) &&
                age == person.age &&
                hobbies.equals(person.hobbies);
    }
}