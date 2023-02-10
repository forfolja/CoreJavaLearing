import java.util.*;
public class LinkedListTest
{
    public static void main(String[] args)
    {
        var a = new LinkedList<String>();
        a.add("Ame");
        a.add("NothingtoSay");
        a.add("Faith_bian");
        a.add("y");

        var b = new LinkedList<String>();
        b.add("XinQ");
        b.add("y");
        b.add("xiao8");
        b.add("forfolja");
        b.add("Faith_bian");

     /*   ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while(bIter.hasNext())
        {
            if(aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println(a);

        bIter = b.iterator();
        while (bIter.hasNext())
        {
            bIter.next();
            if(bIter.hasNext())
            {
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);

      */
        a.removeAll(b);
        System.out.println(a);
    }
}
