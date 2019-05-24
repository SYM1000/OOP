import javax.swing.JOptionPane;

public class Division {
    public static int divisionEntera(int num, int den){
        return num/den
    }


    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Escribe otro numero"));
        int res = divisionEntera(n, d);
        JOptionPane.showMessageDialog(null, "El resultado de la divison entera de " + n + "/" + d +  "es " + res);
    }



}