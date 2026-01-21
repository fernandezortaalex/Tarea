package Entorno_de_desarrollo.Tema1.apuntes;

public class ejercicio1 {
    
    /**
     * 
     * @param cadenaTexto
     * @return
     */
    public static String revertirCadena(String cadenaTexto){
        int cadena = cadenaTexto.length();
        String cadenaInvertida = "";
        for (int i = 1; i <= cadena; i++){
            cadenaInvertida += cadenaTexto.charAt(cadena - i);
        }
        return cadenaInvertida;
    }
    public static void main(String[] args) {
        System.out.println(revertirCadena("Hola"));
    }
}