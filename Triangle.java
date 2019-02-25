import java.lang.Math;

public class Triangle{

  private double x1; //A
  private double y1;
  private double x2; //B
  private double y2;
  private double x3; //C
  private double y3;

  public Triangle(){
    x1 = -3;
    y1 = 0;
    x2 = 3;
    y2 = 0;
    x3 = 0;
    y3 = 4;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.x3 = x3;
    this.y3 = y3;
  }

  public void setX1(double x1){
    this.x1 = x1;
  }

  public void setY1(double y1){
    this.y1 = y1;
  }

  public void setX2(double x2){
    this.x2 = x2;
  }

  public void setY2(double y2){
    this.y2 = y2;
  }

  public void setX3(double x3){
    this.x3 = x3;
  }

  public void setY3(double y3){
    this.y3 = y3;
  }

  public double getX1(double x1){
    this.x1 = x1;
  }

  public double getY1(double y1){
    this.y1 = y1;
  }

  public double getX2(double x2){
    this.x2 = x2;
  }

  public double getY2(double y2){
    this.y2 = y2;
  }

  public double getX3(double x3){
    this.x3 = x3;
  }

  public double getY3(double y3){
    this.y3 = y3;
  }

  public static double area() {

    x1 = triangulo.setX1();
    x2 = triangulo.setX2();
    x3 = triangulo.setX3();
    y1 = triangulo.setY1();
    y2 = triangulo.setY2();
    y3 = triangulo.setY3();

    double ab = Math.sqrt(Math.pow((x2 - x1),2) +  Math.pow((y2 - y1),2));
    double bc = Math.sqrt(Math.pow((x3 - x2),2) +  Math.pow((y3 - y2),2));
    double ac = Math.sqrt(Math.pow((x3 - x1),2) +  Math.pow((y3 - y1),2));

    double s = (ab + bc + ac) / 2;

    double area_final = Math.sqrt((s)*(s-ab)*(s-bc)*(s-ac));

    return area_final;
  }


  public static void main(String[] args) {
    Triangle triangulo = new Triangle(1,2,3,4,5,6);

    System.out.println("El resultado del area del triangulo es: " + area() + " u^2");
  }
}




/*

  public static double area(double x1, double y1, double x2, double y2, double x3, double y3) {

    double ab = Math.sqrt(Math.pow((x2 - x1),2) +  Math.pow((y2 - y1),2));
    double bc = Math.sqrt(Math.pow((x3 - x2),2) +  Math.pow((y3 - y2),2));
    double ac = Math.sqrt(Math.pow((x3 - x1),2) +  Math.pow((y3 - y1),2));

    double s = (ab + bc + ac) / 2;

    double area_final = Math.sqrt((s)*(s-ab)*(s-bc)*(s-ac));

    return area_final;
  }

  public static void main(String[] args){
    System.out.println("El resultado del area del triangulo es: " + area(-3,0,3,0,0,4) + " u^2");
  }
}
*/
