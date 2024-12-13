public class ProblemList {

    public ListNode nuevo(int val) {
      ListNode nodo = new ListNode(val); //Crea un valor 
      return nodo; //retorna el nodo que se creo 
  }

  public ListNode insertar(ListNode lista, int val) {
      ListNode newListNode = nuevo(val); //crea un nuevo nodo 

      if (lista == null) { //Si la  lista esta vacia, el nodo se converte en el primero 
          lista = newListNode;
      } else {
          ListNode actual = lista;
          while (actual.next != null) {
              actual = actual.next;
          }
          actual.next = newListNode;//Enlazamos el nuevo nodo
      }

      return lista;// Se devolvera la lista actualizada
  }
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode temporal = null; 
      int a = 0;

      // bucle que hara recorrido a ambas listas mientras haya elementos 
      while (l1 != null || l2 != null) {
          int sum = a;

          
          if (l1 != null) {
              sum += l1.val;
              l1 = l1.next;
          }

          
          if (l2 != null) {
              sum += l2.val;
              l2 = l2.next;
          }

          
          a = sum / 10;

         
          temporal = insertar(temporal, sum % 10);
      }

        if (a > 0) {
          temporal = insertar(temporal, a);
      }

      return temporal;
  }

      

}
