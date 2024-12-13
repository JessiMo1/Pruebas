public class ProblemList{
    public ListNode nuevo(int val){
        ListNode nodo = new ListNode(val);
        return nodo;
    }


    public ListNode  Insertar (ListNode lista, int val) {
        ListNode newListNode = Nodo(val);
        if (lista == null ){
            lista = newListNode;
        }else{
            ListNode actual = lista;
            while(actual.next != null){
                actual= actual.next;

            }
            actual= newListNode;
        }
        return lista;
    }
    public ListNode addTwoNumber(ListNode l1, ListNode l2){
        ListNode temporal = null; // Cabecera de la nueva lista
        int acarreo = 0;

        // Sumar hasta que ambas listas y el acarreo sean null o 0
        while (l1 != null || l2 != null || acarreo != 0) {
            int sum = acarreo;

            // Sumar el valor de l1 si no es null
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Sumar el valor de l2 si no es null
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Calcular el nuevo acarreo
            acarreo = sum / 10;

            // Insertar el dígito en la nueva lista resultante
            temporal = insercion(temporal, sum % 10);
        }

        return temporal;
    }


    }
