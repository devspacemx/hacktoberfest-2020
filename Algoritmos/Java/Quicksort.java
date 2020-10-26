//Método de ordenamiento de arreglos con variables enteras.


//Parámetros: Arreglo de enteros, primer índice del arreglo, últim índice del arreglo.
public static void quicksort(int A[], int izq, int der) {

    // pivote se inicializa con el primer valor del arreglo
    int pivote=A[izq]; 
    // i es inicializado con el valor de izq.
    int i=izq;
    // j es inicializado con el valor de der.         
    int j=der;
    //Se declara una variable aux sin inicializar.
    int aux;
   
    //Ciclo que se realizará mientras que el valor de i sea menor que el valor de j
    while(i < j){ 
              
       //Ciclo que se realizará mientras el valor de A en la posición i sea menor o igual al valor de
       //pivote y este sea menor a j. 
       while(A[i] <= pivote && i < j){
           //Se incrementa el valor de i en uno.
           i++;
       } 

       //Ciclo que se realizará mientras el valor de A en la posición j sea mayor a el valor de pivote.
       while(A[j] > pivote){
           //Se decrementa el valor de j en uno.
            j--;   
       }
       
       //Condición sobre si el valor de i es menor al valor de j.
       if (i < j) {         
           //aux toma el valor de A en la posición i.                
           aux= A[i];                
           //A en la posición i toma el valor de A en la posición j.      
           A[i]=A[j];
           //A en la posición j toma el valor de aux.
           A[j]=aux;
       }
     }
     
     //Ahora el valor que había en A en la posición izq será el valor de A en la posición j
     //Por otro lado, el valor de A en la posición j se le asignará el valor de pivote.
     A[izq]=A[j];                                         
     A[j]=pivote;      
     
     //El valor menor del arreglo quedó a la izquierda y el valor mayor a la derecha.


     //El arreglo es dividido en dos subarreglos de igual tamaño.

     //Si el valor de izq es menor que el valor de j-1, se efecturará el método nuevamente, pero con otros parámetros.
     if(izq < j-1)
        quicksort(A,izq,j-1);         // Ayuda a ordenar el subarreglo izquierdo.

    //De igual manera, si el valor de j+1 es menor que el valor de der, se efectuará nuevamente el método.
     if(j+1 < der)
        quicksort(A,j+1,der);          // Ayuda a ordenar el subarreglo derecho.
  }