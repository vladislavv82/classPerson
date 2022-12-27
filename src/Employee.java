import java.util.ArrayList;

class Employee extends Person {
    public final String hiddenString = "Скрытое поле класса Работник";
    protected String jobTitle; //Должность
    protected ArrayList<String> dutyList; //Обязанности
    protected String company; // Компания
    protected int experience; //Стаж

    public Employee(String name, String surname, String patronymic, String sex, int age,String jobTitle, String duty, String company, int experience) {
        super(name, surname, patronymic, sex, age);
        this.jobTitle = jobTitle;
        this.dutyList = new ArrayList<String>();
        this.company = company;
        this.experience = experience;
    }

    public Employee() {
        super("", "", "", "", 0);
        jobTitle = "";
        company = "";
        experience = 0;
        dutyList = new ArrayList<>();
    }

    public Employee(Employee copy) {
        super(copy.name, copy.surname, copy.patronymic, copy.sex, copy.age);
        this.jobTitle = copy.jobTitle;
        this.dutyList = new ArrayList<String>();
        this.company = copy.company;
        this.experience = copy.experience;

    }
    //Get
    public String getJobTitle(){
        return jobTitle;
    }
    public String getCompany(){
        return company;
    }
    public int getExperience(){
        return experience;
    }
    public ArrayList<String> getDutyList(){
        return dutyList;
    }

    //Set
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public void setExperience(int experience){
        this.experience = experience;
    }
    public void setDutyList(java.util.ArrayList<String> dutyList) {
        this.dutyList = dutyList;
    }

    //скрытые строки
    public void hiddenLines(){
            System.out.println("\n" + super.hiddenString); //из класса Персон
            System.out.println("\n" + hiddenString); // из класса Работник
     }

    @Override
    public void make() {
        System.out.println("\nСотрудник " + super.name + " " + super.surname + " " + super.patronymic + ", dолжность: " + this.jobTitle + ",\nВыполняет следующие обязанности: " + this.dutyList);
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + " " + this.patronymic + ", возраст: " + this.age
                + "\nДолжность: " + this.jobTitle + "\nСписок обязанностей: " + this.dutyList + "\nНазвание компании: " + this.company + "\nСтаж работы: " + this.experience + " лет.";
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) {
            return true;
        }

        if (p == null || getClass() != p.getClass()) {
            return false;
        }

        Employee employee = (Employee) p;
        return name.equals(employee.name) &&
                surname.equals(employee.surname) &&
                patronymic.equals(employee.patronymic) &&
                age == employee.age &&
                jobTitle.equals(employee.jobTitle) &&
                dutyList.equals(employee.dutyList) &&
                company.equals(employee.company) &&
                experience == employee.experience;
    }

}