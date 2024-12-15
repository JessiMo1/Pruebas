import java.util.Scanner;
import javax.swing.JOptionPane;

public class EliminarRepetidos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int elementos;
        //Nos ayudara a pedir la cantidad de numeros que deseemos
        elementos = Integer.parseInt(JOptionPane.showInputDialog("Coloca la cantidad de elementos: "));
        
        int[] a = new int[elementos];
        System.out.println("Coloca los elementos del arreglo: ");
        
        for (int i = 0; i < elementos; i++) {
            System.out.print((i + 1) + "  Coloca un número entero: ");
            a[i] = entrada.nextInt(); // Lee los numeros 
        }

        // Llama al método para eliminar duplicados
        int k = duplicados(a);

        // Imprime los elementos únicos
        System.out.println("\nElementos únicos: ");
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int duplicados(int[] elementos) {
        if (elementos.length == 0) return 0;

        // variable para colocar los elementos que se considera como unicos
        int k = 1;

        // Recorre el arreglo desde el segundo elemento
        for (int i = 1; i < elementos.length; i++) {
            // Si se encuentra un elemento diferente del anterior
            if (elementos[i] != elementos[i - 1]) {
                elementos[k] = elementos[i]; // Coloca el elemento en la posicion de k 
                k++;
            }
        }
        return k; 
    }
}
