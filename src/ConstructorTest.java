import java.util.*;
/*
public class ConstructorTest {
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Harry",40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee( );

        for(Employee aEmployee:staff)
            System.out.println("name="+aEmployee.getName()+",id="+aEmployee.getId()+",salary="+aEmployee.getSalary());
    }
}
class Employee {
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    private static Random generator = new Random();

    static {
        nextId = generator.nextInt(10000);
    }

           {
      id = nextId;
          nextId++;
    }
    public Employee(String aName,double aSalary){
        name = aName;
        salary = aSalary;
    }
    public Employee(double aSalary){
        this("Employee #"+nextId,aSalary);
    }
    public Employee(){ }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public int getId(){
        return id;
    }
}

 */