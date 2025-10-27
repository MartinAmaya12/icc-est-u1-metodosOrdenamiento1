public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estudiante: Martin Amaya");
        System.out.println("Metodo Ordenado");

        SortInsertion sortCadena = new SortInsertion();

        // ==========================
        // ARREGLO DE NÚMEROS ENTEROS
        // ==========================
        System.out.println("\nMetodo Insertion Sort:");
        int[] numeros = {10, 0, -5, 5, 15, 2};
        System.out.println("Original:");
        sortCadena.printArray(numeros);
        sortCadena.SortOrdenado(numeros, false);
        System.out.println("Ordenado:");
        sortCadena.printArray(numeros);

        // ==================
        // ARREGLO DE CADENAS
        // ==================
        System.out.println("\nArreglo de cadena");
        String[] nombres = {"Pedro", "Ana", "Maria", "Luis", "Juan"};
        System.out.println("Arreglo Original");
        sortCadena.printArray(nombres);
        sortCadena.insertionSortName(nombres);
        System.out.println("Arreglo Ordenado");
        sortCadena.printArray(nombres);

        // =================================
        // ARREGLO DE PERSONAS (POR NOMBRES)
        // =================================
        System.out.println("\nOrdenamiento de nombres");
        Persona[] personas1 = {
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28)
        };
        System.out.println("Arrays de personas originales");
        sortCadena.printArray(personas1);
        sortCadena.insertionSortByName(personas1);
        System.out.println("Arrays de personas ordenados");
        sortCadena.printArray(personas1);

        // =================================
        // ARREGLO DE PERSONAS (POR EDADES)
        // =================================
        System.out.println("\nOrdenamiento de Nombres y Edades");
        Persona[] personas2 = {
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28)
        };
        System.out.println("Arrays de Edades originales");
        sortCadena.printArray(personas2);
        sortCadena.insertionSortByAge(personas2);
        System.out.println("Arrays de Edades ordenados");
        sortCadena.printArray(personas2);
    }
}

