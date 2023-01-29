import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;
import java.util.Date;
import java.util.GregorianCalendar;
 /* public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;
    private LocalDate hireDay;

  public Employee(String name,double salary,int year,int month,int day){

        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public LocalDate getHireDay() {
        return hireDay;
    }
    public String getDescription(){
        return "an employee with a salary of $%.2f".formatted(salary);
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }

    public int compareTo(Employee other){
        return Double.compare(salary, other.salary);
    }

    public boolean equals(Object otherObject){
        if(this == otherObject)
            return true;
        if (otherObject == null)
            return false;
        if(getClass() != otherObject.getClass())
            return false;
        Employee other = (Employee) otherObject;
        return Objects.equals(super(name),other.name)
                && this.salary == other.salary
                && Objects.equals(this.hireDay,other.hireDay);
    }

    public int hashCode(){
        return Objects.hash(super(name), salary, hireDay);
    }
    public String toString() {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }

}


public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    public int compareTo(Employee other){
        return Double.compare(salary, other.salary);
    }
}
*/
public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }
    public Employee clone() throws CloneNotSupportedException{
        Employee cloned = (Employee) super.clone();
        cloned.hireDay = (Date) hireDay.clone();


        return cloned;



    }
    public void setHireDay(int year,int month,int day){
        Date newHireDay = new GregorianCalendar(year,month,day).getTime();
        hireDay.setTime(newHireDay.getTime());
        }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;

    }

    public String toString(){
        return "Employee[name="+name+",salary="+salary+",hireDay="+hireDay+"]";
    }
}