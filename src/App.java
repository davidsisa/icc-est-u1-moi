
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("***** Metodo de Ordenamiento *****");
        OrdenarSort ordenar = new OrdenarSort ();
        int[] array1 = {10,5,8,2,0};
        System.out.println("Cambiar Argumento para alternar el orden: ");
        int[] arrayOrd = ordenar.sortBySeleccion(array1,true);
        System.out.println(" - Arreglo Ordenado: ");
        ordenar.printArreglo(arrayOrd);
    }
}
