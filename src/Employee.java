import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }


    public static void main(String[] args)  {
    /*  Employee e = new Employee("forfolja",4000,111,11,11);
        Class c1 = e.getClass();
        int y;
        System.out.println(e.getClass().getName()+" "+e.getName());
        if(e.getClass() == Employee.class)
        { y = 1;}
        else y = 0;
        System.out.println(y);


        var generator = new Random();
        Class cl = generator.getClass();
        String name = cl.getName();
        System.out.println(name.toString());

        var className = "java.util.Random";
        Class c1 = Class.forName(className);
        Object obj = c1.getConstructor().newInstance();
        System.out.println(obj.toString());*/


    }
}
