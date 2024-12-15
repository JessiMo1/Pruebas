import java.util.*;
public class Validacion {
    public static void main(String[] args) {
    System.out.println("Ingresa los signos *(),{},[]*");
     Scanner x = new Scanner(System.in);
     String cadena = x.next();

     if (valido(cadena)) {
        System.out.println("True");
    } else {
        System.out.println("False");
    }
   
    }
    public static boolean valido(String cadena){
        int i = 0;
     Stack<Character> pila = new Stack<>();
      
         while ( i < cadena.length()){
            char c = cadena.charAt(i);
        if(c =='(' || c==  '{' ||c== '['){
            pila.push(c);
        }
        
        else{
            if (c == ')' && (!pila.isEmpty() &&   pila.pop() != '(' ))
                return false;
            else if (c == '}' && (!pila.isEmpty() &&   pila.pop() != '{' )){
                return false;
            } else if (c == ']' && (!pila.isEmpty() &&   pila.pop() != '[' )){
                return false;
            }
            
        }
            
        i++;
     }

     return pila.isEmpty();
    
        
    }
}    

