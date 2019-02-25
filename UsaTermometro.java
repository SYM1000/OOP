Public class UsaTermometro{
  public static void main(String[] args){
    Termometro gd = new Termometro();
    Termometro ny = new Termometro(10);
    System.out.println("La temperatura en Guadalajara es: " + gda.getTemp());
    System.out.println("La temperatura en Nueva York es: " + ny.getTemp());

    gda.setTemp(28);
    ny.setTemp(8);

    System.out.println("La temperatura en Guadalajara es: " + gda.getTemp());
    System.out.println("La temperatura en Nueva York es: " + ny.getTemp());
  }
}

//this tiene 2 contextos en java
