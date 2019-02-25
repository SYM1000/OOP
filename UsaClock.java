public class UsaClock{
  public static void main(String[] args) {
    Clock gda = new Clock();
    Clock tij = new Clock(10,0,0);
    Clock ny = new Clock(13,0,0);
    Clock dub = new Clock(22,0,0);

    System.out.println("Horas: " + gda.getHours());
    System.out.println("Minutos: " +  gda.getMinutes());
    System.out.println("Segundos: " + gda.getSeconds());

    gda.printTime();
    tij.printTime();
    ny.printTime();
    dub.printTime();

    gda.setTime(23,30,40);
    tij.setTime(21,59,30);
    ny.setTime(21,30,59);
    dub.setTime(23,59,59);

    gda.printTime();
    tij.printTime();
    ny.printTime();
    dub.printTime();

    gda.incrementHours();
    tij.incrementMinutes();
    ny.incrementSeconds();
    dub.incrementSeconds();

    gda.printTime();
    tij.printTime();
    ny.printTime();
    dub.printTime();

    System.out.println(gda.equals(tij));
    gda.setTime(11,1,30);
    Clock zap =  gda.getCopy();
    System.out.println(gda.equals(zap));
    zap.makeCopy(gda);
    System.out.println(gda.equals(zap));
    // En esta llamada this es gda y zap el objeto del parametro

    //Todos los metodos de una clase tienen que se llamandos por un objeto
  }
}
