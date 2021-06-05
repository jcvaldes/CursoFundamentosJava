public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean dato = false;
        System.out.println("dato = " + dato);

//        devuelve un objeto no se usa pero se transforma en primitivo
        boolean dato2 = Boolean.TRUE;
        System.out.println("dato2 = " + dato2);
        
        Boolean dato3 = true;
        System.out.println("dato3 = " + dato3);
        
        double d = 98765.43e-3; 
        float f = 1.2345e2f;
        
        dato = d < f;
        System.out.println("dato = " + dato);

    }
}
