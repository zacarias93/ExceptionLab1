/**
 * Created by zaclee on 9/30/16.
 */
public class Calculator {

    public static int add(int a, int b) {
        return a+b;
    }

    public static int subtract(int a, int b) {
        return a-b;
    }

    public static int divide(int a, int b) throws ArithmeticException {

        if(b == 0) {
            throw new ArithmeticException("Can't divide by 0.");
        }
        return a/b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }


}
