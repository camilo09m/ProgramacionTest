

public class palidromos {
    public static void main (String []args){
        String[] cadenas = { "La ruta natural", "Esto no es", "Hola", "", "Ana", "Oro", "Oso",};
        imprimirCadena(cadenas);

    }

    public static boolean esPalindromo(String cadena) {

        cadena = cadena.toLowerCase().replace(" ", "").replace(".", "").replace(",", "");

        String invertida = new StringBuilder(cadena).reverse().toString();
        return invertida.equals(cadena);
    }
    public static void verificacionString(){


    }
    public static void menu() {
        System.out.println(".........{Ingresa Una Opccion }........");
        System.out.println("[1] opcion 1");
        System.out.println("[2] opcion 2");
        System.out.println("[3] opcion 3");
        System.out.println("[4] opcion 4");

    }
    public static void imprimirCadena(String [] cadenas){
        for (String cadena : cadenas) {

            if (cadena == "") {
                System.out.println("Cadena vacia");
            }else{
                System.out.println("¿'" + cadena + "' es palíndromo? " + esPalindromo(cadena));

            }

        }

    }

}
