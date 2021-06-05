public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola Mundo";
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;
        System.out.println("numero = " + numero);

        boolean valor = true;
        if (valor) {
            System.out.println("valor = " + valor);
        }
        // el valor influye en el tipo de dato de forma dinamica
        var numero3 = 15;
        String nombre = "Juan";
        System.out.println("nombre = " + nombre);

        int edadPersona = 30;
        System.out.println("edadPersona = " + edadPersona);

    }
}
