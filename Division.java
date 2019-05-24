 //Santiago Yeomans
//A01251000

import javax.swing.JOptionPane;

public class Division {
    public static int divisionEntera(int num, int den){
        return num/den;
    }

    //Tarea: Si ocurre alguna exeption volvera a pedir todos los datos, pero indicando cual fue el error
    public static void main(String[] args) {
        boolean var = true;
        while (var == true ) {
            var = false;
            try{
                int n = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
                int d = Integer.parseInt(JOptionPane.showInputDialog("Escribe otro numero"));
                int res = divisionEntera(n, d);
                JOptionPane.showMessageDialog(null, "El resultado de la divison entera de " + n + "/" + d +  " es " + res);
                } catch(ArithmeticException error){
                    JOptionPane.showMessageDialog(null, "El error es de tipo: " + error );
                    var = true;
                } catch(NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "El error es de tipo: " + error );
                    var = true;
                }
        }
    }
}