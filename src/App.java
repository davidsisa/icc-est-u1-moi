public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("***** Metodo de Ordenamiento *****");
        OrdenarSort ordenar = new OrdenarSort ();
        int[] array1 = {10,5,7,0};
        int[] arrayOrd = ordenar.sortBySeleccion(array1);
        System.out.println(" - Arreglo Ordenado: ");
        ordenar.printArreglo(arrayOrd);
    }
}
