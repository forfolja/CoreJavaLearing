import java.util.ArrayList;

/**
 * 这个程序主要是用来尝试学习并使用类的继承
 * @version 1.0 2023-01-25 19:17:01
 * @author forfolja
  */
public class ManagerTest {

    public static void main(String[] args) {
        //创建Manger对象
        var boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        //调用Manager的方法设置奖金
        boss.setBonus(10000);
        //在staff队列中实例化对象
     var staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        //遍历打印所有的staff实例化对象
        for (Employee aEmployee:staff){
            System.out.println("name="+aEmployee.getName()+",salary="+aEmployee.getSalary());}


   /*
        //实践数组列表跟数组的插入数据及获取
        ArrayList<Employee>staff = new ArrayList<Employee>();

        staff.add(new Employee("AAAA", 80000, 1982, 2, 2));
        staff.add(new Employee("BBBB", 70000, 1986, 12, 25));
        staff.add(new Employee("CCCC", 50000, 1989, 9, 7));
        staff.add(new Employee("CCCC", 50000, 1989, 9, 7));
        staff.add(new Employee("CCCC", 50000, 1989, 9, 7));
        staff.add(new Employee("CCCC", 50000, 1989, 9, 7));

        System.out.println(staff.get(0));
        System.out.println(staff.size());
          */

    }
}
