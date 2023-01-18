import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
  /* public static final  double CM_PER_INCH = 2.54;
    public static void main(String[] args) {

       double paperWidth = 8.5;
       double paperHeight = 11;

       System.out.println("Paper is in the centimeters: "+paperHeight*CM_PER_INCH+" by "+paperWidth*CM_PER_INCH);
    }
 enum Size {Small,Medium,Large,extraLarge}
    Size s = Size.Medium;

    public static void main(String[] args) {
        System.out.println("Size s is ");
    }*/

    public static void main(String[] args) {
        /* double x = 6;
        double y = Math.sqrt(x);
        double y = 7;
        double x = Math.pow(3,y);
        double x = Math.rint(8.5);
        System.out.println(Math.ceil(Math.random()*100));

        double x = 12.33313;
        x+=4;
        var y = (int) Math.ceil(x);
        System.out.println(y);


        String x = "Java\u2122";
        System.out.println(x);
        String x = "Hashimoto Nanami";
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;
        int age = 13;
        String rating = "PG" + age;
        String x = rating.repeat(3);

        String greeting = "Hello";
        greeting = greeting.substring(0, 3) + "p!";

        String x = "Hashimoto";
        String y = "橋本";
        boolean z = x.equals(y);

        String s = "2.0";
        String t = "2";
        System.out.println(t.repeat(3));

        StringBuilder t = new StringBuilder("Hashimoto");

        System.out.println(t.reverse());

        String t = "Hashimoto\n Nanami\n 773";
        String t = """
                Hashimoto \
                Nanami
                773
                """;
                double x = 10000000000.0/3.0;
        System.out.printf("%,.2f",x);
        System.out.println(t);
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = in.nextLine();
        System.out.println("How old are you? \n ");
        int age = in.nextInt();
        System.out.println("Hello, " + name + ". Next year,you'll be " + (age + 1));

        int x = 100;
        int y = 20;
        if (x>y) {
        System.out.println("Ture");}
        else System.out.println("False");


        for (int i = 10; i > 0; i--)
            System.out.println("Counting down . . . " + i);
        System.out.println("Blastoff!");

        for (double i = 0 ;i<10 ;i+=0.1)
        System.out.println(i);
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you need to draw? ");
        int k = in.nextInt();
        System.out.println("What is the highest number you can draw? ");
        int n = in.nextInt();
        int test = 1;
        for(int i = 1;i<=k;i++)
            test = test *(n+i+1)/i;
        System.out.println("Your odds are 1 in " + test + ". Good luck!");

        String seasonName = "Spring";
        int numLetters = switch (seasonName){
            case Spring ->{
                System.out.println("spring time");
                yield 6;
            }
            case Summer,Winter->6;
            case Autumn->4;
            default -> -1;
        };
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int goal = 100;
        while (sum < goal)
        {
            System.out.print("Enter a number: ");
            int n = in.nextInt();
            if (n < 0) continue;
            sum += n;
        }
       String str1 = "我是一个字符串";
       char c1 = 'c';
       boolean b1 = false;
       int i1 = 10;
       double d1 = 99.9;
       float f1 = 99.9f;

       System.out.printf("字符串型：%s%n字符型：%c%n布尔型：%b%n整型（十进制）：%d%n单精度浮点型：%f%n双精度浮点型：%f%n",str1,c1,b1,i1,f1,d1);
        double [] i= {1.1,1.2,1.3 };

        double [] k = i;
        System.out.println(k[1]);


        if (args.length == 0 || args[0].equals("-h"))
            System.out.print("Hello,");
        else if (args[0].equals("-g"))
            System.out.print("Goodbye,");

        for (int i = 1; i < args.length; i++)
            System.out.print(" " + args[i]);
        System.out.println("!");

            int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
            Arrays.sort(array);
            printArray("数组排序结果为", array);
            int index = Arrays.binarySearch(array, 2);
            System.out.println("元素 2  在第 " + index + " 个位置");
        }
        private static void printArray(String message, int array[]) {
            System.out.println(message + ": [length: " + array.length + "]");
            for (int i = 0; i < array.length; i++) {
                if(i != 0){
                    System.out.print(", ");
                }
                System.out.print(array[i]);
            }
            System.out.println();

        int [] x  = {1,3,9,5,21,10,20,3};
        Arrays.sort(x);
        for (int n =0;n< x.length;n++)
            System.out.println(x[n]);
        int [] x  = {1,3,9,5,21,10,20,3};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));

        String [] Hashi = {"-h","cruel","world"};
          if (Hashi.length==0 || Hashi[0].equals("-h"))
              System.out.print("Hello,");
          else if (Hashi[0].equals("-g"))
              System.out.print("Goodbye,");
          for(int i = 1;i<Hashi.length;i++)
              System.out.print(" "+Hashi[i]);
        System.out.println("!");

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        System.out.println(timestamp.getTime());
        LocalDate date = LocalDate.of(2022,12,02);
        LocalDate dateGoal = date.plusDays(180);
        System.out.println(dateGoal);*/

        System.out.println("当前时间: " + LocalDate.now());
    }
}
