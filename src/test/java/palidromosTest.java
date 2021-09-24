import static org.junit.jupiter.api.Assertions.*;

class palidromosTest {

    @org.junit.jupiter.api.Test
    void esPalindromo0() {
        String cadena= "aca";
        assertEquals(true,palidromos.esPalindromo(cadena));
    }
    @org.junit.jupiter.api.Test
    void esPalindromo1(){


    }
    @org.junit.jupiter.api.Test
    void esPalindromo3() {
        String cadena= "aaabccbaaa";
        assertEquals(true,palidromos.esPalindromo(cadena));
    }
    @org.junit.jupiter.api.Test
    void esPalindromo4() {
        String cadena= "ahabccbaaa";
        assertEquals(false,palidromos.esPalindromo(cadena));
    }
}