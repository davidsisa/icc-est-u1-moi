public class OrdenarSort {
    public int[] sortBySeleccion(int[] array,boolean orden){
        int tamanio = array.length; 
        //recorrer arreglo
        for (int i = 0; i < tamanio; i++) {
            int indice = i;
            for (int j = i+1; j < tamanio; j++) {
                if (orden == true){
                    if (array[j] < array[indice]){
                        indice = j;
                    }
                } else {
                    if (array[j] > array[indice]){
                        indice = j;
                    }
                }
            }
            //intercambiar del indice encontrado
            //por el primero
            int aux = array[indice];
            array[indice] = array [i];
            array[i] = aux;
        }
        return array;
    }
    public void printArreglo (int[] array){
        for (Object elem : array) {
            System.out.print(" "+ elem);
        }
    }
}
