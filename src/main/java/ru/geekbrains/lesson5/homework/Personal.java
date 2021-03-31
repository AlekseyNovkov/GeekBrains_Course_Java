package ru.geekbrains.lesson5.homework;

public class Personal {
    private String name;
    private String middleName;
    private String lastName;
    private String position;
    private String email;
    private String fonNumber;
    private Double salary;
    private int age;

     Personal(){
         this.name = "Иван";
         this.middleName = "Иванович";
         this.lastName = "Иванов";
         this.position = "Оператор";
         this.email = "iiivanov@email.ru";
         this.fonNumber = "8(916)555-06-22";
         this.salary = 20_000.00;
         this.age = 20;
     }

     public void printPersonal(){
         System.out.printf("Фамилия: %s;    Имя: %s,    Отчество: %s,   Должность: %s,   Возраст: %s,    Заработная плата: %s,  Email: %s,  Телефон: %s.\n", this.getLastName(), this.getName(), this.getMiddleName(), this.getPosition(), this.getAge(), this.getSalary().toString(), this.getEmail(), this.getFonNumber());
     }

    public Personal(String lastName, String name, String middleName, String position, String email, String fonNumber, double salary, int age) {
         this.lastName = lastName;
         this.name = name;
         this.middleName = middleName;
         this.position = position;
         this.email = email;
         this.fonNumber = fonNumber;
         this.salary = salary;
         this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPosition() {
        return this.position;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFonNumber() {
        return this.fonNumber;
    }

    public Double getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFonNumber(String fonNumber) {
        this.fonNumber = fonNumber;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
