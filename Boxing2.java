public class Boxing {
    public static void main(String[] args) {
        
        Integer boxedInt = Integer.valueOf(10);
        Double boxedDouble = Double.valueOf(20.5);
        Character boxedChar = Character.valueOf('A');
        Boolean boxedBoolean = Boolean.valueOf(true);
        Float boxedFloat = Float.valueOf(30.5f);

        
        int unboxedInt = boxedInt.intValue();
        double unboxedDouble = boxedDouble.doubleValue();
        char unboxedChar = boxedChar.charValue();
        boolean unboxedBoolean = boxedBoolean.booleanValue();
        float unboxedFloat = boxedFloat.floatValue();

        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Boxed Double: " + boxedDouble);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Boxed Character: " + boxedChar);
        System.out.println("Unboxed Character: " + unboxedChar);
        System.out.println("Boxed Boolean: " + boxedBoolean);
        System.out.println("Unboxed Boolean: " + unboxedBoolean);
        System.out.println("Boxed Float: " + boxedFloat);
        System.out.println("Unboxed Float: " + unboxedFloat);
    }
}

/*Output:
Boxed Integer: 10
Unboxed Integer: 10
Boxed Double: 20.5
Unboxed Double: 20.5
Boxed Character: A
Unboxed Character: A
Boxed Boolean: true
Unboxed Boolean: true
Boxed Float: 30.5
Unboxed Float: 30.5
*/
