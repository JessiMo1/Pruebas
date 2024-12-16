import java.util.Scanner;
import javax.swing.JOptionPane;

public class Busqueda {
    public static void main(String[] args) {
        String elementos, needle;
        //Pedira la palabra que queremos 
        elementos = JOptionPane.showInputDialog( "Ingresa la palabra ");
    
        //pedira la palabra que queremos que busque
        needle = JOptionPane.showInputDialog( "Ingresa la palabra ");
     
        //Busca la palabra 
        int a = elementos.indexOf(needle);

        //Mostrara el resultado 
        if(a !=-1){
            JOptionPane.showMessageDialog(null, "Palabra encontrada: " + a ,
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "La palabra no está: " + a, 
                    "Resultado", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
