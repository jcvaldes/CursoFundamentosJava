import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScannerTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero entero");
//        String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error debe ingresar numero entero");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String numeroBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String numeroOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String numeroHexa = "numero hexa de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = numeroBinario;
        mensaje += "\n" + numeroOctal;
        mensaje += "\n" + numeroHexa;


        System.out.println(mensaje);
    }
}
