package Lesson_4;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private int phone;
    private double salary;
    private int age;
    public Employee(String fullName, String position, String email, int phone, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo(){
        System.out.println("ФИО:"+ fullName);
        System.out.println("Должность:"+position);
        System.out.println("Email:"+email);
        System.out.println("Телефон:"+phone);
        System.out.println("Зарплата:"+salary);
        System.out.println("Возраст:"+age);
    }

}
