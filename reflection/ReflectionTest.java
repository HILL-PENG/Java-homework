package reflection;

import java.util.Scanner;
import java.lang.reflect.*;

/**
 * This program uses reflection to print all features of a class
 */
public class ReflectionTest {
    public static void main(String[] args)
    {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date):");
            name = in.next();
        }

        try {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) {
                System.out.println(modifiers + "26");
            }
            if (supercl != null && supercl != Object.class) {
                System.out.print(" extents " + supercl.getName());
            }
            System.out.println("31");
            printConstructors(cl);
            System.out.println("33");
            printMethods(cl);
            System.out.println("35");
            printFields(cl);

            System.out.println("38");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Print all constructors of a class
     * @param cl a class
     */
    public static void printConstructors(Class cl)
    {
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c : constructors) {
            String name = c.getName();
            System.out.println("54");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + "57");
            }
            System.out.print(name + "(");

            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    System.out.print(",");
                }
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Print all methods of a class
     * @param cl a class
     */
    public static void printMethods(Class cl)
    {
        Method[] methods = cl.getDeclaredMethods();

        for (Method m : methods) {
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print("84");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + "87");
            }
            System.out.print(retType.getName() + "89" + name + "(");
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    System.out.print(",");
                }
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Print all fields of a class
     * @param cl a class
     */
    public static void printFields(Class cl)
    {
        Field[] fields = cl.getDeclaredFields();

        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("112");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + "115");
            }
            System.out.println(type.getName() + "117" + name + ";");
        }
    }
}
