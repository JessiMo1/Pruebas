public class Busqueda {
    public int removeElement(int[] nums, int val) {
        int a = 0; //variable para almacenar 

        for (int h = 0; h < nums.length; h++) { 
            if (nums[h] != val) {
                nums[a] = nums[h]; //movera los elementos
                a++;
            }
        }

        return a; //retorna el tamaño 
    }
}
