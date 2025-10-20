public class SortBubble {
    
    //CONSTRUCTOR
    public SortBubble(){
System.out.println("Se creo mi clase SortBubble");        
    }

public void sortBubble(int[] numeros){
    int numerosSize = numeros.length;
    int preguntaCondiction = 0;
    int numeroCambios = 0;
    //10,0,-5,5,15,2

    for(int i = 0; i < numerosSize; i++){
        for(int j = i+1; j<numerosSize; j++){
            preguntaCondiction++;
            System.out.println("Pregunto" + preguntaCondiction);
            if(numeros[i]>numeros[j]){
                    int temp = numeros[j];
                    numeros[j]=numeros[i];
                    numeros[i] = temp;
                    numeroCambios++;
                }
            }

        }
        System.out.println("Preguntas= " + preguntaCondiction);
        System.out.println("Cambios= " + numeroCambios);
        
    }
    
    public void sortAscendente(int numeros[]){

        int contCambios = 0;
        int contPreguntas = 0;

        for (int i = 0; i < numeros.length - 1; i++) {
            boolean hayCambio = false; //tecnica swapped
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                contPreguntas++;
                //El bubble sort normal if(numeros[i]>numeros[j+1])
                if(numeros[j]>numeros[j+1]){
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                    contCambios++;
                    hayCambio = true;
                }
            }
            if(!hayCambio){
                break;
            }
        }
        System.out.println("Preguntas= " + contPreguntas);
        System.out.println("Cambios= " + contCambios);
    }
    
    public void sortDescendente(int numeros[]){

        int contCambios = 0;
        int contPreguntas = 0;

        for (int i = 0; i < numeros.length - 1; i++) {
            boolean hayCambio = false; //tecnica swapped
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                contPreguntas++;
                //El bubble sort normal if(numeros[i]>numeros[j+1])
                if(numeros[j]>numeros[j+1]){
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                    contCambios++;
                    hayCambio = true;
                }
            }
            if(!hayCambio){
                break;
            }
        }
        System.out.println("Preguntas= " + contPreguntas);
        System.out.println("Cambios= " + contCambios);
    } 
    
    public void printArray(int[] numeros) {
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