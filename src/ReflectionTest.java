import java.util.*;
import java.lang.reflect.*;

/**
 * 当前程序主要用于实践反射的相关方法调用；
 * @version 1.0
 * @author forfolja
 */
public class ReflectionTest {
    public static void main(String[] args)
    throws ReflectiveOperationException {
        String name;
        if(args.length > 0) name = args[0];
        else
        {
           var in = new Scanner(System.in);
           System.out.println("Enter class name (e.g. java.util.Date):");
           name = in.next();
        }

        Class c1 = Class.forName(name);
        String modifiers = Modifier.toString(c1.getModifiers());
        if(modifiers.length() > 0)
            System.out.println(modifiers+" ");
        if(c1.isSealed())
            System.out.print("sealed ");
        if(c1.isEnum())
            System.out.println("enum "+name);
        else if(c1.isRecord())
            System.out.println("record "+name);
        else if(c1.isInterface())
            System.out.println("Interface "+name);
        else
            System.out.println("class "+name);
        Class superc1 = c1.getSuperclass();
        if(superc1 != null && superc1 != Object.class)
            System.out.println(" extends "+superc1.getName());
        printInterfaces(c1);
        printPermittedSubclasses(c1);

        System.out.print("\n{\n");
        printConstructors(c1);
        System.out.println();
        printMethods(c1);
        System.out.println("}");
        printFields(c1);
        System.out.println("}");
    }

    public static void printConstructors(Class c1){
        Constructor [] constructors = c1.getDeclaredConstructors();
        for (Constructor c :constructors){
            String name = c.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(c.getModifiers());
            if(modifiers.length() > 0 )
                System.out.print(modifiers+" ");
            System.out.print(name+"(");

            Class [] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++){
                if (j > 0) System.out.print(",");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printMethods(Class c1){

        Method[] methods = c1.getDeclaredMethods();

        for(Method m :methods){
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print(" ");
            String modifiers = Modifier.toString(m.getModifiers());

            if(modifiers.length() > 0) System.out.print(modifiers+" ");
            System.out.print(retType.getName() + " " + name + "(");
            Class[] paramTypes = m.getParameterTypes();
            for(int j = 0; j < paramTypes.length; j++){
                if (j > 0) System.out.print(" ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }
    public static void printFields(Class c1){
        Field[] fields = c1.getDeclaredFields();
        for (Field f : fields){
            Class type = f.getType();
            String name = f.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(f.getModifiers());

            if(modifiers.length() > 0) System.out.print(modifiers+" ");
            System.out.println(type.getName() + " " + name + ";");
        }
    }
    public static void printPermittedSubclasses(Class c1){
        if (c1.isSealed()){
            Class<?>[] permittedSubclasses = c1.getPermittedSubclasses();
            for(int i = 0; i < permittedSubclasses.length; i++){
                if(i == 0)
                    System.out.println("permits");
                else
                    System.out.println(",");
                System.out.print(permittedSubclasses[i].getName());
            }
        }
    }
    public static void printInterfaces(Class c1){
        Class<?>[] interfaces = c1.getInterfaces();
        for(int i = 0;i < interfaces.length;i++){
            if (i == 0)
                System.out.print(c1.isInterface()?"extends":"implements");
            else
                System.out.print(",");
            System.out.print(interfaces[i].getName());
        }
    }
}
