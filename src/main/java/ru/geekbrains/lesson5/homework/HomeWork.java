package ru.geekbrains.lesson5.homework;

public class HomeWork {
    public static void main(String[] args) {
        //Создаём пустой массив "Персонал" на 5 сотрудников.
        Personal[] personal = new Personal[5];

        //Наполняем массив "Персонал" сотрудниками.
        personal = setPersonals(personal);

        //Ищем сотрудников старше 40 лет и выводим на печать.
        findPersonsAndPrint(personal);
    }

    private static void findPersonsAndPrint(Personal[] personal) {
        for (Personal person : personal) {
            int age = person.getAge();
            if (age > 40) person.printPersonal();
        }
    }

    private static Personal[] setPersonals(Personal[] personal) {
        //Сотрудник_1.
//        personal[1] = new Personal();
//        //Сотрудник_2.
//        personal[0] = new Personal("Петров", "Виктор", "Сергеевич", "юрист", "vspetrov@mail.ru", "8(926)555-88-99", 75_235.69, 35);
//        //Сотрудник_3.
//        personal[2] = new Personal("Зубов", "Анатолий", "Фёдорович", "директор", "afzubov@mail.ru", "8(916)777-77-77", 199_999.99, 45);
//        //Сотрудник_4.
//        personal[3] = new Personal("Лытько", "Марина", "Романовна", "кадровик", "pvsergeevich@mail.ru", "8(926)125-13-20", 26_456.35, 25);
//        //Сотрудник_5.
//        personal[4] = new Personal("Весёлова", "Ольга", "Александровна", "бухгалтер", "pvsergeevich@mail.ru", "8(926)555-88-99", 93_586.69, 43);

        Personal[] personals = {new Personal("Петров", "Виктор", "Сергеевич", "юрист", "vspetrov@mail.ru", "8(926)555-88-99", 75_235.69, 35),
                new Personal("Петров", "Виктор", "Сергеевич", "юрист", "vspetrov@mail.ru", "8(926)555-88-99", 75_235.69, 35),
                new Personal("Зубов", "Анатолий", "Фёдорович", "директор", "afzubov@mail.ru", "8(916)777-77-77", 199_999.99, 45),
                new Personal("Лытько", "Марина", "Романовна", "кадровик", "pvsergeevich@mail.ru", "8(926)125-13-20", 26_456.35, 25),
                new Personal("Весёлова", "Ольга", "Александровна", "бухгалтер", "pvsergeevich@mail.ru", "8(926)555-88-99", 93_586.69, 43)
        };

        return personals;
    }
}
