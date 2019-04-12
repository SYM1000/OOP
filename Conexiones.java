import java.util.Arrays;

public class Conexiones{

    //Metodo para obtener los nodos con los que se conecta un nodo
    public static int [] findNodes(int matriz [][], int n){

        int[] nodes = new int [0];
        int[] fila = new int [0];
        int[] columna = new int [0];
        int[] valores = new int [0];

        for (int i = 0; i < matriz.length; i ++){
            for (int j = 0; j < matriz[i].length; j ++){

                int valor = matriz[i][j];
                if(valor != 0){
                    fila = Arrays.copyOf(fila, fila.length + 1);
                    fila[fila.length - 1] = i;

                    columna = Arrays.copyOf(columna, columna.length + 1);
                    columna[columna.length - 1] = j;

                    valores = Arrays.copyOf(valores, valores.length + 1);
                    valores[valores.length - 1] = valor;
                } else {
                    continue;
                }

            }
        }
        for (int i = 0; i < fila.length; i++){
            if(fila[i] == (n-1)){
                nodes = Arrays.copyOf(nodes, nodes.length + 1);
                nodes[nodes.length - 1] = (columna[i] + 1);
            }
        }
        System.out.println("Los nodos que se conectan con el nodo " + n + " son : " );
        return nodes;
    }


    public static void main(String[] args) {
        int matriz [][] = {{0,1,0},{1,0,1},{0,1,0}};
        System.out.println(Arrays.toString(findNodes(matriz, 3)));
        

    }

}