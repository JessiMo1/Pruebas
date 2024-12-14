import java.util.*;
public class Letras {
    public static int busqueda(String s){
        Set<Character> set  = new  HashSet<>();
        int maxl = 0;
        int inicio = 0;
         for (int fin = 0; fin < s.length(); fin++){
            char  caracterFin = s.charAt(fin);

            while (set.contains(caracterFin)){
                set.remove(s.charAt(inicio));
                inicio++;
            }
            set.add(caracterFin);
            maxl = Math. max(maxl, fin - inicio + 1);


         }
         return maxl;


    }
    public static void main(String[] args) {
        System.out.println(busqueda("abcabcbb"));
        System.out.println(busqueda("bbbbb"));
        System.out.println(busqueda("pwwkew"));
    }
    
}
