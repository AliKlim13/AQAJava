package Lesson_4;

public class Main {
    public static void main(String [] args){
        Employee[] empArray = new Employee[5];

        empArray[0]= new Employee("Андреев Андрей Иванович", "Менеджер", "andreev@mail.ru", 5468895, 55000, 31);
        empArray[1]= new Employee("Богданов Антон Викторович", "Аналитик", "bogdanov@gmail.com", 9635277, 88000, 27);
        empArray[2]= new Employee("Клименко Михаил Федорович", "Руководитель проекта", "klim@gmail.com", 3885504, 150000, 30);
        empArray[3]= new Employee("Науменко Валентина Ивановна", "Дизайнер", "val@mail.ru", 3612463, 90500, 41);
        empArray[4]= new Employee("Селиванов Федор Сергеевич", "Разработчик", "fedor@mail.ru", 5190175, 97544, 30);


        for (Employee emp: empArray){
            emp.printInfo();
        }

        Park park = new Park("Сказка");
        park.displayAttraction();
    }
}
