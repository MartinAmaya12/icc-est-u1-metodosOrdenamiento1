public class App {
    public static void main(String[] args) throws Exception {
        //tipoVariable nombreVariable = valorVariable;
        int[]numeros = {10,0,-5,5,15,2};
        printArray(numeros);
        System.out.println("Metodo ordenado");


        SortBubble claseSortBubble = new SortBubble();

        claseSortBubble.sortAscendente(numeros);
        claseSortBubble.printArray(numeros);

        claseSortBubble.sortDescendente(numeros);
        claseSortBubble.printArray(numeros);
    }
        
    public static void bubblesort(int[] numeros){
    int numerosSize = numeros.length;
    int preguntaCondicion = 0;

    for(int i = 0; i < numerosSize; i++){
        for(int j = i+1; j<numerosSize; j++){
            preguntaCondicion++;
            System.out.println("Pregunto" + preguntaCondicion);
            if(numeros[i]>numeros[j]){
                int temp = numeros[j];
                numeros[j]=numeros[i];
                numeros[i] = temp;
            }
        }
    }
    }

   public static void printArray(int[] numeros){
        System.out.println("[");
        for (int i = 0; i < numeros.length; i++) {

            if (i == numeros.length - 1) {
                System.out.println(numeros[i]);
            } else {
                System.out.print(numeros[i]+ ", ");
            }
            
            
        }
        System.out.println("]");
    }
}
