public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("valor min del byte: " + Byte.MIN_VALUE);
        System.out.println("valor max del byte: " + Byte.MAX_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo Short corresponde en byte a: " + Short.BYTES);
        System.out.println("tipo Short corresponde en bites a: " + Short.SIZE);
        System.out.println("valor min del Short: " + Short.MIN_VALUE);
        System.out.println("valor max del Short: " + Short.MAX_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a: " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a: " + Integer.SIZE);
        System.out.println("valor min del int: " + Integer.MIN_VALUE);
        System.out.println("valor max del int: " + Integer.MAX_VALUE);

        long numeroLong = 2147483648L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a: " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a: " + Long.SIZE);
        System.out.println("valor min del long: " + Long.MIN_VALUE);
        System.out.println("valor max del long: " + Long.MAX_VALUE);


        var numeroVar = 127;


    }
}
