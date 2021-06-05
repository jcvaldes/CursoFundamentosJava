public class PrimitivosFloat {
    static float varFloat;
    public static void main(String[] args) {
        // Punto flotante
        float realFloat =  1.5e3f; // 2120F;
        System.out.println("realFloat = " + realFloat);
        realFloat =  1.5e-3f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en byte a: " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a: " + Float.SIZE);
        System.out.println("valor min del float: " + Float.MIN_VALUE);
        System.out.println("valor max del float: " + Float.MAX_VALUE);

        double realDouble =  3.40282353E9; // 2120F;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde en byte a: " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a: " + Double.SIZE);
        System.out.println("valor min del double: " + Double.MIN_VALUE);
        System.out.println("valor max del double: " + Double.MAX_VALUE);


    }
}
