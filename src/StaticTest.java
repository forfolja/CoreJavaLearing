/*public class StaticTest {
    public static void main(String[] args) {
        var staff = new EmployeeA[3];

        staff[0] = new EmployeeA("Tom", 40000);
        staff[1] = new EmployeeA("Dick", 60000);
        staff[2] = new EmployeeA("Harry", 65000);

        for (Employee aEmployee : staff) {
            System.out.println("name=" + aEmployee.getName() + ",id=" + aEmployee.getId() + ",salary=" + aEmployee.getSalary());
          }
         int n = Employee.advanceId();
         System.out.println("Next available id=" + n);
    }
}
class EmployeeA {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    public EmployeeA(String aName, double aSalary)
     {
         name = aName;
         salary = aSalary;
         id = advanceId();
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }

    public static int advanceId() {
        int aEmployeeId = nextId;
        nextId++;
        return aEmployeeId;
    }

 public static void main(String[] args) {
 var e = new EmployeeA("Harry", 50000);
      System.out.println(e.getName() + " " + e.getSalary());
    }
}

 */
