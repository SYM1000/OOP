import java.lang.Math;
public class Perimetro{

    int n;
    double arreglox [];
    double arregloy [];

    public static double perimeterOfPolygon(int n, double arreglox [] , double arregloy []){
        double lado;
        double peri = 0;

        for(int i = 0; i <= n-1; i++){
            if (i == n-1){
                lado = Math.sqrt(Math.pow(arreglox[0]- arreglox[i], 2) + Math.pow(arregloy[0]- arregloy[i], 2));
            }else{
                lado = Math.sqrt(Math.pow(arreglox[i+1]- arreglox[i], 2) + Math.pow(arregloy[i+1]- arregloy[i], 2));     
            }
            peri += lado;
        }
        return peri;
    }

    public static void main(String[] args) {
        int n = 4; //Numero de vertices del poligono
        double arreglox [] = {0,3,0,3}; //cordenadas en x de cada vertice del poligono
        double arregloy [] = {0,0,4,4}; //Cordenadas en y de cada vertice del poligono

        System.out.println(perimeterOfPolygon(n, arreglox, arregloy));
    }

}
