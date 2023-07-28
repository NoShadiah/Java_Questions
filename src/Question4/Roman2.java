package Question4;


import java.util.Scanner;

public class Roman2 {
    //    The required class
    static class Person {
        private int age;
        private int salary;

        public void registerPerson() {
            System.out.println("You are setting age and salary of a new person");
            Scanner Age = new Scanner(System.in);
            System.out.println("Enter person's age:");
            this.age = Age.nextInt();
            Scanner Salary = new Scanner(System.in);
            System.out.println("Enter person's Salary:");
            this.salary = Salary.nextInt();

        }

        public int getAge() {
            return age;
        }

        public void setAge() {
            System.out.println("Let's update the age");
            Scanner Age = new Scanner(System.in);
            System.out.println("Enter new age:");
            this.age = Age.nextInt();
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary() {
            System.out.println("Let's update the salary");
            Scanner Salary = new Scanner(System.in);
            System.out.println("Enter new Salary:");
            this.salary = Salary.nextInt();

        }
    }
}
class PersonTestDrive{
    public static void main(String[] args) {
        Roman2.Person person1 = new Roman2.Person();
//        setting the person's age and salary
        person1.registerPerson();
        String age = String.valueOf(person1.getAge());
        String salary = String.valueOf(person1.getSalary());
        System.out.println("Your salary is "+salary+"\nYour age is "+age);
        person1.setAge();
        person1.setSalary();
        String Newage = String.valueOf(person1.getAge());
        String Newsalary = String.valueOf(person1.getSalary());
        System.out.println("Successfully updated values of salary and age");
        System.out.println("Your salary is "+Newsalary+"\nYour age is "+Newage);
    }
}