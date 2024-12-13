public class ProblemList {
    // Se reprensenta un nodo 
    public static class ListaNodo {
        int val;
        ListaNodo next;

        ListaNodo(int val) {
            this.val = val;
        }
    }

    // Método para sumar la lista
    public static ListaNodo addTwoNumbers(ListaNodo l1, ListaNodo l2) {
        ListaNodo temporal = new ListaNodo(0); // Nodo temporal para construir la lista
        ListaNodo actual = temporal;
        int a = 0; 

        while (l1 != null || l2 != null || a != 0) {
            int suma = a;

            // Suma el valor del nodo de l1 si no es nulo
            if (l1 != null) {
                suma += l1.val;
                l1 = l1.next;
            }

            
            if (l2 != null) {
                suma += l2.val;
                l2 = l2.next;
            }

            a = suma / 10; 
            actual.next = new ListaNodo(suma % 10); // Crear un nuevo nodo 
            actual = actual.next; // Avanza al siguiente nodo
        }

        return temporal.next; // Retornar la lista enlazada 
    }

    // Método para imprimir una lista enlazada
    public static void printList(ListaNodo nodo) {
        while (nodo != null) {
            System.out.print(nodo.val + " "); // Imprime el valor del nodo 
            nodo = nodo.next;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
    
        ListaNodo l1 = new ListaNodo(0);
        l1.next = new ListaNodo(0);
        l1.next.next = new ListaNodo(0);

       
        ListaNodo l2 = new ListaNodo(0);
        l2.next = new ListaNodo(0);
        l2.next.next = new ListaNodo(0);

        // Suma las dos listas
        ListaNodo resultado = addTwoNumbers(l1, l2);

        // Imprime el resultado
        System.out.print("El resultado es: ");
        printList(resultado); 
    }
}
