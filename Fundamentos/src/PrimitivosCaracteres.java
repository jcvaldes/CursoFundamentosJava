public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter =  '\u0040'; //@
        System.out.println("caracter = " + caracter);
        char decimal = 64;
        System.out.println("decimal = " + decimal);

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);

        System.out.println(caracter == decimal);
        System.out.println("tipo char corresponde en byte a: " + Character.BYTES);
        System.out.println("tipo char corresponde en bites a: " + Character.SIZE);
        System.out.println("valor min del char: " + Character.MIN_VALUE);
        System.out.println("valor max del char: " + Character.MAX_VALUE);

        char espacio = '\u0020';
        char espacioSimb = ' ';
        char retroceso = '\b';
        System.out.println("retroceso =" + retroceso + retroceso);

        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        System.out.println("avance de linea = " + System.getProperty("line.separator") + Character.BYTES);
        System.out.println("avance de linea = " + System.lineSeparator() + Character.BYTES);

    }
}
