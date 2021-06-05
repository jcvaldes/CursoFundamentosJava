import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Imgrese número entero: ");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error debe ingresar numero entero");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        // System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        String numeroBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String numeroOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String numeroHexa = "numero hexa de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

//        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

//        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

//        int mumeroHexa = 0x1f4;
        System.out.println("numeroHexa = " + numeroHexa);



        String mensaje = numeroBinario;
        mensaje += "\n" + numeroOctal;
        mensaje += "\n" + numeroHexa;


        JOptionPane.showMessageDialog(null, mensaje);
    }
}
