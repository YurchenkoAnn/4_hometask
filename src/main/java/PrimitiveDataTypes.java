public class PrimitiveDataTypes {

    public static void main (String[] args) {

        byte byteValue = 10; //(-128 to +127)
        short shortValue = 30001; //(-32 768 to +32 767);
        int intValue = 147_483_647; //int (-2 147 483 648 to +2 147 483 647 )
        long longValue = -7_233_371_036_854_775_808L;  //(-9 223 372 036 854 775 808 to +9 223 372 036 854 775 807)
        float floatValue = 300F; //(1.40e-45 to 3.40e+38)
        double doubleValue = 13.14; //(4.9e-324 to 1.8e+308)
        char charValue = 'a'; //(min «\u0000» (or 0) max  «\uffff» (or 65535 inclusive))
        boolean booleanValue = true; //(can be true or false.)

        System.out.println("Example of byte: " + byteValue);
        System.out.println("Example of short: " + shortValue);
        System.out.println("Example of int: " + intValue);
        System.out.println("Example of long: " + longValue);
        System.out.println("Example of float: " + floatValue);
        System.out.println("Example of double: " + doubleValue);
        System.out.println("Example of char: " + charValue);
        System.out.println("Example of boolean: " + booleanValue);
        System.out.println();

        int a = 1;
        int b = 4;
        double c = 56;
        double d = 73;
        int result = ++a;
        double result2 = d--;
        System.out.println(a + b);
        System.out.println(b - a);
        System.out.println(c + d);
        System.out.println(d - c);
        System.out.println(a * c);
        System.out.println(d / b);
        System.out.println(result);
        System.out.println(result2);
        System.out.println();


        int intMax = 2_147_483_647;
        System.out.println(intMax + 1);


        short shortMin = -32768;
        System.out.println(shortMin - 1);


        long longMax = 9_223_372_036_854_775_807L;
        System.out.println(longMax + 1);
        System.out.println();

        int edge = 3;
        if
        (edge <= 0) {
            System.out.println("Это круг ");
        } else if (edge == 3) {
            System.out.println("Это Треугольник");
        } else {
            System.out.println("Это другая фигура");
        }
    }
}