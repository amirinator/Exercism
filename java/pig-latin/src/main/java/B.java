class A {
    int add(int i, int j){
        return i+j;
    }
}
public class B extends A{
    public static void main(String argv[]) {
        short s = 9;

        try {

            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            System.out.println(b);
            double d = f1.doubleValue();
            System.out.println(d);
            System.out.println(x+b+d);
        } catch(NumberFormatException e) {
            System.out.println("bad number");
        }

    }
}

