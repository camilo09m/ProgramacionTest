

public class palidromos {
    public static void main (String []args){
        String[] cadenas = { "La ruta natural", "Esto no es", "Hola", "Sol", "Ana", "Oro", "Oso",};
        for (String cadena : cadenas) {
            System.out.println("¿'" + cadena + "' es palíndromo? " + esPalindromo(cadena));
        }

    }

    public static boolean esPalindromo(String cadena) {

        cadena = cadena.toLowerCase().replace(" ", "").replace(".", "").replace(",", "");

        String invertida = new StringBuilder(cadena).reverse().toString();
        return invertida.equals(cadena);
    }

}
