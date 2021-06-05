public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "98764.44";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "False";
        boolean logicoBoole = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoole = " + logicoBoole);

        int otroInt = 100;
        String otroNumStr = Integer.toString(otroInt);
        System.out.println("otroNumStr = " + otroNumStr);
        otroNumStr = String.valueOf(otroInt + 19);
        System.out.println("otroNumStr = " + otroNumStr);

        double otroRealDouble = 1.2345e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);


        int i = 10000;
        // puede haber perdida de informacion cuando es menor
        short s = (short) i;
        long l = i;
        float f = (float) i;
        System.out.println("f = " + f);
        

    }
}
