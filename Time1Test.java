
public class Time1Test {

    public static void main(String[] args) {

        Time1 t1 = new Time1();
        Time1 t2 = new Time1(2);
        Time1 t3 = new Time1(21, 34);
        Time1 t4 = new Time1(12, 25, 42);
        Time1 t5 = new Time1(t4);

        System.out.println("Constructed with: ");
        System.out.println("t1: all arguments defaulted");
        System.out.printf("   %s\n", t1.toUniversalString());
        System.out.printf("   %s\n", t1.toString());
        System.out.println("t2: hour specified; minute and second defaulted");
        System.out.printf("   %s\n", t2.toUniversalString());
        System.out.printf("   %s\n", t2.toString());
        System.out.println("t3: hour and minute specified; second defaulted");
        System.out.printf("   %s\n", t3.toUniversalString());
        System.out.printf("   %s\n", t3.toString());
        System.out.println("t4: hour, minute and second specified");
        System.out.printf("   %s\n", t4.toUniversalString());
        System.out.printf("   %s\n", t4.toString());
        System.out.println("t5: Time1 object t4 specified");
        System.out.printf("   %s\n", t5.toUniversalString());
        System.out.printf("   %s\n", t5.toString());

        try{
            Time1 t6 = new Time1(27, 74, 99);
        }
        catch (IllegalArgumentException e){
            System.out.printf("\nException while initializing t6: %s\n",
                    e.getMessage());
        }
    }
}
