public class App {
    public static void main(String[] args) throws Exception {
        //tipoVariable nombreVariable = valorVariable;
        int[]numeros = {10,0,-5,5,15,2};
        //printArray(numeros); //Imprimo

        System.out.println("Estudiante: Martin Amaya");
        System.out.println("Metodo Ordenado");
        
        
        
        //bubblesort(numeros);
        //printArray(numeros);
        //CREO LA CLASE SORTBUBBLE
        //CREAR LA CLASE == INSTANCIAR LA CLASE
        //SortBubble claseSortBubble = new SortBubble();
        //claseSortBubble.printArray(numeros); //Imprime
        //claseSortBubble.sortBubble(numeros); //ORDENA
        //System.out.println("Ordenado");
        //claseSortBubble.printArray(numeros);//Imprime

        //claseSortBubble.sortBubbleAvzAscendente(numeros);
        //claseSortBubble.printArray(numeros); //Imprime

        //claseSortBubble.sortBubbleAvzDescendente(numeros);
        //claseSortBubble.printArray(numeros);

        //Selection
        SortSelection claseSortSelection = new SortSelection();
        System.out.println("Metodo Seleccion");
        System.out.println("Original");
        claseSortSelection.printArray(numeros);
        claseSortSelection.SortAscendente(numeros);
        System.out.println("Ordenado Ascendente: ");
        claseSortSelection.printArray(numeros);
        System.out.println("Ordenado Descendente: ");
        claseSortSelection.SortDescendente(numeros);
        claseSortSelection.printArray(numeros);
    }    
}

