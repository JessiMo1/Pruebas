import java.util.*;
public class Letras {
    public static void busqueda(String s){
        Set<Character> set  = new  HashSet<>(); //Ayudara a buscar los caracteres
        int maxl = 0; //el tamaño de la longitud 
        int inicio = 0;
        String longitudPalabra= ""; //Almacenará el palabra mas larga

         for (int fin = 0; fin < s.length(); fin++){
            char  caracterFin = s.charAt(fin);

            while (set.contains(caracterFin)){//si la letra ya se encuntra en conjunto esto ayudara al moverse al inicio
                set.remove(s.charAt(inicio));
                inicio++;
            }
            //Agregara el carácter que tenemos actual
            set.add(caracterFin);
            //Ayudará a calcular la longitud del substring
            int length = fin - inicio + 1;
            if (length > maxl) {
                maxl = length;
                longitudPalabra = s.substring(inicio, fin + 1); 
            }


         }
         System.out.println("El resultado es: \"" + longitudPalabra + "\", con una longitud de: " + maxl );


    }
    public static void main(String[] args) {
        busqueda("abcabcbb");
        busqueda("bbbbb");
       busqueda("pwwkew");
    }
    
}
